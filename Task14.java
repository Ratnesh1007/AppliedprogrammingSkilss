class Task14{
    public ListNode mergeKLists(ListNode[] lists) {
        ListNode head = null;
        for (int i = 0; i < lists.length; i++) {
            head = merge(head, lists[i]);
        }
        return head;
    }

    ListNode merge(ListNode a, ListNode b) {
        if (a == null) return b;
        if (b == null) return a;

        if (a.val < b.val) {
            a.next = merge(a.next, b);
            return a;
        } else {
            b.next = merge(a, b.next);
            return b;
        }
    }
}
