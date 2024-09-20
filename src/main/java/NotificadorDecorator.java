public abstract class NotificadorDecorator implements Notificador {
    protected Notificador notificador;

    public NotificadorDecorator(Notificador notificador) {
        this.notificador = notificador;
    }

    @Override
    public void enviarMensaje(String mensaje) {
        notificador.enviarMensaje(mensaje);
    }
}
