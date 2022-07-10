package Section09.AbstractClass;

public class SearchTree implements NodeList {
    private ListItem root;

    public SearchTree(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return root;
    }

    @Override
    public boolean addItem(ListItem item) {
        if (root == null) {
            root = item;
            return true;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    currentItem.setNext(item);
                    return true;
                }
            } else if (comparison > 0) {
                if (currentItem.previous() != null) {
                    currentItem = currentItem.previous();
                } else {
                    currentItem.setPrevious(item);
                    return true;
                }
            } else {
                System.out.println(item.getValue() + " is already present");
                return false;
            }
        }
        return false;
    }

    @Override
    public boolean removeItem(ListItem item) {
        if (item != null) {
            System.out.println("Deleting item " + item.getValue());
        }
        ListItem currentItem = root;
        ListItem parentItem = currentItem;

        while (currentItem != null) {
            int comparison = currentItem.compareTo(item);
            if (comparison < 0) {
                parentItem = currentItem;
                currentItem = currentItem.next();
            } else if (comparison > 0) {
                parentItem = currentItem;
                currentItem = currentItem.previous();
            } else {
                performRemoval(currentItem, parentItem);
                return true;
            }
        }
        return false;
    }

    @Override
    public void traverse(ListItem item) {
        if (item != null) {
            traverse(item.previous());
            System.out.println(item.getValue());
            traverse(item.next());
        }
    }

    private void performRemoval(ListItem item, ListItem parent) {
        if (item.next() == null) {
            if (parent.next() == item) {
                parent.setNext(item.previous());
            } else if (parent.previous() == item) {
                parent.setPrevious(item.previous());
            } else {
                root = item.previous();
            }
        } else if (item.previous() == null) {
            if (parent.next() == item) {
                if (parent.next() == item) {
                    parent.setNext(item.next());
                } else if (parent.previous() == item) {
                    parent.setPrevious(item.next());
                } else {
                    root = item.next();
                }
            } else {
                ListItem currentItem = item.next();
                ListItem leftMostParent = item;
                while (currentItem.previous() != null) {
                    leftMostParent = currentItem;
                    currentItem = currentItem.previous();
                }
                item.setValue((ListItem) currentItem.getValue());
                if (leftMostParent == item) {
                    item.setNext(currentItem.next());
                } else {
                    leftMostParent.setPrevious(currentItem.next());
                }
            }
        }
    }
}