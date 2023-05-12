import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner capture = new Scanner(System.in);
		ArrayList<Receitas> listaReceitas = new ArrayList<Receitas>();

		int codigo = 1;
		int operar = 0;

		do {
			System.out.println("\n==========Receitas=========\n");
			System.out.println(" 1 - Cadastrar Receitas"); // ok
			System.out.println(" 2 - Acessar Receitas");
			System.out.println(" 3 - Sair\n"); // ok
			System.out.println("===========================\n");
			System.out.println("digite a opção desejada:\n");
			operar = capture.nextInt();
			switch (operar) {

			case 1:
				capture.nextLine();
				System.out.println("Digite o titulo:\n");
				String titulo = capture.nextLine();

				System.out.println("Escreva a receita:\n");
				String texto = capture.nextLine();

				System.out.println("Tipo da receita/Gênero:\n");
				String genero = capture.nextLine();

				Receitas r = new Receitas(titulo, texto, genero, codigo);
				codigo++;
				listaReceitas.add(r);
				break;

			case 2:
				int procurar = 0;
				do {
					System.out.println("\n==========Receitas=========\n");
					System.out.println(" 1 - Procurar por Titulo");// ok
					System.out.println(" 2 - Procurar por gênero");// ok
					System.out.println(" 3 - Organizar Ordem Alfatica");// ok
					System.out.println(" 4 - Listar todas");// ok
					System.out.println(" 5 - favoritas");// ok
					System.out.println(" 6 - Apagar");//ok
					System.out.println(" 7 - Voltar\n");// ok
					System.out.println("===========================\n");
					System.out.println("digite a opção desejada:\n");
					capture.nextLine();
					procurar = capture.nextInt();
					switch (procurar) {

					case 1:
						System.out.print("Digite o titulo da receita: \n");
						capture.nextLine();
						String pesquisaReceita = capture.nextLine();

						for (Receitas k : listaReceitas) {
							if (pesquisaReceita.equals(k.getTitulo())) {
								k.descricaoDeReceita();
								System.out.println("Favoritar: s, n");
								String escolher3 = capture.next();
								if (escolher3.equals("s")) {
									k.setFavoritar(true);
								}
							}
						}

						break;
					////////
					case 2:
						capture.nextLine();
						System.out.print("Digite o Gênero da receita: \n");
						String pesquisaGenero = capture.nextLine();
						System.out.println("===========================\n");
						for (Receitas l : listaReceitas) {
							if (pesquisaGenero.equals(l.getGenero())) {
								System.out.print(l.getCodigo() + " - ");
								l.printarTitulo();
							}

						}
						System.out.println("===========================\n");
						System.out.println("Digite o codigo da receita\n");
						int escolher1 = capture.nextInt();

						for (Receitas n : listaReceitas) {
							if (escolher1 == n.getCodigo()) {
								n.descricaoDeReceita();
								System.out.println("Favoritar: s, n");
								String escolher3 = capture.next();
								if (escolher3.equals("s")) {
									n.setFavoritar(true);
								}
							}
						}
						break;
					//////
					case 3:
						listaReceitas.sort(Comparator.comparing(Receitas::getTitulo));
						for (Receitas c : listaReceitas) {
							System.out.println(c.getCodigo() + " - " + c.getTitulo());
						}
						break;
					/////
					case 4:
						for (Receitas l : listaReceitas) {

							System.out.print(l.getCodigo() + " - ");
							l.printarTitulo();
						}
						System.out.println("Acessar receita\n");
						int escolher2 = capture.nextInt();

						System.out.println("===========================\n");
						for (Receitas n : listaReceitas) {
							if (escolher2 == n.getCodigo()) {
								n.descricaoDeReceita();
								System.out.println("Favoritar: s, n");
								String escolher3 = capture.next();
								if (escolher3.equals("s")) {
									n.setFavoritar(true);
									System.out.println("===========================\n");
								}

							}
						}

						break;

					case 5:

						System.out.println("===========================\n");
						for (Receitas l : listaReceitas) {
							if (l.getFavoritar() == true) {
								System.out.print(l.getCodigo() + " - ");
								l.printarTitulo();
							}
						}
						System.out.println("===========================\n");
						System.out.print("Acessar receita: \n");
						capture.nextLine();
						int escolher5 = capture.nextInt();

						for (Receitas k : listaReceitas) {
							if (escolher5 == k.getCodigo()) {
								k.descricaoDeReceita();
								System.out.println("retirar de Favoritos: s, n");
								String escolher3 = capture.next();
								if (escolher3.equals("s")) {
									k.setFavoritar(false);
								}
							}
						}

						break;
					/////
					case 6:
						for (Receitas l : listaReceitas) {

							System.out.print(l.getCodigo() + " - ");
							l.printarTitulo();
						}

						System.out.print("Digite o codigo da receita a ser apagada: \n");
						int excluir = capture.nextInt();

						for (Receitas k : listaReceitas) {
							if (excluir == k.getCodigo()) {

								listaReceitas.remove(k.getCodigo() - 1);

								System.out.println("\nReceita excluida com sucesso!\n");
								break;
							}
						}

						break;
					case 7:
						procurar = 8;
						break;
					}

				} while (procurar > 0 && procurar < 8);
				break;

			case 3:
				operar = 6;
				break;

			}
		} while (operar > 0 && operar < 6);

	}

}
