## 기능 요구사항에 따른 구현할 기능 목록

- [x] 이름과 위치를 가진 자동차 클래스 생성 - Car
    - [x] 자동차 이름 5자 초과시 에러
- [x] 자동차 이름 리스트 입력 - InputView#inputNames()
    - [x] 쉼표 기준으로 자동차 이름 분리
    - [x] 자동차 객체 생성
- [x] 반복할 횟수 입력받기 - InputView#inputTryCount()
- [x] 우승한 자동차 얻기 - Cars#getWinnerCars()
    - [x] 1~10 사이 난수를 생성 - NumberGenerator#createRandomNumber()
    - [x] 4이상의 숫자일 경우 자동차 위치 이동 Car#move()
- [x] 레이싱 중간 결과 출력 - domain.ResultView#printCurrentCars()
- [x] 레이싱 최종 결과 출력 - domain.ResultView#printResult()

## 기능 요구사항

- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

### 실행 결과

```
경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).
pobi,crong,honux
시도할 회수는 몇회인가요?
5

실행 결과
pobi : -
crong : -
honux : -

pobi : --
crong : -
honux : --

pobi : ---
crong : --
honux : ---

pobi : ----
crong : ---
honux : ----

pobi : -----
crong : ----
honux : -----

pobi : -----
crong : ----
honux : -----

pobi, honux가 최종 우승했습니다.
```

