package model;

public class FilaGen<T> {
	   No<T> inicio;
	   No<T> fim;
	 
	   public FilaGen() {
		   inicio = null;
		   fim = null;
	   }
	   
	   public boolean isEmpty() {
		   if (inicio == null && fim == null) {
			   return true;
		   } return false;
	   }
	   
	   public void insert(T valor) {
		   No<T> elemento = new No<T>();
		   elemento.dado = valor;
		   elemento.proximo = null;
		   if(isEmpty()) {
			   fim = elemento;
			   inicio = fim;
		   } else {
			   fim.proximo = elemento;
			   fim = elemento;
		   }
	   }
	   
	   
	   public T remove() throws Exception {
		   if (isEmpty()) {
			   throw new Exception("Fila Vazia");
		   }
		   T valor = inicio.dado;
		   if(inicio == fim && inicio != null) {
			   inicio = null;
			   fim = inicio;
		   } else {
			   inicio = inicio.proximo;
		   } return valor;
	   }  
	   public int size() {
			int i = 0;
			if(!isEmpty()) {
				No<T> aux = inicio;
				
				while(aux != null) {
					i++;
					aux = aux.proximo;
				}
			}
			return i;
		}
		
		public void list() throws Exception{
			if(isEmpty()) {
				throw new Exception("Fila Vazia");
			}
			
			No<T> aux = inicio;
			
			while(aux != null) {
				System.out.println(aux);
				aux = aux.proximo;
			}
		}
}
