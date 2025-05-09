import java.util.Map;
import java.util.Scanner;

import java.util.stream.Stream;
import java.util.ArrayList;
import java.util.List;

import Model.Board;
import Model.Space;

import static java.util.stream.Collectors.toMap;
import static Util.BoardTemplate.BOARD_TEMPLATE;
import static java.util.Objects.nonNull;
import static java.util.Objects.isNull;



public class Main {
	
	private final static Scanner scanner = new Scanner(System.in);
	
	private static Board board;
	
	private final static int BOARD_LIMIT = 9;

	public static void main(String[] args) {
		final var positions = Stream.of(args)
				.collect(toMap(
						k -> k.split(";")[0], 
						v -> v.split(";")[1] ));
		var option = -1;
		while(true) {
			System.out.println("Selecione uma das opções a seguir: ");
			System.out.println("1 - Iniciar o jogo");
			System.out.println("2 - Colar um novo número");
			System.out.println("3 - Remover um número");
			System.out.println("4 - Visualizar jogo atual");
			System.out.println("5 - Verificar status do jogo");
			System.out.println("6 - Limpar Jogo");
			System.out.println("7 - Finalizar jogo");
			System.out.println("8 - sair");
			
			option = scanner.nextInt();
			
			switch(option) {
				case 1 -> startGame(positions);
				case 2 -> inputNumber();
				case 3 -> removeNumber();
				case 4 -> showCurrentGame();
				case 5 -> showGameStatus();
				case 6 -> clearGame();
				case 7 -> finishGame();
				case 8 -> System.exit(0);
				default -> System.out.println("Erro. Selecione outra opção.");
				
				
			
			}
		}

	}
	
	private static void startGame(final Map<String, String> positions) {
		if(nonNull(board)) {
			System.out.println("O jog já foi iniciado");
			return;
		}
		
		List<List<Space>> spaces = new ArrayList<>();
		for (int i = 0; i < BOARD_LIMIT; i ++) {
			spaces.add(new ArrayList<>());
			for (int j = 0; j < BOARD_LIMIT; j ++) {
				var positionConfig = positions.get("%s,%s".formatted(i,j));
				var expected = Integer.parseInt(positionConfig.split(",")[0]);
				var fixed = Boolean.parseBoolean(positionConfig.split(",")[1]);
				var currentSpace = new Space(expected, fixed);
				spaces.get(i).add(currentSpace);
				
			}
		}
		
		board = new Board(spaces);
		System.out.println("O jogo está pronto para começar");
		
	}
	
	private static void inputNumber() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
		
		System.out.println("informe a coluna que deseja inserir o número: ");
		var col = runUntilGetValidNumber(0, 8);
		System.out.println("informe a linha que deseja inserir o número: ");
		var row = runUntilGetValidNumber(0, 8);
		System.out.printf("informe o número que vai entrar na posição [%s , %s]: \n", col, row);
		var value = runUntilGetValidNumber(1, 9);
		if(!board.changeValue(col, row, value)) {
			System.out.printf("A posição [%s , %s] tem um valor fixo \n ", col, row);
		}
	}
	
	private static void removeNumber() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
		
		System.out.println("informe a coluna que deseja inserir o número: ");
		var col = runUntilGetValidNumber(0, 8);
		System.out.println("informe a linha que deseja inserir o número: ");
		var row = runUntilGetValidNumber(0, 8);
		if(!board.clearValue(col, row)) {
			System.out.printf("o valor na posição [%s , %s] foi apagada \n ", col, row);
		}
	}
	
	private static void showCurrentGame() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
		
		var args = new Object[81];
		var argPos = 0;
		for(int i = 0; i < BOARD_LIMIT; i ++) {
			for (var col: board.getSpaces()) {
				args[argPos ++] = " " + ((isNull(col.get(i).getActual())) ? " " : col.get(i).getActual());
			}
		}
		
		System.out.println("Seu jogo se encontra da seguinte forma: ");
		System.out.printf((BOARD_TEMPLATE) + "\n", args);
	}

	private static void showGameStatus() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
		
		System.out.printf("O jogo atualmente se encontra no status:  %s \n", board.getStatus().getLabel());
		if(board.hasErros()) {
			System.out.println("O jogo contem erros");
		}else {
			System.out.println("O jogo não contem erros");
		}
	}
	
	private static void clearGame() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
		
		System.out.println("tem que deseja limpar o jogo? ");
		var confirm = scanner.next();
		while(!confirm.equalsIgnoreCase("sim") && !confirm.equalsIgnoreCase("não")) {
			System.out.println("Informe sim ou não");
			confirm = scanner.next();
		}
		
		if(confirm.equalsIgnoreCase("sim")) {
			board.reset();
		}
	}


	private static void finishGame() {
		if(isNull(board)) {
			System.out.println("O jogo ainda não foi iniciado");
			return;
		}
		
		if(board.gameIsFinish()) {
			System.out.println("Parabens você concluiu o jogo");
			showCurrentGame();
			board = null;
		} else if (board.hasErros()) {
			System.out.println("Seu jogo tem erros, verifique");
		} else {
			System.out.println("Você ainda precisa preencher os espaços");
		}
	}
	
	private static int runUntilGetValidNumber(final int min, final int max) {
		var current = scanner.nextInt();
		while(  current < min || current > max) {
			System.out.printf("Inform um número entre %d e %d \n", min, max);
			current = scanner.nextInt();
		}
		return current;
	}






	
	

	

}
