public class NotificadorPush extends NotificadorDecorator{
    public NotificadorPush(Notificador notificador) {
        super(notificador);
    }
    @Override
    public void enviarMensaje(String mensaje) {
        super.enviarMensaje(mensaje);
        enviarPushNotification(mensaje);
    }

    private void enviarPushNotification(String mensaje) {
        System.out.println("Enviando notificación push: " + mensaje);
    }
}
