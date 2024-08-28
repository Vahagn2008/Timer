package room;

public class Lesson {

    public static void main(String[] args) {

        int minutes = 2;
        int seconds = 5;

        int totalSeconds = (minutes * 60 + seconds);

        Thread timer = new Thread(new Runnable() {
            @Override
            public void run() {
                try {
                    for (int i = totalSeconds; i >= 0; i--) {
                        int minutes1 = i / 60;
                        int seconds1 = i % 60;

                        if (minutes1 < 10) {
                            System.out.print("0" + minutes1 + " : ");
                        } else {
                            System.out.print(minutes1 + " : ");
                        }
                        if (seconds1 < 10) {
                            System.out.println("0" + seconds1);
                        }else {
                            System.out.println(seconds1);
                        }

                        Thread.sleep(1000);
                    }
                } catch (InterruptedException e) {

                }
            }
        });

        timer.start();

    }
}
