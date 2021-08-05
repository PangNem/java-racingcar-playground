## 요구사항에 따른 구현할 기능 목록

- [ ] 경주할 자동차 목록 입력받기 - domain.InputView#getCarNames()
    - [x] 쉼표(,) 기준으로 이름 분리해서 반환 - utils.StringUtils#split()
- [ ] 시도할 횟수 입력받기 - domain.InputView#InputTryCount()


- [ ] 자동차 객체 생성 - Car
- [ ] 자동차 이동 - Car#move()
    - 랜덤 숫자가 4 이상일 경우만 이동
    - [ ] 랜덤 숫자 생성 - RandomNumberGenerator#generate()


- [ ] 경기 시작 - RacingGame#start()
    - [ ] 경기 상태 STARTED 로 변경
- [ ] 경기가 끝났는지 체크 - RacingGame#isEnd()
    - [ ] 경기 상태 상수가 END 인지 체크
- [ ] 경주 진행 - RacingGame#race()
    - [ ] 경기 상태가 STARTED 가 아닐 시 에러 발생
- [ ] 우승한 자동차 목록 얻기 - RacingGame#getWinners()
    - [ ] 경기 시작 전에 우승자를 구하려고 하면 에러 발생


- [ ] 레이싱 중간 결과 출력 - ResultView#printCurrentCars()
- [ ] 레이싱 최종 결과 출력 - ResultView#printResult()

## 요구사항

- 각 자동차에 이름을 부여할 수 있다. 자동차 이름은 5자를 초과할 수 없다.
- 전진하는 자동차를 출력할 때 자동차 이름을 같이 출력한다.
- 자동차 이름은 쉼표(,)를 기준으로 구분한다.
- 자동차 경주 게임을 완료한 후 누가 우승했는지를 알려준다. 우승자는 한명 이상일 수 있다.

## 실행 결과

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

