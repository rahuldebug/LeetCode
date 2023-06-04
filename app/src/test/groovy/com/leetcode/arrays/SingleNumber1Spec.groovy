package com.leetcode.arrays

import spock.lang.Specification

class SingleNumber1Spec extends Specification{
    SingleNumber1 singleNumber1= new SingleNumber1();
    def " should return single number "(){
        given :
        def arr=[1,2,1,3,4,4,3] as int[]

        when:
        def result= singleNumber1.singleNumber(arr)

        then:
        result==2
    }
}
