package com {
  package lankun {

    object Utils {
      def percentOf(value: Double, rate: Double) = value * rate / 100
    }

    package impatient.people {

      class Employee extends Person {

        override def toString: String = super.toString + "[salary=" + salary + "]"

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
