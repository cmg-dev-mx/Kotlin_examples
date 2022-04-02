object FirstAndLastPosition {

    fun validate(arr: Array<Int>, target: Int): Array<Int> {
        if (arr.isEmpty()) {
            return arrayOf(-1, -1)
        }

        for (i in arr.indices) {
            if (arr[i] == target) {
                var end = i
                while (end + 1 < arr.size && arr[end + 1] == target) {
                    end++
                }

                return arrayOf(i, end)
            }
        }

        return arrayOf(-1, -1)
    }

    fun validateBinarySearch(arr: Array<Int>, target: Int): Array<Int> {
        if (arr.isEmpty()
            || target < arr[0]
            || arr[arr.size - 1] < target) {
            return arrayOf(-1, -1)
        }
        val start = findStart(arr, target)
        val end = findEnd(arr, target)
        return arrayOf(start, end)
    }

    private fun findStart(arr: Array<Int>, target: Int): Int {
        if (arr[0] == target) {
            return 0
        }
        var left = 0
        var right = arr.size - 1
        while (left <= right) {
            val middle = (left + right) / 2
            if (arr[middle] == target && arr[middle - 1] != target) {
                return middle
            } else if (arr[middle] < target) {
                left = middle + 1
            } else {
                right = middle - 1
            }
        }
        return -1
    }

    private fun findEnd(arr: Array<Int>, target: Int): Int {
        if (arr[arr.size - 1] == target) {
            return arr.size - 1
        }
        var left = 0
        var right = arr.size - 1
        while (left <= right) {
            val middle = (left + right) / 2
            if (arr[middle] == target && arr[middle + 1] != target) {
                return middle
            } else if (target < arr[middle]) {
                right = middle - 1
            } else {
                left = middle + 1
            }
        }
        return -1
    }


}