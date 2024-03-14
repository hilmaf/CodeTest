public class StackByArray {

    private Object[] stack; // java.lang 패키지의 Object를 명시적으로 사용
    private int top; // 포인터

    // 생성자
    public StackByArray(int length) {
        this.top = -1;
        this.stack = new Object[length]; // java.lang 패키지의 Object를 명시적으로 사용
    }

    // 메소드 구현
    // push
    public void push(Object data) {
        if (top == stack.length - 1) {
            throw new StackOverflowError();
        }

        stack[++top] = data;
    }

    // pop
    public Object pop() {
        if (top == -1) {
            throw new ArrayIndexOutOfBoundsException();
        }

        Object temp = stack[top];
        stack[top--] = null;
        return temp;
    }

    // peek
    public Object peek() {
        return stack[top];
    }

    // empty()
    public boolean empty() {
        return top == -1;
    }
}
