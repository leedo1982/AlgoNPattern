package Test;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class wb04 {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		boolean stop = false;

		List<Order> orderList = new ArrayList<>();

		while (!stop) {
			String input = br.readLine();

			if (null != input) {
				String[] split = input.split("|");
				orderList.add(new Order(split[0], split[1], split[2]));
			} else {
				stop = true;
			}
		}

		Map<String, List<Order>> collect = orderList.stream()
			.filter(order -> !order.getDay().equals("2018-08-01") && !order.getDay().equals("2018-08-01"))
			.collect(Collectors.groupingBy(Order::getProduct));

		collect.forEach((s, orders) ->

			{

				Map<String, List<Order>> collect1 = orders.stream().collect(Collectors.groupingBy(Order::getRegion));

				collect1.forEach((s1, orders1) -> {

						System.out.println(s + ":" + orders.size() + "=>" + s1 + ":");

					}

				);

			}

		);


	}
}

class Order {

	String day;
	String product;
	String region;

	Order(String day, String product, String region) {
		this.day = day;
		this.product = product;
		this.region = region;
	}

	public String getDay() {
		return day;
	}

	public String getProduct() {
		return product;
	}

	public String getRegion() {
		return region;
	}
}
