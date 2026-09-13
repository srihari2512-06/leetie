# ──────────────────────────────────────────────────
# Problem  : 4326. Count Shadow Pairs II
# Difficulty: Hard
# Tags     : N/A
# Link     : https://leetcode.com/problems/count-shadow-pairs-ii/
# Runtime  : 9031 ms (beats 33%)
# Memory   : 28092000 (beats 100%)
# Language : python3
# Copyright: (c) 2026 srihari2512-06. All rights reserved.
# Synced by: leetie
# ──────────────────────────────────────────────────

        order = sorted(range(n), key=lambda i: nums[i])

        pos = [0] * n
        first = {}

        for p, idx in enumerate(order):
            pos[idx] = p
            if nums[idx] not in first:
                first[nums[idx]] = p

        # Square-root decomposition
        B = 450
        blocks = (n + B - 1) // B

        # -1 = inactive index
        arr = []
        sorted_block = []

        for b in range(blocks):
            size = min(B, n - b * B)
            a = [-1] * size
            arr.append(a)
            sorted_block.append(a[:])

        INF = 10**30
        lazy = [INF] * blocks

        def push(b):
            if lazy[b] == INF:
                return

            cap = lazy[b]
            a = arr[b]

            for i in range(len(a)):
                if a[i] > cap:
                    a[i] = cap

            lazy[b] = INF

        def rebuild(b):
            sorted_block[b] = sorted(arr[b])

        def query_prefix(end, x):
            if end <= 0:
                return 0

            full = end // B
            rem = end % B
            ans = 0

            # Complete blocks
            for b in range(full):
                if lazy[b] >= x:
                    s = sorted_block[b]
                    ans += len(s) - bisect_left(s, x)

            # Partial block
            if rem:
                b = full
                push(b)

                a = arr[b]

                for i in range(rem):
        return ans