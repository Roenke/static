Object myRes = null;

    {
      final long startTime = java.lang.System.nanoTime();
      final java.lang.Object[] info = new java.lang.Object[5];
      final java.util.concurrent.atomic.AtomicInteger time = new java.util.concurrent.atomic.AtomicInteger(0);
      final java.util.Map<java.lang.Integer, java.lang.Object> producerPeek0before = new java.util.LinkedHashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> producerPeek0after = new java.util.LinkedHashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> flatMapPeek1before = new java.util.LinkedHashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> flatMapPeek1after = new java.util.LinkedHashMap<>();
      final java.util.Map<java.lang.Object, java.util.Map<java.lang.Integer, java.lang.Integer>> distinct2Store = new java.util.HashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> distinct2Resolve = new java.util.HashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> distinct2ReverseUtil = new java.util.HashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> distinctPeek2before = new java.util.LinkedHashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> distinctPeek2after = new java.util.LinkedHashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> sortedPeek3before = new java.util.LinkedHashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> sortedPeek3after = new java.util.LinkedHashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Integer> terminatorPeek2147483647before = new java.util.LinkedHashMap<>();
      final java.util.Map<java.lang.Integer, java.lang.Object> terminatorPeek2147483647after = new java.util.LinkedHashMap<>();
      Object streamResult = null;
      try {
        streamResult = new java.lang.Object[] { Arrays.stream(new int[]{10, 87, 97, 43, 121, 20})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {time.incrementAndGet();}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {producerPeek0after.put(time.get(), x);}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {flatMapPeek1before.put(time.get(), x);}})
            .flatMap(new java.util.function.IntFunction<java.util.stream.IntStream>(){@java.lang.Override
            public java.util.stream.IntStream apply(int n) {return factorize(n);}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {time.incrementAndGet();}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {flatMapPeek1after.put(time.get(), x);}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {distinctPeek2before.put(time.get(), x);}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {distinct2Store.computeIfAbsent(x, y -> new java.util.LinkedHashMap<>()).put(time.get(), x);}})
            .distinct()
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {time.incrementAndGet();}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {distinctPeek2after.put(time.get(), x);}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
                  public void accept(int x) {
                    final java.util.Map<java.lang.Integer, java.lang.Integer> objects = distinct2Store.get(x);
                    for (final int key: objects.keySet()) {
                      final int value = objects.get(key);
                      if (value == x && !distinct2ReverseUtil.containsKey(key)) {
                        distinct2ReverseUtil.put(time.get(), key);
                      }
                    }
                  }}
            )
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {sortedPeek3before.put(time.get(), x);}})
            .sorted()
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {time.incrementAndGet();}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {sortedPeek3after.put(time.get(), x);}})
            .peek(new java.util.function.IntConsumer(){@java.lang.Override
            public void accept(int x) {terminatorPeek2147483647before.put(time.get(), x);}})
            .sequential()
            .toArray() };

      }
      catch(Throwable t) {
        streamResult = new Throwable[]{t};
      }
      {
        final java.lang.Object[] beforeArray;
        {
          final int size = producerPeek0before.size();
          final int[] keys = new int[size];
          final java.lang.Object[] values = new java.lang.Object[size];
          int i = 0;
          for (final int key : producerPeek0before.keySet()) {
            final java.lang.Object value = producerPeek0before.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          beforeArray = new java.lang.Object[] { keys, values };
        }

        final java.lang.Object[] afterArray;
        {
          final int size = producerPeek0after.size();
          final int[] keys = new int[size];
          final int[] values = new int[size];
          int i = 0;
          for (final int key : producerPeek0after.keySet()) {
            final int value = producerPeek0after.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          afterArray = new java.lang.Object[] { keys, values };
        }
        info[0] = new java.lang.Object[] {beforeArray, afterArray};
      }
      {
        final java.lang.Object[] beforeArray;
        {
          final int size = flatMapPeek1before.size();
          final int[] keys = new int[size];
          final int[] values = new int[size];
          int i = 0;
          for (final int key : flatMapPeek1before.keySet()) {
            final int value = flatMapPeek1before.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          beforeArray = new java.lang.Object[] { keys, values };
        }

        final java.lang.Object[] afterArray;
        {
          final int size = flatMapPeek1after.size();
          final int[] keys = new int[size];
          final int[] values = new int[size];
          int i = 0;
          for (final int key : flatMapPeek1after.keySet()) {
            final int value = flatMapPeek1after.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          afterArray = new java.lang.Object[] { keys, values };
        }
        info[1] = new java.lang.Object[] {beforeArray, afterArray};
      }
      {
        final java.lang.Object[] beforeArray;
        {
          final int size = distinctPeek2before.size();
          final int[] keys = new int[size];
          final int[] values = new int[size];
          int i = 0;
          for (final int key : distinctPeek2before.keySet()) {
            final int value = distinctPeek2before.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          beforeArray = new java.lang.Object[] { keys, values };
        }

        final java.lang.Object[] afterArray;
        {
          final int size = distinctPeek2after.size();
          final int[] keys = new int[size];
          final int[] values = new int[size];
          int i = 0;
          for (final int key : distinctPeek2after.keySet()) {
            final int value = distinctPeek2after.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          afterArray = new java.lang.Object[] { keys, values };
        }
        {
          for (final int timeAfter : distinct2ReverseUtil.keySet()) {
            final java.lang.Object afterValue = distinctPeek2after.get(timeAfter);
            final java.util.Map<java.lang.Integer, java.lang.Integer> valuesBefore = distinct2Store.get(afterValue);
            for (final int timeBefore : valuesBefore.keySet()) {
              distinct2Resolve.put(timeBefore, timeAfter);
            }
          }
        }
        final java.lang.Object[] resolve;
        {
          final int size = distinct2Resolve.size();
          final int[] keys = new int[size];
          final int[] values = new int[size];
          int i = 0;
          for (final int key : distinct2Resolve.keySet()) {
            final int value = distinct2Resolve.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          resolve = new java.lang.Object[] { keys, values };
        }
        final java.lang.Object peekResult = new java.lang.Object[] {beforeArray, afterArray};
        info[2] = new java.lang.Object[] { peekResult, resolve };
      }
      {
        final java.lang.Object[] beforeArray;
        {
          final int size = sortedPeek3before.size();
          final int[] keys = new int[size];
          final int[] values = new int[size];
          int i = 0;
          for (final int key : sortedPeek3before.keySet()) {
            final int value = sortedPeek3before.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          beforeArray = new java.lang.Object[] { keys, values };
        }

        final java.lang.Object[] afterArray;
        {
          final int size = sortedPeek3after.size();
          final int[] keys = new int[size];
          final int[] values = new int[size];
          int i = 0;
          for (final int key : sortedPeek3after.keySet()) {
            final int value = sortedPeek3after.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          afterArray = new java.lang.Object[] { keys, values };
        }
        info[3] = new java.lang.Object[] {beforeArray, afterArray};
      }
      {
        final java.lang.Object[] beforeArray;
        {
          final int size = terminatorPeek2147483647before.size();
          final int[] keys = new int[size];
          final int[] values = new int[size];
          int i = 0;
          for (final int key : terminatorPeek2147483647before.keySet()) {
            final int value = terminatorPeek2147483647before.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          beforeArray = new java.lang.Object[] { keys, values };
        }

        final java.lang.Object[] afterArray;
        {
          final int size = terminatorPeek2147483647after.size();
          final int[] keys = new int[size];
          final java.lang.Object[] values = new java.lang.Object[size];
          int i = 0;
          for (final int key : terminatorPeek2147483647after.keySet()) {
            final java.lang.Object value = terminatorPeek2147483647after.get(key);
            keys[i] = key;
            values[i] = value;
            i++;
          }
          afterArray = new java.lang.Object[] { keys, values };
        }
        info[4] = new java.lang.Object[] {beforeArray, afterArray};
      }
      final long[] elapsedTime = new long[]{ java.lang.System.nanoTime() - startTime };
      myRes = new java.lang.Object[]{ info, streamResult, elapsedTime };

    }
    myRes;