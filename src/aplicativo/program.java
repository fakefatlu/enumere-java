package aplicativo;

import java.util.Date;

import entidade.enums.OrderStatus;
import entidades.Pedido;

public class program {

	public static void main(String[] args) {
		
		Pedido pedido = new Pedido(2000, new Date(), OrderStatus.AGUARDANDO_PAGAMENTO);
		
		System.out.println(pedido);
		
		OrderStatus os1 = OrderStatus.ENTREGUE;
		OrderStatus os2 = OrderStatus.valueOf("ENTREGUE");
		
		System.out.println(os1);
		System.out.println(os2);
	}

}
