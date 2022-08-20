package aop1;

import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;

public class Common {
	long starttime = System.currentTimeMillis();
	
	public void a() {
		System.out.println("===> a �޼ҵ�� �ٽɰ����� ���� ȣ�� :" + new Date(starttime));
	}
	
	public void b() {
		long endtime = System.currentTimeMillis();
		System.out.println("===> b �޼ҵ�� �ٽɰ����� ���� ȣ��(����ð�) :"+(endtime - starttime));
	}
	public void c(ProceedingJoinPoint joinpoint) {
	      try {
	      System.out.println
	      ("===>c�޼ҵ�--around ���� ����Դϴ�." );//before
	      Object returnValue = joinpoint.proceed();//�ٽɰ��ɸ޼ҵ� ����
	      if(returnValue != null)
	      System.out.println
	      ("===>c�޼ҵ�--around ���� ���ϰ�=" + returnValue);//after   
	      System.out.println
	      ("===>c�޼ҵ�--around ����  " 
	      +joinpoint.getTarget());//�ٽɰ��ɰ�ü
	      System.out.println
	      ("===>c�޼ҵ�--around ����  " 
	      +joinpoint.toLongString());//�ٽɰ��ɼ��ø޼ҵ弱��
	      
	      Object args[] = joinpoint.getArgs();//�ٽɰ��ɸ޼ҵ� �Ű������迭   
	      for(Object s : args) {
	      System.out.println
	      ("===>c�޼ҵ�--around ����  " +s);   
	      }
	      }catch(Throwable e) {
	      System.out.println(e);
	      }
	   }
}
