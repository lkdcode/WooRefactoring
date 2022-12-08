## 🎯BaseBall

완료 - ✅
┌───────── [✅] <View> 게임 시작 메시지 출력 [OutputView#printStart]
├─────┬─── [ ] <Model> 컴퓨터 숫자 생성 [BaseBall#computer]
│.....├─── [ ] <Model> 3자리수 인가? [Validate#validateLength]
│.....├─── [ ] <Model> 숫자만 존재하는가? [Validate#validateNumber]
│.....├─── [ ] <Model> 0이 포함되어있는가? [Validate#validateZero]
│.....└─── [ ] <Model> 중복된 숫자가 있는가? [Validate#validateDuplication]
│
├───────── [✅] <View> "숫자를 입력해주세요." [OutputView#printInput]
│
├─────┬─── [✅] <Controller> 숫자를 입력받는 메소드 [InputView#readNumber]
│.....├─── [ ] <Controller> 3자리수 인가? [Validate#validateLength]
│.....├─── [ ] <Controller> 숫자만 존재하는가? [Validate#validateNumber]
│.....├─── [ ] <Controller> 0이 포함되어있는가? [Validate#validateZero]
│.....└─── [ ] <Controller> 중복된 숫자가 있는가? [Validate#validateDuplication]
│
├───────── [ ] <Model> 컨트롤러로부터 유저의 번호의 번호 받기 [BaseBall#user]
├───────── [ ] <Model> 컴퓨터 숫자와 유저의 숫자를 비교 [BaseBall#playBaseBall]
│
└─────┬─── [ ] <Controller> 모델로부터 결과값 받기
......├─── [✅] <View> 결과값 출력 [OutputView#printResult]
......├─── [✅] <View> 승리 메시지 출력 [OutputView#printWin]
......├─── [✅] <View> 재시작, 종료 출력 [OutputView#printCommand]
......├─── [ ] <Controller> 재시작, 종료 입력 받기 [InputView#readCommand]
......└─── [ ] <View> 완전 종료 메시지 출력 [OutputView#printQuit]

