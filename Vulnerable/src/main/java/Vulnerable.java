import java.util.Random;

class Vulnerable {

String generateSecretToken() {
    Random r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    return Long.toHexString(r.nextLong());
}
}
