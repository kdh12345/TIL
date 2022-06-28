# Github 명령어
   - git init: 깃 초기화
   - git remote: 로컬 저장소에 원격 저장소를 등록, 조회, 삭제할 수 있는 명령어
      ex) git remote add <이름> <주소>
   - git commit -m "": 깃 변경사항 커밋 (로컬 -> 스테이지 영역)
   - git push origin master: 깃 변경사항 반영
   - git remote -v : 만든 파일 깃허브 연동 조회
   - git status : 깃허브 현재 상태 조회
       1. untracked : 버전기록이 없는 상태
       2. staged : 버전기록이 스테이징 영역에 올라옴
       3. commited : 레포지토리에 커밋 완료
   - git remote rm <이름> 또는 git remote remove  <이름> :  로컬과 원격 저장소의 연결을 끊는 것

# 분산 저장소 구분
   1. working Directory : 내가 작업하고 있는 실제 디렉토리
   2. Staging Area :  커밋으로 남기고 싶은 혹은 특정버전으로 관리하고 싶은 파일이 있는 곳
   3. Repository : 커밋들이 저장되는 곳

