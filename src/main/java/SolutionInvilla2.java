import java.io.IOException;
import java.util.Objects;

public class SolutionInvilla2 {

    public static class BinaryTree {

        private int valor;

        private BinaryTree left;

        private BinaryTree right;

        public int getValor() {
            return valor;
        }

        public void setValor(int valor) {
            this.valor = valor;
        }

        public BinaryTree getLeft() {
            return left;
        }

        public void setLeft(BinaryTree left) {
            this.left = left;
        }

        public BinaryTree getRight() {
            return right;
        }

        public void setRight(BinaryTree right) {
            this.right = right;
        }
    }

    public static class Algebra {

        private BinaryTree binaryTree;

        public Algebra(BinaryTree binaryTree) {
            Objects.requireNonNull(binaryTree, "A árvore binária não pode ser nula");
            this.binaryTree = binaryTree;
        }

        public int sum() {
            return sum(binaryTree);
        }

        private int sum(BinaryTree binaryTree) {

            if (binaryTree == null) {
                return 0;
            }

            return binaryTree.getValor() + sum(binaryTree.getLeft()) + sum(binaryTree.getRight());
        }
    }


    public static void main(String[] args) throws IOException {
        BinaryTree binaryTree = new BinaryTree();
        binaryTree.setValor(10);
        BinaryTree binaryLeft = new BinaryTree();
        binaryLeft.setValor(10);
        BinaryTree binaryRigth = new BinaryTree();
        binaryRigth.setValor(10);
        binaryTree.setLeft(binaryLeft);
        binaryTree.setRight(binaryRigth);
        Algebra algebra = new Algebra(binaryTree);
        System.out.println(algebra.sum());
    }
}
