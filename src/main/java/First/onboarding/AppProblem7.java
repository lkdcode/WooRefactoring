package First.onboarding;

import java.util.*;

public class AppProblem7 {
    private static final String USER = "mrko";
    private static final List<List<String>> FRIENDS = Arrays.asList(Arrays.asList("donut", "andole"),
      List.of("donut", "jun"),
      List.of("donut", "mrko"),
      List.of("shakevan", "andole"),
      List.of("shakevan", "andole"),
      List.of("shakevan", "ccc"),
      List.of("shakevan", "ccc"),
      List.of("shakevan", "jun"),
      List.of("shakevan", "mrko"));
    private static final List<String> VISITORS = Arrays.asList("bedi", "bedi", "donut", "bedi", "shakevan");
    private static final int FRIEND_POINT = 10;
    private static final int VISITOR_POINT = 1;

    public static void main(String[] args) {

        // 이미 친구인 목록 만들기
        // 유저와 친구인가?
        // alreadyFriends 에 추가하고 USER를 지워준다

        List<String> alreadyFriends = new ArrayList<>();
        for (int i = 0; i < FRIENDS.size(); i++) {
            if (FRIENDS.get(i).contains(USER)) {
                alreadyFriends.add(FRIENDS.get(i).get(0));
                alreadyFriends.add(FRIENDS.get(i).get(1));
                alreadyFriends.remove(USER);
            }
        }

        System.out.println(alreadyFriends);

        // 이미 친구인 alredayFriends 목록을 가지고
        // 이미 친구와 친구인 유저를 선별한다

        List<String> newFriends = new ArrayList<>();
        for (int i = 0; i < FRIENDS.size(); i++) {
            for (int j = 0; j < alreadyFriends.size(); j++) {
                if (FRIENDS.get(i).contains(alreadyFriends.get(j))) {
                    newFriends.add(FRIENDS.get(i).get(0));
                    newFriends.add(FRIENDS.get(i).get(1));
                    newFriends.remove(alreadyFriends.get(j));
                    newFriends.remove(USER);
                }
            }
        }

        // 정렬
        Collections.sort(newFriends);

        System.out.println(newFriends);

        HashMap<String, Integer> friendsPoint = new HashMap<>();

        // 이미 친구와 친구인 유저 점수 +10 점 부여하기
        for (int i = 0; i < newFriends.size(); i++) {

            if (friendsPoint.containsKey(newFriends.get(i))) {
                int friendPoint = friendsPoint.get(newFriends.get(i)) + FRIEND_POINT;
                friendsPoint.put(newFriends.get(i), friendPoint);
            }

            if (!(friendsPoint.containsKey(newFriends.get(i)))) {
                friendsPoint.put(newFriends.get(i), FRIEND_POINT);
            }

        }

        System.out.println(friendsPoint);

        // 방문자 점수 추가를 위한 리스트 선언
        List<String> visitorsFriends = new ArrayList<>(VISITORS);


        // 방문자에 이미 친구인 유저 삭제하기
        for (int i = 0; i < alreadyFriends.size(); i++) {
            visitorsFriends.remove(alreadyFriends.get(i));
        }


        // 방문자에게 +1 점 부여하기
        for (int i = 0; i < visitorsFriends.size(); i++) {

            if (friendsPoint.containsKey(visitorsFriends.get(i))) {
                int friendPoint = friendsPoint.get(visitorsFriends.get(i)) + VISITOR_POINT;
                friendsPoint.put(visitorsFriends.get(i), friendPoint);
            }

            if (!(friendsPoint.containsKey(visitorsFriends.get(i)))) {
                friendsPoint.put(visitorsFriends.get(i), VISITOR_POINT);
            }

        }

        System.out.println(friendsPoint + "<- 친구 점수");
        List<String> result = new ArrayList<>(friendsPoint.keySet());

//        Collections.sort(result);
        System.out.println(result + " 처음 result");

        Collections.sort(result, (v1, v2) -> (friendsPoint.get(v2).compareTo(friendsPoint.get(v1))));
        // v1, v2 는 인덱스를 뜻하고 friendsPoint.get(v2) -> 1번째 인덱스,  friendsPoint.get(v1) -> 0번째 인덱스를 가져옴
        // v1, = 0  >>>>>> {aaa = 20}
        // v2, = 1  >>>>>> {andole = 30}
        // compareTo >>>>>>>>> 20 vs 30
        // result 에 sort

//        System.out.println(friendsPoint);
        System.out.println(result);

    }

}
