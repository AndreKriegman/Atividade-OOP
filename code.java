public class code {
  public static void main(String[] args) {
    Clients clientOne = new Clients("Mario", 81970707070L, "Rio Doce Street", "mariogames@yahoo.com", 42343390834L,
        21441, 130);

    Clients clientTwo = new Clients("João", 81999829012L, "Jardim Atlântico Crew", "joaobeltrao@hotmail.com",
        29323158980L, 31552, 121);

    System.out.println(clientOne.nome);
    System.out.println(clientOne.telefone);
    System.out.println(clientOne.endereco);
    System.out.println(clientOne.email);
    System.out.println(clientOne.cpf);
    System.out.println(clientOne.id);
    System.out.println(clientOne.numeroDaCasa + "\n");

    System.out.println(clientTwo.nome);
    System.out.println(clientTwo.telefone);
    System.out.println(clientTwo.endereco);
    System.out.println(clientTwo.email);
    System.out.println(clientTwo.cpf);
    System.out.println(clientTwo.id);
    System.out.println(clientTwo.numeroDaCasa);
  }
}

class Clients {
  String nome;
  long telefone;
  String endereco;
  String email;
  long cpf;
  int id;
  int numeroDaCasa;

  Clients(String nome, long telefone, String endereco, String email, long cpf, int id, int numeroDaCasa) {
    this.nome = nome;
    this.telefone = telefone;
    this.endereco = endereco;
    this.email = email;
    this.cpf = cpf;
    this.id = id;
    this.numeroDaCasa = numeroDaCasa;
  }
}