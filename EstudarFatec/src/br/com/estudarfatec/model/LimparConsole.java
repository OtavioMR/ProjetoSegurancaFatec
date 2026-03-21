package br.com.estudarfatec.model;

public class LimparConsole {

	public void limparTela() {
	    try {
	        final String os = System.getProperty("os.name");
	        
	        if (os.contains("Windows")) {
	            // Tenta o comando real (funciona no CMD/PowerShell)
	            new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
	        } else {
	            // Tenta o código ANSI (funciona no Terminal do Mac/Linux/VS Code Terminal)
	            System.out.print("\033[H\033[2J");
	            System.out.flush();
	        }
	    } catch (final Exception e) {
	        // Se der erro ou estiver na IDE (Eclipse/IntelliJ), pula linhas
	        for (int i = 0; i < 50; i++) System.out.println();
	    }
	    
	    // TRUQUE PARA IDE: Se o comando acima falhou ou imprimiu o símbolo estranho, 
	    // pular linhas resolve o visual para você testar agora.
	    for (int i = 0; i < 30; i++) System.out.println(); 
	}

}
