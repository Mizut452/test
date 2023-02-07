package com.example.test.Mapper;

import com.example.test.Model.Entity.Member;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface MemberMapper {
    @Select("SELECT * FROM Member WHERE memberId = #{memberId}")
    Member selectByMemberId(@Param("memberId") int memberId);

    @Select("SELECT * FROM Member WHERE memberId = #{memberId}")
    List<Member> selectListByMemberId(@Param("memberId") int memberId);
}
