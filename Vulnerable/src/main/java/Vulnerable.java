import java.util.Random;

class Vulnerable {
    String generateSecretToken1() {
    Random r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    return Long.toHexString(r.nextLong());
}
    String generateSecretToken2() {
    Random r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    return Long.toHexString(r.nextLong());
}
    
    String generateSecretToken3() {
    Random r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    r = new Random();
    return Long.toHexString(r.nextLong());
}

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
