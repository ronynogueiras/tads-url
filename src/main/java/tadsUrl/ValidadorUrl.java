package tadsUrl;

public class ValidadorUrl {
	/**
	 * Valida se uma URL é válida
	 * @param url
	 */
	public void validaURL(String url)
    {	
        String[] urlpartes = new String[20];
        urlpartes = url.split("/");
        if(urlpartes.length > 3){
	        System.out.println("protocolo: "+urlpartes[0]);
	        String dominio = urlpartes[2];
	        String[] dominiotes = dominio.split("\\.");
	        System.out.println("host: "+dominiotes[0]);
	        String dominioCompleto = dominiotes[1];
	        for(int i = 2;i<dominiotes.length;i++){
	        	dominioCompleto += "."+dominiotes[i];
	        }
	        System.out.println("dominio: "+dominioCompleto);
	        System.out.println("path: "+urlpartes[3]);
	        String parametros = "";
	        for(int i = 4;i<urlpartes.length;i++){
	        	parametros += "/"+urlpartes[i];
	        }
	        System.out.println("parametros: "+parametros);
        } else {
        	System.out.println("URL Invalida!");
        }
        
    }
}
