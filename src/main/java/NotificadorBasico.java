public class NotificadorBasico implements Notificador {
    @Override
    public void enviarMensaje(String mensaje) {
        System.out.println("Enviando mensaje básico: " + mensaje);
    }
}
