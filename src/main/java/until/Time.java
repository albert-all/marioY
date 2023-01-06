package until;

public class Time {
    public static float timeStared = System.nanoTime();

    public static float getTime() {
        return (float) ((System.nanoTime() - timeStared) * 1E-9);
    }
}
