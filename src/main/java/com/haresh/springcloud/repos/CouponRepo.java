package com.haresh.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.haresh.springcloud.model.Coupon;

/**
 * @author hudaysha
 *
 */
public interface CouponRepo extends JpaRepository<Coupon, Long> {

	Coupon findByCode(String code);

}
