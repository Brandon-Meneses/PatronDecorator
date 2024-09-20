public class NotificadorSMS extends NotificadorDecorator {
    public NotificadorSMS(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        super.enviarMensaje(mensaje);
        enviarSMS(mensaje);
    }

    private void enviarSMS(String mensaje) {
        System.out.println("Enviando mensaje por SMS: " + mensaje);
    }
}
