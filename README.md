# REAL JAVA PROJECT
## KISS (Keep it short and simple)
간단하고 단순하게 만들자

### Path 클래스
* 경로를 정의할떄 .get() 메서드를 사용
~~~
final Path path = Paths.get(RESOURCE + "bank-data-simple.csv");
~~~
###Files 클래스
* readAllLines 이용하여 파일 읽을 수 있음 파일 내용을 List<String> 반환
~~~
* final List<String> lines = Files.readAllLines(path);
~~~

### final 변수
* final 변수를 지역변수나 필드를 정의할때 사용함으로써 변수에 값을 재할당 못하게 하여 상태가 변경될 수 있는 객체와 변경될수 없는 객체를 구분할 수 있다.

### 유지보수 와 안티패턴
* 특정기능 담당코드를 쉽게 찾으며 어떤일을 하는지 쉽게 이해 새로운기능 추가제거 쉽게 가능 캡슐화 가능해야한다.
* 새로운 요구가 있을때마다 복붙이 필요하다면 안티패턴입니다.

### 갓 클래스
* 한개의 파일에 모든 코드 구현 -> 거대한 클래스 생성 -> 이해하기 어려움 -> 단일책임 위배

### 코드 중복
* csv 파일이 아니라 json 파일이라면 다양한 파일형식을 지원하게 된다면 -> 중복배제 DRY원칙

### 단일 책임원칙 (SRP)
* 한 클래스는 한기능만 책임
* 클래스가 바뀌는 이유는 오직 하나이어야만 한다.