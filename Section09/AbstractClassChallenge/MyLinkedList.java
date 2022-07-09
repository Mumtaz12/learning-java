package Section09.AbstractClassChallenge;

public class MyLinkedList implements NodeList {

    private ListItem root = null;

    public MyLinkedList(ListItem root) {
        this.root = root;
    }

    @Override
    public ListItem getRoot() {
        return null;
    }

    @Override
    public boolean addItem(ListItem newItem) {
        if (root == null) {
            // The list was empty, so this item becomes the head of the list
            root = newItem;
            return true;
        }
        ListItem currentItem = root;
        while (currentItem != null) {
            int comparison = (currentItem.compareTo(newItem));
            if (comparison < 0) {
                // newItem is greater, move right if possible
                if (currentItem.next() != null) {
                    currentItem = currentItem.next();
                } else {
                    // there is no next, so insert at end of list
                    currentItem.setNext(newItem).setPrevious(currentItem);
                    return true;
                }
            } else if (comparison > 0) {
                // newItem is less, insert before
                if (currentItem.previous() != null) {
                    currentItem.previous().setNext(newItem).setPrevious(currentItem.previous());
                    newItem.setNext(currentItem).setValue(newItem);
                } else {
                    // the node with a previous is the root
                    newItem.setNext(root).setPrevious(newItem);
                    root = newItem;
                }
                return true;
            } else {
                // equal
                System.out.println(newItem.getValue() + " is already present, not added.");
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
        while (currentItem != null) {
            int comparision = currentItem.compareTo(item);
            if (comparision == 0) {
                // found the item do delete
                if (currentItem == root) {
                    root = currentItem.next();
                } else {
                    currentItem.previous().setNext(currentItem.next());
                    if (currentItem.next() != null) {
                        currentItem.next().setPrevious(currentItem.previous());
                    }
                    return true;
                }
            } else if (comparision < 0) {
                currentItem = currentItem.next();
            } else {
                // comparison > 1
                // we are at an item greater than the one to be deleted
                // so the item is not in the list
                return false;
            }
        }
        // We have reached the end of the list
//        Without item to delete
        return false;
    }

    @Override
    public void traverse(ListItem root) {
        if (root == null) {
            System.out.println("The list is empty");
        } else {
            while (root != null) {
                System.out.println(root.getValue());
                root = root.next();
            }
        }
    }
}
