public class PassGenerator {
    public static void main(String[] args) {
        char[] numeros = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
        char[] lletres = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j'};
        char[] simbols = {';', '.', ',', '-', '!', ':', ',', '^', '/', '%'};

        char[] pass = new char[8];

        pass[0] = lletres[(int) Math.floor(Math.random() *10)];
        pass[1] = numeros[(int) Math.floor(Math.random() *10)];
        pass[2] = lletres[(int) Math.floor(Math.random() *10)];
        pass[3] = lletres[(int) Math.floor(Math.random() *10)];
        pass[4] = numeros[(int) Math.floor(Math.random() *10)];
        pass[5] = simbols[(int) Math.floor(Math.random() *10)];
        pass[6] = simbols[(int) Math.floor(Math.random() *10)];
        pass[7] = numeros[(int) Math.floor(Math.random() *10)];

        System.out.println(new String(pass));
    }
}