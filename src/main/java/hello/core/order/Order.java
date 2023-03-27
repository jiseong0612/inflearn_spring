package hello.core.order;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@AllArgsConstructor
@RequiredArgsConstructor
public class Order {
	private Long memberId;
	private String itemName;
	private int itemPrice, discountPrice;
	
	public int calculatePrice(){
		return itemPrice - discountPrice;
	}
}
