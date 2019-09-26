package testlete;

import java.util.function.Function;
    public class Tree<A> {
        private final A value;
        private final Tree<A> left;
        private final Tree<A> right;

        private Tree(A value, Tree<A> left, Tree<A> right) {
            this.value = value;
            this.left = left;
            this.right = right;
        }

        public A value() {
            return value;
        }

        public Tree<A> left() {
            return left;
        }

        public Tree<A> right() {
            return right;
        }

        public static <A> Tree<A> tree(A value, Tree<A> left, Tree<A> right) {
            return new Tree<>(value, left, right);
        }

        public static <A, B> B traverse(Tree<A> tree, B empty,
                                        Function<A, Function<B, Function<B, B>>> merge) {
            if (tree == null) return empty;
            B left = traverse(tree.left(), empty, merge);
            B right = traverse(tree.right(), empty, merge);
            return merge.apply(tree.value()).apply(left).apply(right);
        }

        static int foobar(Tree<Integer> tree) {
            return Tree.traverse(tree, 0, v -> l -> r -> 1 + l + r);
        }
    }