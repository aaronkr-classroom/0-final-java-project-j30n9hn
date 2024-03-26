import java.util.Scanner;

public class Welcome {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		String greeting = "Welcome to Shopping Mall";
		String tagline = "Welcome to Book Market!";

		System.out.print("당신의 이름을 입력하세요 : ");
		String name = input.nextLine();

		System.out.print("연락처를 입력하세요 : ");
		int phone = input.nextInt();
		
		boolean quit = false;

		while(!quit) {

			System.out.println("************************");
			System.out.println("\t" + greeting);
			System.out.println("\t" + tagline);
			System.out.println("************************");

			//System.out.println("************************");
			//System.out.println("1. 고객 정보 확인하기\t5. 장바구니에 항목 추가하기");
			//System.out.println("2. 장바구니 상품 목록 보기\t6. 장바구니의 항목 수량 줄이기");
			//System.out.println("3. 장바구니 비우기\t7. 장바구니의 항목 삭제하기");
			//System.out.println("4. 영수증 표시하기\t8. 종료");
			//System.out.println("************************");
			menuIntro();

			System.out.println("메뉴 번호를 선택하세요 : ");
			int choice = input.nextInt();

			if (choice < 1 || choice > 8) {
				System.out.println("1부터 8까지의 숫자를 입력하세요i");
			} else {
				switch (choice) {
					case 1:
						//System.out.println("1. 현재 고객정보 : ");
						//System.out.println("이름 : " + name + "연락처 : " + phone);
						menuGuestInfo(name, phone);
						break;
					case 2:
						menuCartItemList();
						break;
					case 3:
						menuCartClear();
						break;
					case 4:
						menuCartBill();
						break;
					case 5:
						menuCartAddItem();
						break;
					case 6:
						menuCartRemoveItemCount();
						break;
					case 7:
						menuCartRemoveItem();
						break;
					case 8:
						menuCartExit();
						quit = true;
						break;
				} // switch 끝
			} // else 끝
		} //while 끝
		
	} // main함수 끝
	/**
	 * 설명 : Print Menu
	 * 메개변수:
	 * 반환값:
	 */	
	public static void menuIntro() {
			System.out.println("************************");
			System.out.println("1. 고객 정보 확인하기\t5. 장바구니에 항목 추가하기");
			System.out.println("2. 장바구니 상품 목록 보기\t6. 장바구니의 항목 수량 줄이기");
			System.out.println("3. 장바구니 비우기\t7. 장바구니의 항목 삭제하기");
			System.out.println("4. 영수증 표시하기\t8. 종료");
			System.out.println("************************");
	}

	/**
	 * 설명 : 고객 정보 출력
	 * 메개변수:
	 *  - String  name 고객 이름
	 *  - int phone 휴대전화 번호
	 * 반환값:
	 */	
	public static void menuGuestInfo(String name, int phone) {
			System.out.println("1. 현재 고객정보 : ");
			System.out.println("이름 : " + name + " 연락처 : " + phone);
	}
	
	/**
	 * 설명 : 2번  Item List
	 * 메개변수:
	 * 반환값:
	 */	
	public static void menuCartItemList() {
			System.out.println("2. 장바구니 상품 목록 보기 :");
	}
	public static void menuCartClear() {
			System.out.println("3. 장바구니 비우기 :");
	}
	public static void menuCartAddItem() {
			System.out.println("5. 장바구니의 항목 추가하기 :");
	}
	public static void menuCartRemoveItemCount() {
			System.out.println("6. 장바구니의 항목 수량 줄기기 :");
	}
	public static void menuCartRemoveItem() {
			System.out.println("7. 장바구니의 항목 삭제하기 :");
	}
	public static void menuCartBill() {
			System.out.println("4. 영수증 표시하기 :");
	}
	public static void menuCartExit() {
			System.out.println("8. 종료");
	}


} //wellcome 클래스 끝
