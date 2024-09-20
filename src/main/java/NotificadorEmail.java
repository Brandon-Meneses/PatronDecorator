public class NotificadorEmail extends NotificadorDecorator {
    public NotificadorEmail(Notificador notificador) {
        super(notificador);
    }

    @Override
    public void enviarMensaje(String mensaje) {
        super.enviarMensaje(mensaje);
        enviarEmail(mensaje);
    }

    private void enviarEmail(String mensaje) {
        System.out.println("Enviando mensaje por correo electrónico: " + mensaje);
    }
}
