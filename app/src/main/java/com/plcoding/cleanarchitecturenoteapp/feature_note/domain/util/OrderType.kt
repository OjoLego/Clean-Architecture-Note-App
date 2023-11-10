package com.plcoding.cleanarchitecturenoteapp.feature_note.domain.util

/*
class for logic in use cases
 */
sealed class OrderType{
    object Ascending: OrderType()
    object Descending: OrderType()
}
