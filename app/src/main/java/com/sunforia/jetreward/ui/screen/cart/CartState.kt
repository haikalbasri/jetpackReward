package com.sunforia.jetreward.ui.screen.cart

import com.sunforia.jetreward.model.OrderReward

data class CartState(
    val orderReward: List<OrderReward>,
    val totalRequiredPoint: Int
)
