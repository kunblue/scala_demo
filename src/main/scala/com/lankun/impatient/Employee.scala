package com {
  package lankun {

    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }

    package impatient {

      class Employee {
        def getRaise(rate: scala.Double): Unit = {
          scalary += Utils.percentOf(scalary, rate)
        }

      }

    }

  }

}

package org {
  package lankun {

    class Counter {

    }

  }

}
