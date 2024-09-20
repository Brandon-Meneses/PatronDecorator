public class Main {
    public static void main(String[] args) {
        Notificador notificador = new NotificadorBasico();

        notificador = new NotificadorEmail(notificador);

        notificador = new NotificadorSMS(notificador);

        notificador = new NotificadorPush(notificador);

        notificador.enviarMensaje("Bienvenido a BrandevSolutions!.");
    }
}
