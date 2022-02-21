<h1>

Ch8

<h2>

- 프로그램 오류
  - 컴파일 에러(compile-time error) -  컴파일 할 때 발생하는 에러(클래스 파일 안만들어 짐)
  - 런타임 에러(runtime error)   -  실행 할 때 발생하는 에러(클래스 파일은 만들어짐)
  - 논리적 에러(logical error)   -  작성 의도와 다르게 동작
- java의 런타임 에러
  - 에러(error)
    - 프로그램 코드에 의해서 수습될 수 없는 심각한 오류
  - 예외(exception)
    - 프로그램 코드에 의해서 수습될 수 있는 다소 미약한 오류
- 예외처리의 정의와 목적
  - 정의 
    - 프로그램 실행 시 발생할 수 있는 예외의 발생에 대비한 코드를 작성하는 것
  - 목적
    - 프로그램의 비정상 종료를 막고, 정상적인 실행상태를 유지하는 것
- Exception 클래스와 자손클래스들
  - 사용자의 실수와 같은 외적인 요인에 의해 발생하는 예외
- RuntimeException 클래스와 자손클래스들
  - 프로그래머의 실수로 발생하는 예외
- PrintStackTrace()
  - 예외발생 당시의 호출스택(Call Stack)에 있었던 메서드의 정보와 예외 메시지를 화면에 출력한다.
- getMessage()
  - 발생한 예외클래스의 인스턴스에 저장된 메시지를 얻을 수 있다.
- 멀티 catch 블럭
  - 내용이 같은 catch블럭을 하나로 합친 것(jdk1.7부터)
  - catch (ArithmeticException | ClassCastException e)
  - 부모 자식 관계면 에러
- 예외 발생시키기
  - 1. 연산자 new를 이용해서 발생시키려는 예외 클래스의 객체를 만든다
  - Exception e = new Exception("고의로 발생시킴");
  - 2. 키워드 throw를 이용해서 예외를 발생시킨다.
  - throw e;
- checked 예외
  - 컴파일러가 예외 처리 여부를 체크 (예외처리 필수)
  - Exception 과 자손들
- unchecked 예외
  - 컴파일러가 예외 처리 여부를 체크 안함(예외처리 선택)
  - RuntimeException 과 자손들
- 예외 선언 (throws)
  - 메서드가 호출시 발생가능한 예외를 호출하는 쪽에 알리는 것
- 연결된 예외 (chained exception)
  - 한 예외가 다른 예외를 발생시킬 수 있다.
  - 예외 A가 예외 B를 발생시키면 A는 B의 원인 예외(cause exception)
  - Throwable initCause (Throwable cause)
    - 지정한 예외를 원인 예외로 등록
  - Throwable getCause()
    - 원인 예외를 반환