package oop1;

/*
    Simple Music Player Using POP
 */

public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // Music Player On
        System.out.println("음악 플레이어를 시작합니다.");
        isOn = true;

        // Volume Up * 2
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);
        volume++;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // Volume Down
        volume--;
        System.out.println("음악 플레이어 볼륨 : " + volume);

        // Music Player State Check
        System.out.println("음악 플레이어 상태 확인");
        if (isOn) {
            System.out.println("음악 플레이어 ON, 볼륨: " + volume);
        } else {
            System.out.println("음악 플레이어 OFF");
        }

        // Music Player Off
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }
}
