package tadsUrl;

import org.junit.Test;

public class ValidadorUrlTest {

	@Test
    public void converteNumeroTest(){
    	ValidadorUrl validador = new ValidadorUrl();
    	
    	validador.validaURL("https://www.totvs.com/store/home");
    	validador.validaURL("https://hipsters.tech/assinar/");
    	validador.validaURL("http://pcsist.com.br/institucional/sobre-a-pc-sistemas/");
    	validador.validaURL("http://www.google");
    }

}
