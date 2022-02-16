public class IntStack {
    int max;    //스택 용량 (스택의 크기 입니다.)
    int ptr;    //스택 포인터 (스택이 현재 쌓여있는 개수 입니다.)
    int[] stk;  //스택 본체 (푸시된 데이터를 저장하는 본체 입니다.)

    // 실행 시 예외: 스택이 비어있음
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){}
    }

    // 실행 시 예외: 스택이 가득 참
    public class EmptyIntStackException extends RuntimeException {
        public EmptyIntStackException(){}
    }

   public static void main(String[] args){
        System.out.println("test");
    }
}
