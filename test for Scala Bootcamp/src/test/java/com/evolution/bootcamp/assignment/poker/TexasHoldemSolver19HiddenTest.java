
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver19HiddenTest {


  @Test
  public void test_texas_holdem_4750_4c6s8h9cTs_QsKh_6c5h_Kd7c_JdJc_Qd9d_4dAd_6hQh_7hTh() {
    assertEquals(
      "QsKh 4dAd 6c5h 6hQh Qd9d JdJc 7hTh=Kd7c",
      Solver.process("texas-holdem 4c6s8h9cTs QsKh 6c5h Kd7c JdJc Qd9d 4dAd 6hQh 7hTh"));
  }

  @Test
  public void test_texas_holdem_4751_2d8hAdJdKd_9dAs_QsJs_KsKc_8c7c_8s7d_Ah6d_4c5h_2s2c() {
    assertEquals(
      "4c5h 8c7c QsJs 2s2c KsKc Ah6d 8s7d 9dAs",
      Solver.process("texas-holdem 2d8hAdJdKd 9dAs QsJs KsKc 8c7c 8s7d Ah6d 4c5h 2s2c"));
  }

  @Test
  public void test_texas_holdem_4752_3d4s8s9sAh_3cTd_AcJs_3s6c_6dJc_2c2d_Qs2s_8h4c() {
    assertEquals(
      "6dJc 2c2d 3s6c 3cTd AcJs 8h4c Qs2s",
      Solver.process("texas-holdem 3d4s8s9sAh 3cTd AcJs 3s6c 6dJc 2c2d Qs2s 8h4c"));
  }

  @Test
  public void test_texas_holdem_4753_3c5c5dJhKh_4c2c_Th6c_7d3s_6d2h_KcQc() {
    assertEquals(
      "4c2c 6d2h Th6c 7d3s KcQc",
      Solver.process("texas-holdem 3c5c5dJhKh 4c2c Th6c 7d3s 6d2h KcQc"));
  }

  @Test
  public void test_texas_holdem_4754_2h4d9dKcTh_4hKd_Qc3d_4c7c_5hJc_Qd3h_2c8c_8d2d_9s9c() {
    assertEquals(
      "5hJc Qc3d=Qd3h 2c8c=8d2d 4c7c 4hKd 9s9c",
      Solver.process("texas-holdem 2h4d9dKcTh 4hKd Qc3d 4c7c 5hJc Qd3h 2c8c 8d2d 9s9c"));
  }

  @Test
  public void test_texas_holdem_4755_3d6d9dAdTh_KsJc_4sKc_5d8c() {
    assertEquals(
      "4sKc KsJc 5d8c",
      Solver.process("texas-holdem 3d6d9dAdTh KsJc 4sKc 5d8c"));
  }

  @Test
  public void test_texas_holdem_4756_4d5d7c7dTs_Kd3c_Ah3d_As5c_KcJc() {
    assertEquals(
      "Kd3c KcJc Ah3d As5c",
      Solver.process("texas-holdem 4d5d7c7dTs Kd3c Ah3d As5c KcJc"));
  }

  @Test
  public void test_texas_holdem_4757_7c7s9cJdTh_4d4c_Ad7h_3sKc_Td5h() {
    assertEquals(
      "3sKc 4d4c Td5h Ad7h",
      Solver.process("texas-holdem 7c7s9cJdTh 4d4c Ad7h 3sKc Td5h"));
  }

  @Test
  public void test_texas_holdem_4758_2s6c7sAsTh_Qh9d_Kh6s_7hKd_JcTc_9h2d() {
    assertEquals(
      "Qh9d 9h2d Kh6s 7hKd JcTc",
      Solver.process("texas-holdem 2s6c7sAsTh Qh9d Kh6s 7hKd JcTc 9h2d"));
  }

  @Test
  public void test_texas_holdem_4759_3c7c9sAhQh_6dKc_8d4h_4c9d() {
    assertEquals(
      "8d4h 6dKc 4c9d",
      Solver.process("texas-holdem 3c7c9sAhQh 6dKc 8d4h 4c9d"));
  }

  @Test
  public void test_texas_holdem_4760_4h5s6hAhKh_6d9d_Td7c_Qc7s_7d4s_JhQs_KdAs_8d9c_6c6s() {
    assertEquals(
      "8d9c Td7c Qc7s 7d4s 6d9d KdAs 6c6s JhQs",
      Solver.process("texas-holdem 4h5s6hAhKh 6d9d Td7c Qc7s 7d4s JhQs KdAs 8d9c 6c6s"));
  }

  @Test
  public void test_texas_holdem_4761_4h5c7dJcTh_3c7h_Kd3s_2d3d() {
    assertEquals(
      "2d3d Kd3s 3c7h",
      Solver.process("texas-holdem 4h5c7dJcTh 3c7h Kd3s 2d3d"));
  }

  @Test
  public void test_texas_holdem_4762_3d3s4h5d8s_As7d_2sTc_9h5c() {
    assertEquals(
      "2sTc As7d 9h5c",
      Solver.process("texas-holdem 3d3s4h5d8s As7d 2sTc 9h5c"));
  }

  @Test
  public void test_texas_holdem_4763_2s3c4h6sJd_8cQh_6h7s_3h5c_9hJc() {
    assertEquals(
      "8cQh 6h7s 9hJc 3h5c",
      Solver.process("texas-holdem 2s3c4h6sJd 8cQh 6h7s 3h5c 9hJc"));
  }

  @Test
  public void test_texas_holdem_4764_5d8c9dAsQd_TdQh_4hQs_5c2h_3d2d() {
    assertEquals(
      "5c2h 4hQs TdQh 3d2d",
      Solver.process("texas-holdem 5d8c9dAsQd TdQh 4hQs 5c2h 3d2d"));
  }

  @Test
  public void test_texas_holdem_4765_8cAhKdKsQd_Ts8h_9hTc() {
    assertEquals(
      "9hTc Ts8h",
      Solver.process("texas-holdem 8cAhKdKsQd Ts8h 9hTc"));
  }

  @Test
  public void test_texas_holdem_4766_5sJcJdQdTh_9cJh_5h9h_Ah4h_3c4c_6c4d_Ac8s_2s5d_Tc7d() {
    assertEquals(
      "3c4c 6c4d Ac8s=Ah4h 2s5d=5h9h Tc7d 9cJh",
      Solver.process("texas-holdem 5sJcJdQdTh 9cJh 5h9h Ah4h 3c4c 6c4d Ac8s 2s5d Tc7d"));
  }

  @Test
  public void test_texas_holdem_4767_4s5dAsJhQd_ThQh_3hKs_KdJd_7cJc_4h4c() {
    assertEquals(
      "3hKs 7cJc KdJd ThQh 4h4c",
      Solver.process("texas-holdem 4s5dAsJhQd ThQh 3hKs KdJd 7cJc 4h4c"));
  }

  @Test
  public void test_texas_holdem_4768_2c9dAcJsQh_TdJh_QdKh() {
    assertEquals(
      "TdJh QdKh",
      Solver.process("texas-holdem 2c9dAcJsQh TdJh QdKh"));
  }

  @Test
  public void test_texas_holdem_4769_6c7c8d8hJh_7hAc_6h9s_TdTh_Jd4h() {
    assertEquals(
      "6h9s 7hAc TdTh Jd4h",
      Solver.process("texas-holdem 6c7c8d8hJh 7hAc 6h9s TdTh Jd4h"));
  }

  @Test
  public void test_texas_holdem_4770_2c2h3h9d9h_Td4d_Jd2s_6h4h_Ks2d() {
    assertEquals(
      "Td4d 6h4h Jd2s=Ks2d",
      Solver.process("texas-holdem 2c2h3h9d9h Td4d Jd2s 6h4h Ks2d"));
  }

  @Test
  public void test_texas_holdem_4771_4c4s5s6sQc_8c7s_4dAh_AcKd_7c3c_Qd8s_9cJd_5dQh_Jc7d() {
    assertEquals(
      "Jc7d 9cJd AcKd Qd8s 5dQh 4dAh 7c3c 8c7s",
      Solver.process("texas-holdem 4c4s5s6sQc 8c7s 4dAh AcKd 7c3c Qd8s 9cJd 5dQh Jc7d"));
  }

  @Test
  public void test_texas_holdem_4772_4d4hQhTdTh_Tc6d_Jh6s_9d5d() {
    assertEquals(
      "9d5d=Jh6s Tc6d",
      Solver.process("texas-holdem 4d4hQhTdTh Tc6d Jh6s 9d5d"));
  }

  @Test
  public void test_texas_holdem_4773_2c3h3s5dTc_QdKc_5sJh_7sAs_4h9s() {
    assertEquals(
      "4h9s QdKc 7sAs 5sJh",
      Solver.process("texas-holdem 2c3h3s5dTc QdKc 5sJh 7sAs 4h9s"));
  }

  @Test
  public void test_texas_holdem_4774_2d6dJcKdKh_Ac7s_Js7d_Td2s_9h5s() {
    assertEquals(
      "9h5s Ac7s Td2s Js7d",
      Solver.process("texas-holdem 2d6dJcKdKh Ac7s Js7d Td2s 9h5s"));
  }

  @Test
  public void test_texas_holdem_4775_3s5sAcKsQc_7d2d_Kd3c_Jh9h_AdKc_Qd7s_4d2s_5dAs_Kh3h() {
    assertEquals(
      "7d2d Jh9h Qd7s Kd3c=Kh3h 5dAs AdKc 4d2s",
      Solver.process("texas-holdem 3s5sAcKsQc 7d2d Kd3c Jh9h AdKc Qd7s 4d2s 5dAs Kh3h"));
  }

  @Test
  public void test_texas_holdem_4776_5h6h7c9dJc_KsKc_4c2s_2d8d() {
    assertEquals(
      "4c2s KsKc 2d8d",
      Solver.process("texas-holdem 5h6h7c9dJc KsKc 4c2s 2d8d"));
  }

  @Test
  public void test_texas_holdem_4777_2h3s6sAhQd_ThKc_8hAc_8s9s() {
    assertEquals(
      "8s9s ThKc 8hAc",
      Solver.process("texas-holdem 2h3s6sAhQd ThKc 8hAc 8s9s"));
  }

  @Test
  public void test_texas_holdem_4778_7c7d8dAhTs_6cAc_6sJs_2s4d_6d8h_9h2h_2d3c() {
    assertEquals(
      "2d3c=2s4d 9h2h 6sJs 6d8h 6cAc",
      Solver.process("texas-holdem 7c7d8dAhTs 6cAc 6sJs 2s4d 6d8h 9h2h 2d3c"));
  }

  @Test
  public void test_texas_holdem_4779_4s8h9c9hKh_8s3d_8d6h() {
    assertEquals(
      "8d6h=8s3d",
      Solver.process("texas-holdem 4s8h9c9hKh 8s3d 8d6h"));
  }

  @Test
  public void test_texas_holdem_4780_5d7hAcKhTh_4sJs_QdTs_3h2c_8sJh_4d4c_Jc3s() {
    assertEquals(
      "3h2c 4sJs=Jc3s 8sJh 4d4c QdTs",
      Solver.process("texas-holdem 5d7hAcKhTh 4sJs QdTs 3h2c 8sJh 4d4c Jc3s"));
  }

  @Test
  public void test_texas_holdem_4781_2c9hAcKcKd_3c4d_5cJc_4s6c() {
    assertEquals(
      "3c4d 4s6c 5cJc",
      Solver.process("texas-holdem 2c9hAcKcKd 3c4d 5cJc 4s6c"));
  }

  @Test
  public void test_texas_holdem_4782_2d4c9d9hAd_2s4s_Qh3c_6dAc_Jd4h_QsKd_JcJs_Kh3h() {
    assertEquals(
      "Qh3c Kh3h QsKd 2s4s=Jd4h JcJs 6dAc",
      Solver.process("texas-holdem 2d4c9d9hAd 2s4s Qh3c 6dAc Jd4h QsKd JcJs Kh3h"));
  }

  @Test
  public void test_texas_holdem_4783_4s6h8s9sAs_Ts5h_2d7s_3cKd_5cJc_4cTc_3hQd_5dQc_8h8d() {
    assertEquals(
      "5cJc 3hQd=5dQc 3cKd 4cTc 8h8d 2d7s Ts5h",
      Solver.process("texas-holdem 4s6h8s9sAs Ts5h 2d7s 3cKd 5cJc 4cTc 3hQd 5dQc 8h8d"));
  }

  @Test
  public void test_texas_holdem_4784_3s7d8cJdQc_5dQh_Kd6s_2sJs_3h8s_5h9h_7c5c() {
    assertEquals(
      "5h9h Kd6s 7c5c 2sJs 5dQh 3h8s",
      Solver.process("texas-holdem 3s7d8cJdQc 5dQh Kd6s 2sJs 3h8s 5h9h 7c5c"));
  }

  @Test
  public void test_texas_holdem_4785_5s6c6dJdKc_Jc4c_Qs9s_Ks5d() {
    assertEquals(
      "Qs9s Jc4c Ks5d",
      Solver.process("texas-holdem 5s6c6dJdKc Jc4c Qs9s Ks5d"));
  }

  @Test
  public void test_texas_holdem_4786_8d8h9hJsKh_6hAh_As9d() {
    assertEquals(
      "As9d 6hAh",
      Solver.process("texas-holdem 8d8h9hJsKh 6hAh As9d"));
  }

  @Test
  public void test_texas_holdem_4787_4c6cKhQcTs_Ks5s_6sTh_8h2d_7hQd_Ah3c_Kc4s_2h9s_9cJh_3s9h() {
    assertEquals(
      "8h2d 2h9s=3s9h Ah3c 7hQd Ks5s 6sTh Kc4s 9cJh",
      Solver.process("texas-holdem 4c6cKhQcTs Ks5s 6sTh 8h2d 7hQd Ah3c Kc4s 2h9s 9cJh 3s9h"));
  }

  @Test
  public void test_texas_holdem_4788_5s8h9d9hTh_QhAs_QdJs_4h6h_JdQs_5c9c() {
    assertEquals(
      "QhAs JdQs=QdJs 4h6h 5c9c",
      Solver.process("texas-holdem 5s8h9d9hTh QhAs QdJs 4h6h JdQs 5c9c"));
  }

  @Test
  public void test_texas_holdem_4789_2d3d7hAdTh_4s3s_6h5d_2s2h_8hQd_TsKh() {
    assertEquals(
      "6h5d 8hQd 4s3s TsKh 2s2h",
      Solver.process("texas-holdem 2d3d7hAdTh 4s3s 6h5d 2s2h 8hQd TsKh"));
  }

  @Test
  public void test_texas_holdem_4790_6h7dAhKdTs_8s4h_7h7s_Kc5s_JsJh() {
    assertEquals(
      "8s4h JsJh Kc5s 7h7s",
      Solver.process("texas-holdem 6h7dAhKdTs 8s4h 7h7s Kc5s JsJh"));
  }

  @Test
  public void test_texas_holdem_4791_3c4s7h7s9d_5h4d_JhQh_6d9c() {
    assertEquals(
      "JhQh 5h4d 6d9c",
      Solver.process("texas-holdem 3c4s7h7s9d 5h4d JhQh 6d9c"));
  }

  @Test
  public void test_texas_holdem_4792_4h4s5sJsTs_4cTh_6hAh() {
    assertEquals(
      "6hAh 4cTh",
      Solver.process("texas-holdem 4h4s5sJsTs 4cTh 6hAh"));
  }

  @Test
  public void test_texas_holdem_4793_8h9hAdJdQd_7h6d_4c4s_3dTc_8cJh_8s4d_3hKd_5cAs_3s8d_7d2s() {
    assertEquals(
      "7d2s=7h6d 3hKd 4c4s 3s8d=8s4d 5cAs 8cJh 3dTc",
      Solver.process("texas-holdem 8h9hAdJdQd 7h6d 4c4s 3dTc 8cJh 8s4d 3hKd 5cAs 3s8d 7d2s"));
  }

  @Test
  public void test_texas_holdem_4794_6hAcJsKsTh_AdKd_5h3h_6s5c_7s9c_8s2s_2hKh_Jh8c_4dAs_2d6d() {
    assertEquals(
      "5h3h 8s2s 7s9c 2d6d=6s5c Jh8c 2hKh 4dAs AdKd",
      Solver.process("texas-holdem 6hAcJsKsTh AdKd 5h3h 6s5c 7s9c 8s2s 2hKh Jh8c 4dAs 2d6d"));
  }

  @Test
  public void test_texas_holdem_4795_6d6h9hKcKh_Ad4s_7c9s_4d8s_ThTc_QhAc_Jh2s_7d7s_Ks8c_6s5d() {
    assertEquals(
      "4d8s Jh2s Ad4s=QhAc 7d7s 7c9s ThTc 6s5d Ks8c",
      Solver.process("texas-holdem 6d6h9hKcKh Ad4s 7c9s 4d8s ThTc QhAc Jh2s 7d7s Ks8c 6s5d"));
  }

  @Test
  public void test_texas_holdem_4796_3d3s8dAdTh_6cAc_TsKd_TcTd() {
    assertEquals(
      "TsKd 6cAc TcTd",
      Solver.process("texas-holdem 3d3s8dAdTh 6cAc TsKd TcTd"));
  }

  @Test
  public void test_texas_holdem_4797_2c4s5s6h9d_Kh8s_Ac5d_2s8c_Qd4c_Ts3c_8h3s_9sAd_Jc5h_KdKs() {
    assertEquals(
      "Kh8s 2s8c Qd4c Jc5h Ac5d 9sAd KdKs 8h3s=Ts3c",
      Solver.process("texas-holdem 2c4s5s6h9d Kh8s Ac5d 2s8c Qd4c Ts3c 8h3s 9sAd Jc5h KdKs"));
  }

  @Test
  public void test_texas_holdem_4798_2d4s5dQcQd_TdKc_Ts7c_JhKd() {
    assertEquals(
      "Ts7c TdKc JhKd",
      Solver.process("texas-holdem 2d4s5dQcQd TdKc Ts7c JhKd"));
  }

  @Test
  public void test_texas_holdem_4799_4s5c7cJdKh_3dJc_9d3h_2dQs_As4h_7hQc_3s8s_Ad6s() {
    assertEquals(
      "3s8s 9d3h 2dQs Ad6s As4h 7hQc 3dJc",
      Solver.process("texas-holdem 4s5c7cJdKh 3dJc 9d3h 2dQs As4h 7hQc 3s8s Ad6s"));
  }

  @Test
  public void test_texas_holdem_4800_2d7c7d8cTd_5d4h_AcJh() {
    assertEquals(
      "5d4h AcJh",
      Solver.process("texas-holdem 2d7c7d8cTd 5d4h AcJh"));
  }

  @Test
  public void test_texas_holdem_4801_2h4s7c8sAh_4hAc_Ts3h_2sAd_5cJc_5s9h() {
    assertEquals(
      "5s9h Ts3h 5cJc 2sAd 4hAc",
      Solver.process("texas-holdem 2h4s7c8sAh 4hAc Ts3h 2sAd 5cJc 5s9h"));
  }

  @Test
  public void test_texas_holdem_4802_6c7sKcQdTd_4sQc_4cJs_3c4h_5s6d_JhQh_2c5c_Jc9s_Kh7c_4d2s() {
    assertEquals(
      "2c5c=3c4h=4d2s 4cJs 5s6d 4sQc JhQh Kh7c Jc9s",
      Solver.process("texas-holdem 6c7sKcQdTd 4sQc 4cJs 3c4h 5s6d JhQh 2c5c Jc9s Kh7c 4d2s"));
  }

  @Test
  public void test_texas_holdem_4803_2d8sJsKhKs_7c3d_AsAh_KdQh_JdAc_5h5d_7s2h_Ad6h_TdTh_7d9h() {
    assertEquals(
      "7c3d 7d9h Ad6h 7s2h 5h5d TdTh JdAc AsAh KdQh",
      Solver.process("texas-holdem 2d8sJsKhKs 7c3d AsAh KdQh JdAc 5h5d 7s2h Ad6h TdTh 7d9h"));
  }

  @Test
  public void test_texas_holdem_4804_3d9sKcKhQc_4c3h_TsTh_8d5c_As3s_5s2d_9cKd_8cAh_6h9d() {
    assertEquals(
      "5s2d 8d5c 8cAh 4c3h As3s 6h9d TsTh 9cKd",
      Solver.process("texas-holdem 3d9sKcKhQc 4c3h TsTh 8d5c As3s 5s2d 9cKd 8cAh 6h9d"));
  }

  @Test
  public void test_texas_holdem_4805_3c5s8s9dAs_7hKc_4dTs_Ac6h() {
    assertEquals(
      "4dTs 7hKc Ac6h",
      Solver.process("texas-holdem 3c5s8s9dAs 7hKc 4dTs Ac6h"));
  }

  @Test
  public void test_texas_holdem_4806_2h5d7s8dTc_4hKh_3dKs_QhQs_Jc7h_5h8h_4s9d_5s6d_8cJd() {
    assertEquals(
      "4s9d 3dKs=4hKh 5s6d Jc7h 8cJd QhQs 5h8h",
      Solver.process("texas-holdem 2h5d7s8dTc 4hKh 3dKs QhQs Jc7h 5h8h 4s9d 5s6d 8cJd"));
  }

  @Test
  public void test_texas_holdem_4807_5s7c8sTcTs_2cQc_Jc6h_Kc9s_4hAc_5cQs_9c2h_6c9d() {
    assertEquals(
      "9c2h Jc6h 2cQc Kc9s 4hAc 5cQs 6c9d",
      Solver.process("texas-holdem 5s7c8sTcTs 2cQc Jc6h Kc9s 4hAc 5cQs 9c2h 6c9d"));
  }

  @Test
  public void test_texas_holdem_4808_2s8hKdQcTh_6hQd_3h4s_KhAh() {
    assertEquals(
      "3h4s 6hQd KhAh",
      Solver.process("texas-holdem 2s8hKdQcTh 6hQd 3h4s KhAh"));
  }

  @Test
  public void test_texas_holdem_4809_2s5h6d8hKh_5dTd_9c7s_4dJs_8c4c_AcQc() {
    assertEquals(
      "4dJs AcQc 5dTd 8c4c 9c7s",
      Solver.process("texas-holdem 2s5h6d8hKh 5dTd 9c7s 4dJs 8c4c AcQc"));
  }

  @Test
  public void test_texas_holdem_4810_2s3d8d9hAh_Qh7d_Qc3s_4dKs() {
    assertEquals(
      "Qh7d 4dKs Qc3s",
      Solver.process("texas-holdem 2s3d8d9hAh Qh7d Qc3s 4dKs"));
  }

  @Test
  public void test_texas_holdem_4811_3d4c6hJdTc_6d9d_7sKd_Qs8c_Ks9h_Ts8h_Qd2s() {
    assertEquals(
      "Qd2s Qs8c 7sKd Ks9h 6d9d Ts8h",
      Solver.process("texas-holdem 3d4c6hJdTc 6d9d 7sKd Qs8c Ks9h Ts8h Qd2s"));
  }

  @Test
  public void test_texas_holdem_4812_8hKsQcQdTh_4c2s_2h5c_Td6c_5sJh_Ac2c() {
    assertEquals(
      "2h5c=4c2s 5sJh Ac2c Td6c",
      Solver.process("texas-holdem 8hKsQcQdTh 4c2s 2h5c Td6c 5sJh Ac2c"));
  }

  @Test
  public void test_texas_holdem_4813_7h8s9dJsTd_7d2s_KsKc_Tc9h() {
    assertEquals(
      "7d2s=KsKc=Tc9h",
      Solver.process("texas-holdem 7h8s9dJsTd 7d2s KsKc Tc9h"));
  }

  @Test
  public void test_texas_holdem_4814_6h8dJhQsTh_4c7h_9cKc_8cJc_8hTc_Ah5h() {
    assertEquals(
      "4c7h 8hTc 8cJc 9cKc Ah5h",
      Solver.process("texas-holdem 6h8dJhQsTh 4c7h 9cKc 8cJc 8hTc Ah5h"));
  }

  @Test
  public void test_texas_holdem_4815_2s6d8dAcQc_4c3d_KsTd_8hTh() {
    assertEquals(
      "4c3d KsTd 8hTh",
      Solver.process("texas-holdem 2s6d8dAcQc 4c3d KsTd 8hTh"));
  }

  @Test
  public void test_texas_holdem_4816_4d8dJhKcQc_2s5s_6hQh_3s9d_9s4s() {
    assertEquals(
      "2s5s 3s9d 9s4s 6hQh",
      Solver.process("texas-holdem 4d8dJhKcQc 2s5s 6hQh 3s9d 9s4s"));
  }

  @Test
  public void test_texas_holdem_4817_2d4c4d8dQd_2s9d_Ts8s_3h7d() {
    assertEquals(
      "Ts8s 3h7d 2s9d",
      Solver.process("texas-holdem 2d4c4d8dQd 2s9d Ts8s 3h7d"));
  }

  @Test
  public void test_texas_holdem_4818_4c5s6c9dJs_6sKd_4d9s_3s3c_2d5c_AdKc_8cAh_JcQs() {
    assertEquals(
      "8cAh AdKc 3s3c 2d5c 6sKd JcQs 4d9s",
      Solver.process("texas-holdem 4c5s6c9dJs 6sKd 4d9s 3s3c 2d5c AdKc 8cAh JcQs"));
  }

  @Test
  public void test_texas_holdem_4819_4s7cAhJsTh_Ac2d_2c5c() {
    assertEquals(
      "2c5c Ac2d",
      Solver.process("texas-holdem 4s7cAhJsTh Ac2d 2c5c"));
  }

  @Test
  public void test_texas_holdem_4820_3h4d8hKcTh_Js6d_9h6h_5dKh_4hTd_6c7s_4s3c_9dAs_Ts5h_7d2h() {
    assertEquals(
      "7d2h 6c7s Js6d 9dAs Ts5h 5dKh 4s3c 4hTd 9h6h",
      Solver.process("texas-holdem 3h4d8hKcTh Js6d 9h6h 5dKh 4hTd 6c7s 4s3c 9dAs Ts5h 7d2h"));
  }

  @Test
  public void test_texas_holdem_4821_2h6c7cJsKs_7hTd_4s7d_Kh8h_5dQc_3s4d_3h9h() {
    assertEquals(
      "3s4d 3h9h 5dQc 4s7d 7hTd Kh8h",
      Solver.process("texas-holdem 2h6c7cJsKs 7hTd 4s7d Kh8h 5dQc 3s4d 3h9h"));
  }

  @Test
  public void test_texas_holdem_4822_2h5d6cAcQs_7s6s_7c3h_Ks8c_5sTs_3c4s_Kc6d() {
    assertEquals(
      "7c3h Ks8c 5sTs 7s6s Kc6d 3c4s",
      Solver.process("texas-holdem 2h5d6cAcQs 7s6s 7c3h Ks8c 5sTs 3c4s Kc6d"));
  }

  @Test
  public void test_texas_holdem_4823_3s6h7hJdTc_9dAd_Ac8c_9s8h_3hKh_Th2d_3c9c_3dJc_6sKs_TsKd() {
    assertEquals(
      "Ac8c 9dAd 3c9c 3hKh 6sKs Th2d TsKd 3dJc 9s8h",
      Solver.process("texas-holdem 3s6h7hJdTc 9dAd Ac8c 9s8h 3hKh Th2d 3c9c 3dJc 6sKs TsKd"));
  }

  @Test
  public void test_texas_holdem_4824_5h6h7s8c9s_Tc2h_Kh6c_Qs8s_Ac4h_9d4s() {
    assertEquals(
      "9d4s=Ac4h=Kh6c=Qs8s Tc2h",
      Solver.process("texas-holdem 5h6h7s8c9s Tc2h Kh6c Qs8s Ac4h 9d4s"));
  }

  @Test
  public void test_texas_holdem_4825_3c9hJhQcQd_Ts6c_9sKc_5c7h_7sJc_QsKh_Td9d_4dAs() {
    assertEquals(
      "5c7h Ts6c 4dAs Td9d 9sKc 7sJc QsKh",
      Solver.process("texas-holdem 3c9hJhQcQd Ts6c 9sKc 5c7h 7sJc QsKh Td9d 4dAs"));
  }

  @Test
  public void test_texas_holdem_4826_4s6dAdKcKd_Ah9s_2h5c_9d3c_As8s_Jc3d_ThQh_Qs2d_6c8d() {
    assertEquals(
      "2h5c 9d3c Jc3d Qs2d ThQh 6c8d As8s Ah9s",
      Solver.process("texas-holdem 4s6dAdKcKd Ah9s 2h5c 9d3c As8s Jc3d ThQh Qs2d 6c8d"));
  }

  @Test
  public void test_texas_holdem_4827_2d4c8hAsKd_8cKc_3dAh_4h4s_Qh9h_3h7h_Js3c_5dTh() {
    assertEquals(
      "3h7h 5dTh Js3c Qh9h 3dAh 8cKc 4h4s",
      Solver.process("texas-holdem 2d4c8hAsKd 8cKc 3dAh 4h4s Qh9h 3h7h Js3c 5dTh"));
  }

  @Test
  public void test_texas_holdem_4828_5d8c9sAhQc_Js7h_KhQh_8s9d_5s8d_3sTc_9hKs_2c6d_Ad7s() {
    assertEquals(
      "2c6d 3sTc Js7h 9hKs KhQh Ad7s 5s8d 8s9d",
      Solver.process("texas-holdem 5d8c9sAhQc Js7h KhQh 8s9d 5s8d 3sTc 9hKs 2c6d Ad7s"));
  }

  @Test
  public void test_texas_holdem_4829_6c9hAdKhQh_Ts5c_Kc9d_2c4s_TdAc_2sAs() {
    assertEquals(
      "2c4s Ts5c 2sAs TdAc Kc9d",
      Solver.process("texas-holdem 6c9hAdKhQh Ts5c Kc9d 2c4s TdAc 2sAs"));
  }

  @Test
  public void test_texas_holdem_4830_2d6hJcKcQd_TsTd_6c5d_3h4d_Th7c() {
    assertEquals(
      "3h4d Th7c 6c5d TsTd",
      Solver.process("texas-holdem 2d6hJcKcQd TsTd 6c5d 3h4d Th7c"));
  }

  @Test
  public void test_texas_holdem_4831_2s5hAcAsKd_4hQh_8cJs_Qc4s_Kc5d() {
    assertEquals(
      "8cJs 4hQh=Qc4s Kc5d",
      Solver.process("texas-holdem 2s5hAcAsKd 4hQh 8cJs Qc4s Kc5d"));
  }

  @Test
  public void test_texas_holdem_4832_4c5s8hKcQh_Jh7h_6cKh() {
    assertEquals(
      "Jh7h 6cKh",
      Solver.process("texas-holdem 4c5s8hKcQh Jh7h 6cKh"));
  }

  @Test
  public void test_texas_holdem_4833_4c6h7c8d9s_3hQd_5c9d_4h2h_JsJd() {
    assertEquals(
      "3hQd 4h2h JsJd 5c9d",
      Solver.process("texas-holdem 4c6h7c8d9s 3hQd 5c9d 4h2h JsJd"));
  }

  @Test
  public void test_texas_holdem_4834_3d4d6h9c9s_6d4s_Ts7c_3sJh_QcTc_ThKc_5c8h_4h3c_9h5s_2d7h() {
    assertEquals(
      "2d7h 5c8h Ts7c QcTc ThKc 3sJh 4h3c 6d4s 9h5s",
      Solver.process("texas-holdem 3d4d6h9c9s 6d4s Ts7c 3sJh QcTc ThKc 5c8h 4h3c 9h5s 2d7h"));
  }

  @Test
  public void test_texas_holdem_4835_2h8s9d9hKd_5h7s_AhQh_Kh7c_3c8c_3hTc_JdKc() {
    assertEquals(
      "5h7s 3hTc AhQh 3c8c Kh7c JdKc",
      Solver.process("texas-holdem 2h8s9d9hKd 5h7s AhQh Kh7c 3c8c 3hTc JdKc"));
  }

  @Test
  public void test_texas_holdem_4836_3h6cKcQdTd_4c6h_KhJc_7c6d_5hKd_9c8c_9s2d_3cKs_Tc9d_2h9h() {
    assertEquals(
      "2h9h=9s2d 9c8c 4c6h=7c6d Tc9d 5hKd KhJc 3cKs",
      Solver.process("texas-holdem 3h6cKcQdTd 4c6h KhJc 7c6d 5hKd 9c8c 9s2d 3cKs Tc9d 2h9h"));
  }

  @Test
  public void test_texas_holdem_4837_5h6d8d9cAc_6cQc_Tc3d() {
    assertEquals(
      "Tc3d 6cQc",
      Solver.process("texas-holdem 5h6d8d9cAc 6cQc Tc3d"));
  }

  @Test
  public void test_texas_holdem_4838_5c5h6dJcQd_Td2d_4d5d_9dJs_QhTc_4h3s_2hTs() {
    assertEquals(
      "4h3s 2hTs=Td2d 9dJs QhTc 4d5d",
      Solver.process("texas-holdem 5c5h6dJcQd Td2d 4d5d 9dJs QhTc 4h3s 2hTs"));
  }

  @Test
  public void test_texas_holdem_4839_2s6c8dJhTh_7h5d_Ts4s() {
    assertEquals(
      "7h5d Ts4s",
      Solver.process("texas-holdem 2s6c8dJhTh 7h5d Ts4s"));
  }

  @Test
  public void test_texas_holdem_4840_2s3s8s9cTc_7sQc_JcKh_3c9s_Kd4h_JdJh_9h3h_7d5s() {
    assertEquals(
      "7d5s 7sQc Kd4h JcKh JdJh 3c9s=9h3h",
      Solver.process("texas-holdem 2s3s8s9cTc 7sQc JcKh 3c9s Kd4h JdJh 9h3h 7d5s"));
  }

  @Test
  public void test_texas_holdem_4841_4c5h7cKcKh_Js3h_Th5s_As9h_4d5d_8sKd() {
    assertEquals(
      "Js3h As9h 4d5d Th5s 8sKd",
      Solver.process("texas-holdem 4c5h7cKcKh Js3h Th5s As9h 4d5d 8sKd"));
  }

  @Test
  public void test_texas_holdem_4842_6c7sAcJcQc_Jh3d_ThAd_4hJs_9sTd_KcAs_Kh9h_4c6h_Kd3h_4d8s() {
    assertEquals(
      "4d8s 9sTd Kd3h Kh9h 4hJs=Jh3d ThAd 4c6h KcAs",
      Solver.process("texas-holdem 6c7sAcJcQc Jh3d ThAd 4hJs 9sTd KcAs Kh9h 4c6h Kd3h 4d8s"));
  }

  @Test
  public void test_texas_holdem_4843_5d5h8h9cKc_9s6c_4h7c_6h7h_6sQh_Jd3h() {
    assertEquals(
      "4h7c Jd3h 6sQh 9s6c 6h7h",
      Solver.process("texas-holdem 5d5h8h9cKc 9s6c 4h7c 6h7h 6sQh Jd3h"));
  }

  @Test
  public void test_texas_holdem_4844_2d7s9cJhTh_Tc8s_2c5c_7d4c_3hKc_4s5d_7cQd() {
    assertEquals(
      "4s5d 3hKc 2c5c 7d4c 7cQd Tc8s",
      Solver.process("texas-holdem 2d7s9cJhTh Tc8s 2c5c 7d4c 3hKc 4s5d 7cQd"));
  }

  @Test
  public void test_texas_holdem_4845_8h9dAhKdTs_6hKc_3dAs_3c7h() {
    assertEquals(
      "3c7h 6hKc 3dAs",
      Solver.process("texas-holdem 8h9dAhKdTs 6hKc 3dAs 3c7h"));
  }

  @Test
  public void test_texas_holdem_4846_2h3c4c7hKh_9dJs_7s8h_9c4d_Kc3d() {
    assertEquals(
      "9dJs 9c4d 7s8h Kc3d",
      Solver.process("texas-holdem 2h3c4c7hKh 9dJs 7s8h 9c4d Kc3d"));
  }

  @Test
  public void test_texas_holdem_4847_2d7d9hKhKs_2c9s_Tc2h_Jc2s_AhJs_3c4c_TsQc_6d5c_3sTd() {
    assertEquals(
      "3c4c 6d5c 3sTd TsQc AhJs Tc2h Jc2s 2c9s",
      Solver.process("texas-holdem 2d7d9hKhKs 2c9s Tc2h Jc2s AhJs 3c4c TsQc 6d5c 3sTd"));
  }

  @Test
  public void test_texas_holdem_4848_3c3h5c7d8c_2cTd_Kh2s() {
    assertEquals(
      "2cTd Kh2s",
      Solver.process("texas-holdem 3c3h5c7d8c 2cTd Kh2s"));
  }

  @Test
  public void test_texas_holdem_4849_3s6h8sJcKd_3cTc_Js9d_TdAh() {
    assertEquals(
      "TdAh 3cTc Js9d",
      Solver.process("texas-holdem 3s6h8sJcKd 3cTc Js9d TdAh"));
  }

  @Test
  public void test_texas_holdem_4850_3h5h8cAcQd_JsKs_4dAh() {
    assertEquals(
      "JsKs 4dAh",
      Solver.process("texas-holdem 3h5h8cAcQd JsKs 4dAh"));
  }

  @Test
  public void test_texas_holdem_4851_3s5sJsKsQd_2s4s_5c3c_Kc3h_3d8s_Jc2d_6h6c() {
    assertEquals(
      "6h6c Jc2d 5c3c Kc3h 2s4s 3d8s",
      Solver.process("texas-holdem 3s5sJsKsQd 2s4s 5c3c Kc3h 3d8s Jc2d 6h6c"));
  }

  @Test
  public void test_texas_holdem_4852_3c6d8dKsTh_4s5c_Jh9s_9hQd_As4d_4hKd_6s9d() {
    assertEquals(
      "4s5c Jh9s 9hQd As4d 6s9d 4hKd",
      Solver.process("texas-holdem 3c6d8dKsTh 4s5c Jh9s 9hQd As4d 4hKd 6s9d"));
  }

  @Test
  public void test_texas_holdem_4853_3h4h7s9cQc_Th8c_8d3s_6h2d_6d6s_3c7h_9h3d_9d4c() {
    assertEquals(
      "6h2d Th8c 8d3s 6d6s 3c7h 9h3d 9d4c",
      Solver.process("texas-holdem 3h4h7s9cQc Th8c 8d3s 6h2d 6d6s 3c7h 9h3d 9d4c"));
  }

  @Test
  public void test_texas_holdem_4854_2h3dKsQhTh_Jh8c_9s7d_JsKc_5h2s_Ad2c_4cQc_5s4h() {
    assertEquals(
      "5s4h 9s7d Jh8c 5h2s Ad2c 4cQc JsKc",
      Solver.process("texas-holdem 2h3dKsQhTh Jh8c 9s7d JsKc 5h2s Ad2c 4cQc 5s4h"));
  }

  @Test
  public void test_texas_holdem_4855_4d5c8c9hJd_3cTh_6hJs_AsQh_QsAh_3dAd_7c2c_Ts2s() {
    assertEquals(
      "7c2c 3cTh=Ts2s 3dAd AsQh=QsAh 6hJs",
      Solver.process("texas-holdem 4d5c8c9hJd 3cTh 6hJs AsQh QsAh 3dAd 7c2c Ts2s"));
  }

  @Test
  public void test_texas_holdem_4856_2s8c8d9sJc_KcJd_5s3h_2d7s_5c4s_Qc9h_9d8h() {
    assertEquals(
      "5c4s=5s3h 2d7s Qc9h KcJd 9d8h",
      Solver.process("texas-holdem 2s8c8d9sJc KcJd 5s3h 2d7s 5c4s Qc9h 9d8h"));
  }

  @Test
  public void test_texas_holdem_4857_2h5cAsJdJh_3dTs_Ad8s_5hKh() {
    assertEquals(
      "3dTs 5hKh Ad8s",
      Solver.process("texas-holdem 2h5cAsJdJh 3dTs Ad8s 5hKh"));
  }

  @Test
  public void test_texas_holdem_4858_3h6d9hAcKh_Jh2h_Jc8c_3dTd_QhTh_Qc2s_TcQd_8s9c_4c6h() {
    assertEquals(
      "Jc8c Qc2s TcQd 3dTd 4c6h 8s9c Jh2h QhTh",
      Solver.process("texas-holdem 3h6d9hAcKh Jh2h Jc8c 3dTd QhTh Qc2s TcQd 8s9c 4c6h"));
  }

  @Test
  public void test_texas_holdem_4859_2s7d8c9dQh_2h8d_Ad3c_3h9h_Qd4d() {
    assertEquals(
      "Ad3c 3h9h Qd4d 2h8d",
      Solver.process("texas-holdem 2s7d8c9dQh 2h8d Ad3c 3h9h Qd4d"));
  }

  @Test
  public void test_texas_holdem_4860_3d7s8d8h9h_Qc6h_3sTh_9s7d_6s4d_9c4h_8c6d() {
    assertEquals(
      "6s4d Qc6h 3sTh 9c4h=9s7d 8c6d",
      Solver.process("texas-holdem 3d7s8d8h9h Qc6h 3sTh 9s7d 6s4d 9c4h 8c6d"));
  }

  @Test
  public void test_texas_holdem_4861_2d3h4s7hQh_Kc8c_QsJs_Jc7d_As5c_9hKs_Qc2h_6d5s_5h4d() {
    assertEquals(
      "Kc8c 9hKs 5h4d Jc7d QsJs Qc2h As5c 6d5s",
      Solver.process("texas-holdem 2d3h4s7hQh Kc8c QsJs Jc7d As5c 9hKs Qc2h 6d5s 5h4d"));
  }

  @Test
  public void test_texas_holdem_4862_3c3d7h9sQh_2d7d_5d4h() {
    assertEquals(
      "5d4h 2d7d",
      Solver.process("texas-holdem 3c3d7h9sQh 2d7d 5d4h"));
  }

  @Test
  public void test_texas_holdem_4863_5h8d8hQdTd_6s8s_2hAd_8cQh_7sTc_5c4h_As9h_2c6c_2dKh() {
    assertEquals(
      "2c6c 2dKh 2hAd=As9h 5c4h 7sTc 6s8s 8cQh",
      Solver.process("texas-holdem 5h8d8hQdTd 6s8s 2hAd 8cQh 7sTc 5c4h As9h 2c6c 2dKh"));
  }

  @Test
  public void test_texas_holdem_4864_2c3s5s7sAs_QcKs_2d6h() {
    assertEquals(
      "2d6h QcKs",
      Solver.process("texas-holdem 2c3s5s7sAs QcKs 2d6h"));
  }

  @Test
  public void test_texas_holdem_4865_3d4d4s7cJs_9sKh_2dAc_9cQs_Ad7d_TsAs_Jh6h() {
    assertEquals(
      "9cQs 9sKh 2dAc TsAs Ad7d Jh6h",
      Solver.process("texas-holdem 3d4d4s7cJs 9sKh 2dAc 9cQs Ad7d TsAs Jh6h"));
  }

  @Test
  public void test_texas_holdem_4866_5cJdQhQsTh_7c9h_6h2h_KdAd_2c7s_9c7d_Jh9s_2dTd_2s5s_9dQd() {
    assertEquals(
      "6h2h 2c7s 7c9h=9c7d 2s5s 2dTd Jh9s 9dQd KdAd",
      Solver.process("texas-holdem 5cJdQhQsTh 7c9h 6h2h KdAd 2c7s 9c7d Jh9s 2dTd 2s5s 9dQd"));
  }

  @Test
  public void test_texas_holdem_4867_4h5d5s7sJd_7h2h_6h8c_Qc4c_4s8d_2cQs_5h9c() {
    assertEquals(
      "2cQs 4s8d Qc4c 7h2h 5h9c 6h8c",
      Solver.process("texas-holdem 4h5d5s7sJd 7h2h 6h8c Qc4c 4s8d 2cQs 5h9c"));
  }

  @Test
  public void test_texas_holdem_4868_6d8hJdJsTs_4c3s_KcAh_7d3d_3c4h_5dKd_7hAs() {
    assertEquals(
      "3c4h=4c3s 7d3d 5dKd 7hAs KcAh",
      Solver.process("texas-holdem 6d8hJdJsTs 4c3s KcAh 7d3d 3c4h 5dKd 7hAs"));
  }

  @Test
  public void test_texas_holdem_4869_2d3s5h6cAc_4sAh_9d7s_4hKc_6d6h() {
    assertEquals(
      "9d7s 6d6h 4hKc=4sAh",
      Solver.process("texas-holdem 2d3s5h6cAc 4sAh 9d7s 4hKc 6d6h"));
  }

  @Test
  public void test_texas_holdem_4870_6d6s7d7hTc_ThKc_Kd4h() {
    assertEquals(
      "Kd4h ThKc",
      Solver.process("texas-holdem 6d6s7d7hTc ThKc Kd4h"));
  }

  @Test
  public void test_texas_holdem_4871_4s6h8hJsQs_9sJh_KsKd_3hTs_3dKc_8dQh_4d7d_5c2s_Tc3c_3sAh() {
    assertEquals(
      "5c2s 3hTs=Tc3c 3dKc 3sAh 4d7d 9sJh KsKd 8dQh",
      Solver.process("texas-holdem 4s6h8hJsQs 9sJh KsKd 3hTs 3dKc 8dQh 4d7d 5c2s Tc3c 3sAh"));
  }

  @Test
  public void test_texas_holdem_4872_3c9c9hKsTd_TsTc_4s2h_4h5c_6h7c_4c6c_3sKh_8cKc_5sAs_8h5h() {
    assertEquals(
      "4s2h 4h5c 4c6c 6h7c 8h5h 5sAs 3sKh=8cKc TsTc",
      Solver.process("texas-holdem 3c9c9hKsTd TsTc 4s2h 4h5c 6h7c 4c6c 3sKh 8cKc 5sAs 8h5h"));
  }

  @Test
  public void test_texas_holdem_4873_2h7s8dJhTh_4dAs_QcAc_6s5h_4s7c_3cKs() {
    assertEquals(
      "6s5h 3cKs 4dAs QcAc 4s7c",
      Solver.process("texas-holdem 2h7s8dJhTh 4dAs QcAc 6s5h 4s7c 3cKs"));
  }

  @Test
  public void test_texas_holdem_4874_5d6s9c9dJd_QdJh_Qh4h_4c4d_JcJs_Ac6h_8hAh_9h3d_5sTd() {
    assertEquals(
      "Qh4h 8hAh 4c4d 5sTd Ac6h QdJh 9h3d JcJs",
      Solver.process("texas-holdem 5d6s9c9dJd QdJh Qh4h 4c4d JcJs Ac6h 8hAh 9h3d 5sTd"));
  }

  @Test
  public void test_texas_holdem_4875_3hAdJcKcTs_7d8c_5s7h_6dKs_Qs2c_3c4h_2hAs() {
    assertEquals(
      "5s7h 7d8c 3c4h 6dKs 2hAs Qs2c",
      Solver.process("texas-holdem 3hAdJcKcTs 7d8c 5s7h 6dKs Qs2c 3c4h 2hAs"));
  }

  @Test
  public void test_texas_holdem_4876_7hAhAsJhQd_4d2d_7s4h_8h6d_9d5h_KsQh_2cAc_3d3s() {
    assertEquals(
      "4d2d 8h6d 9d5h 3d3s 7s4h KsQh 2cAc",
      Solver.process("texas-holdem 7hAhAsJhQd 4d2d 7s4h 8h6d 9d5h KsQh 2cAc 3d3s"));
  }

  @Test
  public void test_texas_holdem_4877_3c7s8cJdKs_9c5s_7c9d_7d8s_5c7h_4hQc_2c6d() {
    assertEquals(
      "2c6d 9c5s 4hQc 5c7h 7c9d 7d8s",
      Solver.process("texas-holdem 3c7s8cJdKs 9c5s 7c9d 7d8s 5c7h 4hQc 2c6d"));
  }

  @Test
  public void test_texas_holdem_4878_7c8h9dKsTs_9hTd_6d9s() {
    assertEquals(
      "9hTd 6d9s",
      Solver.process("texas-holdem 7c8h9dKsTs 9hTd 6d9s"));
  }

  @Test
  public void test_texas_holdem_4879_6dAdKsQhTh_7c6s_5c3h_QcQs_6c7h_8h2c_7d9c_3c2d() {
    assertEquals(
      "3c2d=5c3h 8h2c 7d9c 6c7h=7c6s QcQs",
      Solver.process("texas-holdem 6dAdKsQhTh 7c6s 5c3h QcQs 6c7h 8h2c 7d9c 3c2d"));
  }

  @Test
  public void test_texas_holdem_4880_3h8c9sAsKs_4dKd_3sAh_Qh8d_6dJd_2hTh_7sKh_4cJs() {
    assertEquals(
      "2hTh 4cJs=6dJd Qh8d 4dKd=7sKh 3sAh",
      Solver.process("texas-holdem 3h8c9sAsKs 4dKd 3sAh Qh8d 6dJd 2hTh 7sKh 4cJs"));
  }

  @Test
  public void test_texas_holdem_4881_3h5d6d7sQh_2d6h_9c5c_4c3s_5s6s_9d7c_2cAs() {
    assertEquals(
      "2cAs 9c5c 2d6h 9d7c 5s6s 4c3s",
      Solver.process("texas-holdem 3h5d6d7sQh 2d6h 9c5c 4c3s 5s6s 9d7c 2cAs"));
  }

  @Test
  public void test_texas_holdem_4882_4d6s8cJsTd_2d4h_3sQc_JdTs_8s9c() {
    assertEquals(
      "3sQc 2d4h 8s9c JdTs",
      Solver.process("texas-holdem 4d6s8cJsTd 2d4h 3sQc JdTs 8s9c"));
  }

  @Test
  public void test_texas_holdem_4883_3d4d7c8c8h_Th7h_KsJs_Ts5c_7d2c() {
    assertEquals(
      "Ts5c KsJs 7d2c Th7h",
      Solver.process("texas-holdem 3d4d7c8c8h Th7h KsJs Ts5c 7d2c"));
  }

  @Test
  public void test_texas_holdem_4884_2d6h8hJhKc_8cQs_Ks9s_ThTc_3dKd() {
    assertEquals(
      "8cQs ThTc 3dKd Ks9s",
      Solver.process("texas-holdem 2d6h8hJhKc 8cQs Ks9s ThTc 3dKd"));
  }

  @Test
  public void test_texas_holdem_4885_3s5h6hJhKc_3h2d_4dKs_TcJd_Td6s() {
    assertEquals(
      "3h2d Td6s TcJd 4dKs",
      Solver.process("texas-holdem 3s5h6hJhKc 3h2d 4dKs TcJd Td6s"));
  }

  @Test
  public void test_texas_holdem_4886_4s7c8sKdQc_JhAd_6dJd_3cQs_7h2c_Ks2d_Kh5d_2h6h_6s3s_8d9c() {
    assertEquals(
      "2h6h=6s3s 6dJd JhAd 7h2c 8d9c 3cQs Kh5d=Ks2d",
      Solver.process("texas-holdem 4s7c8sKdQc JhAd 6dJd 3cQs 7h2c Ks2d Kh5d 2h6h 6s3s 8d9c"));
  }

  @Test
  public void test_texas_holdem_4887_2d3s8c8h8s_As9c_3hQc_5c8d() {
    assertEquals(
      "As9c 3hQc 5c8d",
      Solver.process("texas-holdem 2d3s8c8h8s As9c 3hQc 5c8d"));
  }

  @Test
  public void test_texas_holdem_4888_5s6dAhKhQc_8d5h_6h9c_Qh9d_7d3s_Ac7c() {
    assertEquals(
      "7d3s 8d5h 6h9c Qh9d Ac7c",
      Solver.process("texas-holdem 5s6dAhKhQc 8d5h 6h9c Qh9d 7d3s Ac7c"));
  }

  @Test
  public void test_texas_holdem_4889_8h8sAdAhTs_2d4h_8c5h_5d6c_JhJd_7c7d_9h3c_AsKh_3d6d() {
    assertEquals(
      "2d4h=3d6d=5d6c=7c7d=9h3c JhJd 8c5h AsKh",
      Solver.process("texas-holdem 8h8sAdAhTs 2d4h 8c5h 5d6c JhJd 7c7d 9h3c AsKh 3d6d"));
  }

  @Test
  public void test_texas_holdem_4890_3c6d9c9dAh_QhJd_4cAs_Ts7c_3s5h_4sKc_4h7s_Tc5s() {
    assertEquals(
      "4h7s Tc5s Ts7c QhJd 4sKc 3s5h 4cAs",
      Solver.process("texas-holdem 3c6d9c9dAh QhJd 4cAs Ts7c 3s5h 4sKc 4h7s Tc5s"));
  }

  @Test
  public void test_texas_holdem_4891_2s6d7c7h9c_3d7s_4c5d_Ah3c_TsJd_JhKc_Ks5c_6c4d() {
    assertEquals(
      "4c5d TsJd Ks5c JhKc Ah3c 6c4d 3d7s",
      Solver.process("texas-holdem 2s6d7c7h9c 3d7s 4c5d Ah3c TsJd JhKc Ks5c 6c4d"));
  }

  @Test
  public void test_texas_holdem_4892_5d6c9sAcQs_KdJs_TdJd_7s5h_9h5s_Ad9d() {
    assertEquals(
      "TdJd KdJs 7s5h 9h5s Ad9d",
      Solver.process("texas-holdem 5d6c9sAcQs KdJs TdJd 7s5h 9h5s Ad9d"));
  }

  @Test
  public void test_texas_holdem_4893_2h2sAcQcQh_JcTs_Qd7s_Qs5h_Js8d_As8c_4d5d_7c6h() {
    assertEquals(
      "4d5d=7c6h=JcTs=Js8d As8c Qd7s=Qs5h",
      Solver.process("texas-holdem 2h2sAcQcQh JcTs Qd7s Qs5h Js8d As8c 4d5d 7c6h"));
  }

  @Test
  public void test_texas_holdem_4894_2h3hAhJsKh_Ad4c_5hTc_2cJh() {
    assertEquals(
      "Ad4c 5hTc 2cJh",
      Solver.process("texas-holdem 2h3hAhJsKh Ad4c 5hTc 2cJh"));
  }

  @Test
  public void test_texas_holdem_4895_2d2sAsKcTs_Jd8s_9h5c_KdQc_8h3s_Jc5s_5dTc_2cAd() {
    assertEquals(
      "8h3s=9h5c Jc5s=Jd8s 5dTc KdQc 2cAd",
      Solver.process("texas-holdem 2d2sAsKcTs Jd8s 9h5c KdQc 8h3s Jc5s 5dTc 2cAd"));
  }

  @Test
  public void test_texas_holdem_4896_3c3h7d8c9d_2cAc_7hTc_Kh6h_Jc3s_4s9h_2dTd_QhKd_QdJh_Ad7c() {
    assertEquals(
      "2dTd QdJh Kh6h QhKd 2cAc 7hTc Ad7c 4s9h Jc3s",
      Solver.process("texas-holdem 3c3h7d8c9d 2cAc 7hTc Kh6h Jc3s 4s9h 2dTd QhKd QdJh Ad7c"));
  }

  @Test
  public void test_texas_holdem_4897_2s6d9cKsTc_6cQd_Th2d_9h8s_5dKd_5cQh_Ah7d_Jc8h_5hJs() {
    assertEquals(
      "5hJs Jc8h 5cQh Ah7d 6cQd 9h8s 5dKd Th2d",
      Solver.process("texas-holdem 2s6d9cKsTc 6cQd Th2d 9h8s 5dKd 5cQh Ah7d Jc8h 5hJs"));
  }

  @Test
  public void test_texas_holdem_4898_3s6c9cQcTc_9d4c_3dJd_5d8s_Ad6d_Td7d_8dKc() {
    assertEquals(
      "5d8s 3dJd Ad6d Td7d 9d4c 8dKc",
      Solver.process("texas-holdem 3s6c9cQcTc 9d4c 3dJd 5d8s Ad6d Td7d 8dKc"));
  }

  @Test
  public void test_texas_holdem_4899_6c9dKcKdKh_5cTd_9c7d_2c6d_7sQh_JhJs_8dAs_3dAc_4hAh() {
    assertEquals(
      "5cTd 7sQh 3dAc=4hAh=8dAs 2c6d 9c7d JhJs",
      Solver.process("texas-holdem 6c9dKcKdKh 5cTd 9c7d 2c6d 7sQh JhJs 8dAs 3dAc 4hAh"));
  }

  @Test
  public void test_texas_holdem_4900_5d6sKhQdQs_8c3d_Qc7d_6h4h_9h4s_9d4c_AsTd_Jc7c_7h2d_6dTh() {
    assertEquals(
      "7h2d 8c3d 9d4c=9h4s Jc7c AsTd 6dTh=6h4h Qc7d",
      Solver.process("texas-holdem 5d6sKhQdQs 8c3d Qc7d 6h4h 9h4s 9d4c AsTd Jc7c 7h2d 6dTh"));
  }

  @Test
  public void test_texas_holdem_4901_6d9dJdKhQs_6s8s_5c4c_Ks2h_5s3s_Tc4h_9sKd() {
    assertEquals(
      "5c4c=5s3s 6s8s Ks2h 9sKd Tc4h",
      Solver.process("texas-holdem 6d9dJdKhQs 6s8s 5c4c Ks2h 5s3s Tc4h 9sKd"));
  }

  @Test
  public void test_texas_holdem_4902_2s7sAdKhKs_Qs2c_7h3s_4cKc_4sAs_Jc3d() {
    assertEquals(
      "Jc3d Qs2c 7h3s 4cKc 4sAs",
      Solver.process("texas-holdem 2s7sAdKhKs Qs2c 7h3s 4cKc 4sAs Jc3d"));
  }

  @Test
  public void test_texas_holdem_4903_3d5s9cQdTs_3sKd_4s4c_QcKh_9s6d() {
    assertEquals(
      "3sKd 4s4c 9s6d QcKh",
      Solver.process("texas-holdem 3d5s9cQdTs 3sKd 4s4c QcKh 9s6d"));
  }

  @Test
  public void test_texas_holdem_4904_5c7hAhKcQs_5d5h_9d7s_6dAd_QhKs_Ts8c_Js4s_Kd7d_ThKh() {
    assertEquals(
      "Ts8c Js4s 9d7s ThKh 6dAd Kd7d QhKs 5d5h",
      Solver.process("texas-holdem 5c7hAhKcQs 5d5h 9d7s 6dAd QhKs Ts8c Js4s Kd7d ThKh"));
  }

  @Test
  public void test_texas_holdem_4905_5s9cAdJsTh_Jc8c_8s7h_6s6c_4dKc_2dTs_Kd4h_Td6d_5hAs() {
    assertEquals(
      "4dKc=Kd4h 6s6c 2dTs=Td6d Jc8c 5hAs 8s7h",
      Solver.process("texas-holdem 5s9cAdJsTh Jc8c 8s7h 6s6c 4dKc 2dTs Kd4h Td6d 5hAs"));
  }

  @Test
  public void test_texas_holdem_4906_5s7c8c9sAd_AcTd_JdKh_4d2s_8hJs_7d2h_9c5d_QhAh_Th4c() {
    assertEquals(
      "4d2s Th4c JdKh 7d2h 8hJs AcTd QhAh 9c5d",
      Solver.process("texas-holdem 5s7c8c9sAd AcTd JdKh 4d2s 8hJs 7d2h 9c5d QhAh Th4c"));
  }

  @Test
  public void test_texas_holdem_4907_4c4s9dJcQh_9c8h_Th2d_6dQc_6hAd_JsTd_7h6c_Kc2h_Jh3h_2s5h() {
    assertEquals(
      "2s5h=7h6c Th2d Kc2h 6hAd 9c8h Jh3h=JsTd 6dQc",
      Solver.process("texas-holdem 4c4s9dJcQh 9c8h Th2d 6dQc 6hAd JsTd 7h6c Kc2h Jh3h 2s5h"));
  }

  @Test
  public void test_texas_holdem_4908_5s6h6s8dTd_Th3s_6cAs_3h7d_2cQc() {
    assertEquals(
      "3h7d 2cQc Th3s 6cAs",
      Solver.process("texas-holdem 5s6h6s8dTd Th3s 6cAs 3h7d 2cQc"));
  }

  @Test
  public void test_texas_holdem_4909_4s6dKdKhQh_Th2h_8hAh_2c8c_9cKc() {
    assertEquals(
      "2c8c Th2h 8hAh 9cKc",
      Solver.process("texas-holdem 4s6dKdKhQh Th2h 8hAh 2c8c 9cKc"));
  }

  @Test
  public void test_texas_holdem_4910_4s6hAhKcKs_ThKh_7h9h() {
    assertEquals(
      "7h9h ThKh",
      Solver.process("texas-holdem 4s6hAhKcKs ThKh 7h9h"));
  }

  @Test
  public void test_texas_holdem_4911_2d4d4h7cQh_9hAs_2hTd_6dQd_6cTc_5h9s() {
    assertEquals(
      "5h9s 6cTc 9hAs 2hTd 6dQd",
      Solver.process("texas-holdem 2d4d4h7cQh 9hAs 2hTd 6dQd 6cTc 5h9s"));
  }

  @Test
  public void test_texas_holdem_4912_4d6h8cAcJh_KsTs_AsKd_6sTh_9c5s_4cKc() {
    assertEquals(
      "9c5s KsTs 4cKc 6sTh AsKd",
      Solver.process("texas-holdem 4d6h8cAcJh KsTs AsKd 6sTh 9c5s 4cKc"));
  }

  @Test
  public void test_texas_holdem_4913_4c4h8c9d9h_8d7h_5dKs_TdAd_4s2d_KhJc_8s6h() {
    assertEquals(
      "5dKs=KhJc TdAd 8s6h 8d7h 4s2d",
      Solver.process("texas-holdem 4c4h8c9d9h 8d7h 5dKs TdAd 4s2d KhJc 8s6h"));
  }

  @Test
  public void test_texas_holdem_4914_3d3sAdTdTh_8sAs_Ks7s_5h9d_KdQd_9sKc_JcAh_JdQc() {
    assertEquals(
      "5h9d=9sKc=JdQc=Ks7s 8sAs JcAh KdQd",
      Solver.process("texas-holdem 3d3sAdTdTh 8sAs Ks7s 5h9d KdQd 9sKc JcAh JdQc"));
  }

  @Test
  public void test_texas_holdem_4915_7h7s8cQdTc_2dAs_Ts3d_Jd6h_4h9c() {
    assertEquals(
      "4h9c Jd6h 2dAs Ts3d",
      Solver.process("texas-holdem 7h7s8cQdTc 2dAs Ts3d Jd6h 4h9c"));
  }

  @Test
  public void test_texas_holdem_4916_2s4s8sKdTh_AdQh_3c9c_8cQd_Ac6h_TdKh_Qc2d_2c7d_Kc5h_7h6c() {
    assertEquals(
      "7h6c 3c9c Ac6h AdQh 2c7d Qc2d 8cQd Kc5h TdKh",
      Solver.process("texas-holdem 2s4s8sKdTh AdQh 3c9c 8cQd Ac6h TdKh Qc2d 2c7d Kc5h 7h6c"));
  }

  @Test
  public void test_texas_holdem_4917_5s6sJsKhQd_4c5d_8h8d_7hAs_AcKd_2hKs_8s8c_ThJc_3h7d() {
    assertEquals(
      "3h7d 7hAs 4c5d 8h8d=8s8c ThJc 2hKs AcKd",
      Solver.process("texas-holdem 5s6sJsKhQd 4c5d 8h8d 7hAs AcKd 2hKs 8s8c ThJc 3h7d"));
  }

  @Test
  public void test_texas_holdem_4918_7d7s8sJdQc_6h3d_8cJs_6c8h_3c8d_5hKs_Qh4c_6sKd_TdQd_Ad4d() {
    assertEquals(
      "6h3d 5hKs=6sKd Ad4d 3c8d=6c8h 8cJs Qh4c=TdQd",
      Solver.process("texas-holdem 7d7s8sJdQc 6h3d 8cJs 6c8h 3c8d 5hKs Qh4c 6sKd TdQd Ad4d"));
  }

  @Test
  public void test_texas_holdem_4919_3cJcJdTdTs_8s4s_4c6c_5c4h_Kc7s_8h5s_8c6d() {
    assertEquals(
      "5c4h 4c6c 8c6d=8h5s=8s4s Kc7s",
      Solver.process("texas-holdem 3cJcJdTdTs 8s4s 4c6c 5c4h Kc7s 8h5s 8c6d"));
  }

  @Test
  public void test_texas_holdem_4920_4c4s9hAhTs_9c7d_4d7c_KdKc_QdJs_2cJd_Jc9d() {
    assertEquals(
      "2cJd QdJs 9c7d=Jc9d KdKc 4d7c",
      Solver.process("texas-holdem 4c4s9hAhTs 9c7d 4d7c KdKc QdJs 2cJd Jc9d"));
  }

  @Test
  public void test_texas_holdem_4921_2h6c6sJcQd_Ks2d_7dTd() {
    assertEquals(
      "7dTd Ks2d",
      Solver.process("texas-holdem 2h6c6sJcQd Ks2d 7dTd"));
  }

  @Test
  public void test_texas_holdem_4922_3s5d7cJhTc_4hAs_2h9c_AcTs() {
    assertEquals(
      "2h9c 4hAs AcTs",
      Solver.process("texas-holdem 3s5d7cJhTc 4hAs 2h9c AcTs"));
  }

  @Test
  public void test_texas_holdem_4923_4s5d8hKdTd_As2d_Ts9s_9d9h_8d6d_8cJs_Ad2c() {
    assertEquals(
      "Ad2c=As2d 8cJs 9d9h Ts9s 8d6d",
      Solver.process("texas-holdem 4s5d8hKdTd As2d Ts9s 9d9h 8d6d 8cJs Ad2c"));
  }

  @Test
  public void test_texas_holdem_4924_8h9cQcQhTh_QsAc_KcAs_3s4s_AdJd_9sTc_5dTd_2c7s_4hAh() {
    assertEquals(
      "2c7s=3s4s KcAs 5dTd=9sTc QsAc AdJd 4hAh",
      Solver.process("texas-holdem 8h9cQcQhTh QsAc KcAs 3s4s AdJd 9sTc 5dTd 2c7s 4hAh"));
  }

  @Test
  public void test_texas_holdem_4925_2h3h3s8cAd_9dJh_4h9c_2s5s_QdKd() {
    assertEquals(
      "4h9c 9dJh QdKd 2s5s",
      Solver.process("texas-holdem 2h3h3s8cAd 9dJh 4h9c 2s5s QdKd"));
  }

  @Test
  public void test_texas_holdem_4926_6d6s7d7sAd_2dQh_2s8c_5s5c() {
    assertEquals(
      "2dQh=2s8c=5s5c",
      Solver.process("texas-holdem 6d6s7d7sAd 2dQh 2s8c 5s5c"));
  }

  @Test
  public void test_texas_holdem_4927_3c3d6cKdKs_4dQd_9s6d_7s6s() {
    assertEquals(
      "4dQd 7s6s 9s6d",
      Solver.process("texas-holdem 3c3d6cKdKs 4dQd 9s6d 7s6s"));
  }

  @Test
  public void test_texas_holdem_4928_3d8s9sAsKd_3h7c_2sKs_4hJc_4d4c_2c9h() {
    assertEquals(
      "4hJc 3h7c 4d4c 2c9h 2sKs",
      Solver.process("texas-holdem 3d8s9sAsKd 3h7c 2sKs 4hJc 4d4c 2c9h"));
  }

  @Test
  public void test_texas_holdem_4929_2s6c6h9cJd_5cTc_TsKs_Th3h_3sJh_5d7c() {
    assertEquals(
      "5d7c 5cTc=Th3h TsKs 3sJh",
      Solver.process("texas-holdem 2s6c6h9cJd 5cTc TsKs Th3h 3sJh 5d7c"));
  }

  @Test
  public void test_texas_holdem_4930_2s5h6c6hJc_4dJd_TdKc_2cTc_4h9h_8d8s() {
    assertEquals(
      "4h9h TdKc 2cTc 8d8s 4dJd",
      Solver.process("texas-holdem 2s5h6c6hJc 4dJd TdKc 2cTc 4h9h 8d8s"));
  }

  @Test
  public void test_texas_holdem_4931_2h3h4hAsJh_7d5c_7s7h_Ah9s_Jd8d_ThTc_3dAd_8h8c_6d9c_Td6c() {
    assertEquals(
      "6d9c Td6c Jd8d 3dAd 7d5c 7s7h 8h8c ThTc Ah9s",
      Solver.process("texas-holdem 2h3h4hAsJh 7d5c 7s7h Ah9s Jd8d ThTc 3dAd 8h8c 6d9c Td6c"));
  }

  @Test
  public void test_texas_holdem_4932_2h3c4c7sQd_Ah7c_Ad9c_4dAs_3sJs_5c8h_8s8c() {
    assertEquals(
      "5c8h Ad9c 3sJs 4dAs Ah7c 8s8c",
      Solver.process("texas-holdem 2h3c4c7sQd Ah7c Ad9c 4dAs 3sJs 5c8h 8s8c"));
  }

  @Test
  public void test_texas_holdem_4933_5c6d9dJdKs_3c7s_3h9s_4sTh_2h6c_3sJc() {
    assertEquals(
      "3c7s 4sTh 2h6c 3h9s 3sJc",
      Solver.process("texas-holdem 5c6d9dJdKs 3c7s 3h9s 4sTh 2h6c 3sJc"));
  }

  @Test
  public void test_texas_holdem_4934_2c2s3hAsQh_9h3c_7d8d() {
    assertEquals(
      "7d8d 9h3c",
      Solver.process("texas-holdem 2c2s3hAsQh 9h3c 7d8d"));
  }

  @Test
  public void test_texas_holdem_4935_5s8h9c9hKh_3s5h_4dJc_7h9d_Th5d_TsAh_Ac7d_7s2c_4hQd() {
    assertEquals(
      "7s2c 4dJc 4hQd Ac7d TsAh 3s5h=Th5d 7h9d",
      Solver.process("texas-holdem 5s8h9c9hKh 3s5h 4dJc 7h9d Th5d TsAh Ac7d 7s2c 4hQd"));
  }

  @Test
  public void test_texas_holdem_4936_2d6sKhQhTc_Ah8c_3hKs_6hAs_2cJd() {
    assertEquals(
      "Ah8c 2cJd 6hAs 3hKs",
      Solver.process("texas-holdem 2d6sKhQhTc Ah8c 3hKs 6hAs 2cJd"));
  }

  @Test
  public void test_texas_holdem_4937_2h9cJhQhTh_KhQc_9s6d() {
    assertEquals(
      "9s6d KhQc",
      Solver.process("texas-holdem 2h9cJhQhTh KhQc 9s6d"));
  }

  @Test
  public void test_texas_holdem_4938_2h5c7h9cAh_8h9d_4c2s_AcQs_4hAd_JcTc_3hKh_8s2d_AsKc() {
    assertEquals(
      "JcTc 4c2s 8s2d 8h9d 4hAd AcQs AsKc 3hKh",
      Solver.process("texas-holdem 2h5c7h9cAh 8h9d 4c2s AcQs 4hAd JcTc 3hKh 8s2d AsKc"));
  }

  @Test
  public void test_texas_holdem_4939_2c7dJsKhQs_3s4d_4c3h_Qh7s_6h5s_9h3c() {
    assertEquals(
      "3s4d=4c3h 6h5s 9h3c Qh7s",
      Solver.process("texas-holdem 2c7dJsKhQs 3s4d 4c3h Qh7s 6h5s 9h3c"));
  }

  @Test
  public void test_texas_holdem_4940_5c7d8dAdJs_Qh7c_7s4c_8c9h_8h5h_Jd4s_5d6c_2d4d_KsQc() {
    assertEquals(
      "KsQc 5d6c 7s4c Qh7c 8c9h Jd4s 8h5h 2d4d",
      Solver.process("texas-holdem 5c7d8dAdJs Qh7c 7s4c 8c9h 8h5h Jd4s 5d6c 2d4d KsQc"));
  }

  @Test
  public void test_texas_holdem_4941_2h6h6s7s8c_TdQc_7hQd_Kc8h_QsAd_6c5h() {
    assertEquals(
      "TdQc QsAd 7hQd Kc8h 6c5h",
      Solver.process("texas-holdem 2h6h6s7s8c TdQc 7hQd Kc8h QsAd 6c5h"));
  }

  @Test
  public void test_texas_holdem_4942_4d5h8d9cQd_Ah3c_7h4h_5sKd_Ts7s_2hTh_8s8h_9s6c_2sAd_QsQc() {
    assertEquals(
      "2hTh Ts7s 2sAd=Ah3c 7h4h 5sKd 9s6c 8s8h QsQc",
      Solver.process("texas-holdem 4d5h8d9cQd Ah3c 7h4h 5sKd Ts7s 2hTh 8s8h 9s6c 2sAd QsQc"));
  }

  @Test
  public void test_texas_holdem_4943_5s9cKdKsTd_4s6s_KhAs_6c7c_8s2h() {
    assertEquals(
      "4s6s 6c7c 8s2h KhAs",
      Solver.process("texas-holdem 5s9cKdKsTd 4s6s KhAs 6c7c 8s2h"));
  }

  @Test
  public void test_texas_holdem_4944_2s3c3d5hAs_Td4c_9c6s_KcAd_Ac8s_QcJc_5c4s_7sJd_8d2d_6d3s() {
    assertEquals(
      "9c6s 7sJd QcJc 8d2d Ac8s KcAd 6d3s 5c4s=Td4c",
      Solver.process("texas-holdem 2s3c3d5hAs Td4c 9c6s KcAd Ac8s QcJc 5c4s 7sJd 8d2d 6d3s"));
  }

  @Test
  public void test_texas_holdem_4945_5c9hQdQhTc_As3c_5s4d_KhKd_8hJc() {
    assertEquals(
      "As3c 5s4d KhKd 8hJc",
      Solver.process("texas-holdem 5c9hQdQhTc As3c 5s4d KhKd 8hJc"));
  }

  @Test
  public void test_texas_holdem_4946_5s6c8h9sJh_4d3h_Qs9c() {
    assertEquals(
      "4d3h Qs9c",
      Solver.process("texas-holdem 5s6c8h9sJh 4d3h Qs9c"));
  }

  @Test
  public void test_texas_holdem_4947_3d7cAdAhQc_5s2h_Js4s_3hQd_4dJh_5h9d() {
    assertEquals(
      "5s2h 5h9d 4dJh=Js4s 3hQd",
      Solver.process("texas-holdem 3d7cAdAhQc 5s2h Js4s 3hQd 4dJh 5h9d"));
  }

  @Test
  public void test_texas_holdem_4948_2d5d7hAhTc_Js3s_4c7c_QsKs_8h9s_Jd2s_7d7s() {
    assertEquals(
      "8h9s Js3s QsKs Jd2s 4c7c 7d7s",
      Solver.process("texas-holdem 2d5d7hAhTc Js3s 4c7c QsKs 8h9s Jd2s 7d7s"));
  }

  @Test
  public void test_texas_holdem_4949_2s4s8d9hTc_4cKs_JhJs_Qc8c_3h6s_Th4d_6hTd_2c4h_2h7s() {
    assertEquals(
      "3h6s 2h7s 4cKs Qc8c 6hTd JhJs 2c4h Th4d",
      Solver.process("texas-holdem 2s4s8d9hTc 4cKs JhJs Qc8c 3h6s Th4d 6hTd 2c4h 2h7s"));
  }

  @Test
  public void test_texas_holdem_4950_4h5d6s7sKd_TsQd_JsTc_9s4s_3h7h() {
    assertEquals(
      "JsTc TsQd 9s4s 3h7h",
      Solver.process("texas-holdem 4h5d6s7sKd TsQd JsTc 9s4s 3h7h"));
  }

  @Test
  public void test_texas_holdem_4951_7sJcJsKdQd_9dAs_4hJd() {
    assertEquals(
      "9dAs 4hJd",
      Solver.process("texas-holdem 7sJcJsKdQd 9dAs 4hJd"));
  }

  @Test
  public void test_texas_holdem_4952_2c3dJhKsQd_7s4s_Kd9d_5h3s_2d8s_9h2h_3h8h_Qs7d() {
    assertEquals(
      "7s4s 2d8s=9h2h 3h8h=5h3s Qs7d Kd9d",
      Solver.process("texas-holdem 2c3dJhKsQd 7s4s Kd9d 5h3s 2d8s 9h2h 3h8h Qs7d"));
  }

  @Test
  public void test_texas_holdem_4953_6h8cAhQcQd_9s7c_9h6s_ThKd_2h8s_4sJc_9cJs_JhTd_4h8h() {
    assertEquals(
      "9s7c 4sJc 9cJs JhTd ThKd 9h6s 2h8s=4h8h",
      Solver.process("texas-holdem 6h8cAhQcQd 9s7c 9h6s ThKd 2h8s 4sJc 9cJs JhTd 4h8h"));
  }

  @Test
  public void test_texas_holdem_4954_6d7c8sKsTh_6hJs_4c9h_8hKd_5d5s_8d3s_TcTs_Jh7s_4d4s_Ad5h() {
    assertEquals(
      "Ad5h 4d4s 5d5s 6hJs Jh7s 8d3s 8hKd TcTs 4c9h",
      Solver.process("texas-holdem 6d7c8sKsTh 6hJs 4c9h 8hKd 5d5s 8d3s TcTs Jh7s 4d4s Ad5h"));
  }

  @Test
  public void test_texas_holdem_4955_4h8hKdQhQs_9c8c_7h6s_Kc3c_5c8s_7s2d_TsJh() {
    assertEquals(
      "7h6s=7s2d TsJh 5c8s=9c8c Kc3c",
      Solver.process("texas-holdem 4h8hKdQhQs 9c8c 7h6s Kc3c 5c8s 7s2d TsJh"));
  }

  @Test
  public void test_texas_holdem_4956_4d5d5h8s9h_QdJd_9sKs_2s8d_KhAs_3c5c() {
    assertEquals(
      "QdJd KhAs 2s8d 9sKs 3c5c",
      Solver.process("texas-holdem 4d5d5h8s9h QdJd 9sKs 2s8d KhAs 3c5c"));
  }

  @Test
  public void test_texas_holdem_4957_5h9sAsQdQh_JsKc_7s7d_8hJd_6s3c_Ac4c() {
    assertEquals(
      "6s3c 8hJd JsKc 7s7d Ac4c",
      Solver.process("texas-holdem 5h9sAsQdQh JsKc 7s7d 8hJd 6s3c Ac4c"));
  }

  @Test
  public void test_texas_holdem_4958_5s7c8hKcTd_Jd4s_9c5h_ThTs_2hJh_9hQh_3d5d_6h6s_3hQd_Kh6d() {
    assertEquals(
      "2hJh=Jd4s 3hQd 9hQh 3d5d 9c5h 6h6s Kh6d ThTs",
      Solver.process("texas-holdem 5s7c8hKcTd Jd4s 9c5h ThTs 2hJh 9hQh 3d5d 6h6s 3hQd Kh6d"));
  }

  @Test
  public void test_texas_holdem_4959_4c7cAcQhQs_8d6s_7sKs() {
    assertEquals(
      "8d6s 7sKs",
      Solver.process("texas-holdem 4c7cAcQhQs 8d6s 7sKs"));
  }

  @Test
  public void test_texas_holdem_4960_3s6c9dAcJc_7s3d_6d2h_9sJd() {
    assertEquals(
      "7s3d 6d2h 9sJd",
      Solver.process("texas-holdem 3s6c9dAcJc 7s3d 6d2h 9sJd"));
  }

  @Test
  public void test_texas_holdem_4961_3d7dJdKhKs_4c9c_Td2s_7h2d_9sAs() {
    assertEquals(
      "4c9c Td2s 9sAs 7h2d",
      Solver.process("texas-holdem 3d7dJdKhKs 4c9c Td2s 7h2d 9sAs"));
  }

  @Test
  public void test_texas_holdem_4962_6h6s8dTcTs_5hJs_Jc6d() {
    assertEquals(
      "5hJs Jc6d",
      Solver.process("texas-holdem 6h6s8dTcTs 5hJs Jc6d"));
  }

  @Test
  public void test_texas_holdem_4963_2c6dAsJdKd_Ac2d_9sKc_8s4c_3cTd_6s3d_8cQd() {
    assertEquals(
      "8s4c 3cTd 8cQd 6s3d 9sKc Ac2d",
      Solver.process("texas-holdem 2c6dAsJdKd Ac2d 9sKc 8s4c 3cTd 6s3d 8cQd"));
  }

  @Test
  public void test_texas_holdem_4964_3c8s9hJsQh_4s7s_3hTd_4cTc_9c7h_3d5h_2s2h() {
    assertEquals(
      "4s7s 2s2h 3d5h 9c7h 3hTd=4cTc",
      Solver.process("texas-holdem 3c8s9hJsQh 4s7s 3hTd 4cTc 9c7h 3d5h 2s2h"));
  }

  @Test
  public void test_texas_holdem_4965_3c3d7dAcTc_JsQs_Ad9h_2d4h_TdKc() {
    assertEquals(
      "2d4h JsQs TdKc Ad9h",
      Solver.process("texas-holdem 3c3d7dAcTc JsQs Ad9h 2d4h TdKc"));
  }

  @Test
  public void test_texas_holdem_4966_2s5c8cAsJh_9c9h_QcJc_Ks7h_Ah8h_8d4h() {
    assertEquals(
      "Ks7h 8d4h 9c9h QcJc Ah8h",
      Solver.process("texas-holdem 2s5c8cAsJh 9c9h QcJc Ks7h Ah8h 8d4h"));
  }

  @Test
  public void test_texas_holdem_4967_9cJsQcQdTs_8s5s_8c9d_Jc2d_7c4s_6cTh_AcAd() {
    assertEquals(
      "7c4s 6cTh Jc2d AcAd 8c9d=8s5s",
      Solver.process("texas-holdem 9cJsQcQdTs 8s5s 8c9d Jc2d 7c4s 6cTh AcAd"));
  }

  @Test
  public void test_texas_holdem_4968_2s7cKcKhQs_5s6h_5hAh() {
    assertEquals(
      "5s6h 5hAh",
      Solver.process("texas-holdem 2s7cKcKhQs 5s6h 5hAh"));
  }

  @Test
  public void test_texas_holdem_4969_3s7h8h9h9s_5hKd_8sQh_5s6c_Ks6d_3c4s_Jh9c_QcJd_2cJc_4cTh() {
    assertEquals(
      "4cTh 2cJc QcJd 5hKd=Ks6d 3c4s 8sQh Jh9c 5s6c",
      Solver.process("texas-holdem 3s7h8h9h9s 5hKd 8sQh 5s6c Ks6d 3c4s Jh9c QcJd 2cJc 4cTh"));
  }

  @Test
  public void test_texas_holdem_4970_3h4c6c6sKs_4hQc_Ah8h_2h9d_5d9c_Kh5h_7cJs_3d7h_Qd8s() {
    assertEquals(
      "2h9d 5d9c 7cJs Qd8s Ah8h 3d7h 4hQc Kh5h",
      Solver.process("texas-holdem 3h4c6c6sKs 4hQc Ah8h 2h9d 5d9c Kh5h 7cJs 3d7h Qd8s"));
  }

  @Test
  public void test_texas_holdem_4971_2s6c9sJsQc_KcTs_5c2d_TdTc_6d7h_4s3d_3s4d_KdJh_ThAd() {
    assertEquals(
      "3s4d=4s3d ThAd 5c2d 6d7h TdTc KdJh KcTs",
      Solver.process("texas-holdem 2s6c9sJsQc KcTs 5c2d TdTc 6d7h 4s3d 3s4d KdJh ThAd"));
  }

  @Test
  public void test_texas_holdem_4972_5h7h9cJhKh_QdQc_6s4s() {
    assertEquals(
      "6s4s QdQc",
      Solver.process("texas-holdem 5h7h9cJhKh QdQc 6s4s"));
  }

  @Test
  public void test_texas_holdem_4973_2c2d7dJdQh_6h6c_Kc2h_Kd3d_9sKh_ThJc_JhAs_4d3s_AhKs_Ad9h() {
    assertEquals(
      "4d3s 9sKh Ad9h AhKs 6h6c ThJc JhAs Kc2h Kd3d",
      Solver.process("texas-holdem 2c2d7dJdQh 6h6c Kc2h Kd3d 9sKh ThJc JhAs 4d3s AhKs Ad9h"));
  }

  @Test
  public void test_texas_holdem_4974_5h5s8dKsQs_5d2s_5c7h_QcTd_9dAs_3s7c_2c2h_9cTh_2d7d_8sKd() {
    assertEquals(
      "2d7d=3s7c 9cTh 9dAs 2c2h QcTd 8sKd 5c7h=5d2s",
      Solver.process("texas-holdem 5h5s8dKsQs 5d2s 5c7h QcTd 9dAs 3s7c 2c2h 9cTh 2d7d 8sKd"));
  }

  @Test
  public void test_texas_holdem_4975_2d2h4dJcKc_Kd7h_KsJh_7dTd_9cQh_Ah6h_5c2c() {
    assertEquals(
      "7dTd 9cQh Ah6h Kd7h KsJh 5c2c",
      Solver.process("texas-holdem 2d2h4dJcKc Kd7h KsJh 7dTd 9cQh Ah6h 5c2c"));
  }

  @Test
  public void test_texas_holdem_4976_2d3h6d8cAc_2cJs_8dKd_7hTs_6h9s_AdAs_6c4c_Qd5c_8s7s() {
    assertEquals(
      "7hTs Qd5c 2cJs 6c4c 6h9s 8s7s 8dKd AdAs",
      Solver.process("texas-holdem 2d3h6d8cAc 2cJs 8dKd 7hTs 6h9s AdAs 6c4c Qd5c 8s7s"));
  }

  @Test
  public void test_texas_holdem_4977_3h4c6d6h8c_5s9s_6s8h_8s2h_7h6c_5h7s_7dAh_Tc3d() {
    assertEquals(
      "5s9s 7dAh Tc3d 8s2h 7h6c 5h7s 6s8h",
      Solver.process("texas-holdem 3h4c6d6h8c 5s9s 6s8h 8s2h 7h6c 5h7s 7dAh Tc3d"));
  }

  @Test
  public void test_texas_holdem_4978_8sAdJdKcKs_Ts4h_Jc4c() {
    assertEquals(
      "Ts4h Jc4c",
      Solver.process("texas-holdem 8sAdJdKcKs Ts4h Jc4c"));
  }

  @Test
  public void test_texas_holdem_4979_2s3d4d8hKd_8cKh_Tc9c() {
    assertEquals(
      "Tc9c 8cKh",
      Solver.process("texas-holdem 2s3d4d8hKd 8cKh Tc9c"));
  }

  @Test
  public void test_texas_holdem_4980_5c5s6d7h9c_2hJd_Td6h() {
    assertEquals(
      "2hJd Td6h",
      Solver.process("texas-holdem 5c5s6d7h9c 2hJd Td6h"));
  }

  @Test
  public void test_texas_holdem_4981_4c7s8sJdTh_TsJs_4d3d() {
    assertEquals(
      "4d3d TsJs",
      Solver.process("texas-holdem 4c7s8sJdTh TsJs 4d3d"));
  }

  @Test
  public void test_texas_holdem_4982_3d8c9dAdTh_Jc3h_QdTd_Ks6h_QsAc() {
    assertEquals(
      "Ks6h Jc3h QsAc QdTd",
      Solver.process("texas-holdem 3d8c9dAdTh Jc3h QdTd Ks6h QsAc"));
  }

  @Test
  public void test_texas_holdem_4983_5h6dAsJcJd_7s2s_Qh7c_9h2d_5c9c() {
    assertEquals(
      "7s2s 9h2d Qh7c 5c9c",
      Solver.process("texas-holdem 5h6dAsJcJd 7s2s Qh7c 9h2d 5c9c"));
  }

  @Test
  public void test_texas_holdem_4984_4c6d7cQsTd_QdAs_4d2c_2d5h_8hTh_Qc4s_5c3s_TcKs_Jc9s_7dQh() {
    assertEquals(
      "2d5h Jc9s 4d2c 8hTh TcKs QdAs Qc4s 7dQh 5c3s",
      Solver.process("texas-holdem 4c6d7cQsTd QdAs 4d2c 2d5h 8hTh Qc4s 5c3s TcKs Jc9s 7dQh"));
  }

  @Test
  public void test_texas_holdem_4985_6h8hQcQhTc_5s8s_2d6c_2sKs_6d9s_8cQs_Ad5c() {
    assertEquals(
      "2sKs Ad5c 2d6c=6d9s 5s8s 8cQs",
      Solver.process("texas-holdem 6h8hQcQhTc 5s8s 2d6c 2sKs 6d9s 8cQs Ad5c"));
  }

  @Test
  public void test_texas_holdem_4986_3c3h7s9cQs_Th6d_8sTd_JsAs_5s5c_JdTc_9h9s_4cAd() {
    assertEquals(
      "8sTd=Th6d JdTc 4cAd JsAs 5s5c 9h9s",
      Solver.process("texas-holdem 3c3h7s9cQs Th6d 8sTd JsAs 5s5c JdTc 9h9s 4cAd"));
  }

  @Test
  public void test_texas_holdem_4987_6s7h9d9h9s_Jd4s_4c4h_3dAs_Ts7d_3s6d_Ah6c_8s6h_Tc5s_4dKs() {
    assertEquals(
      "Tc5s Jd4s 4dKs 3dAs 4c4h 3s6d=8s6h=Ah6c Ts7d",
      Solver.process("texas-holdem 6s7h9d9h9s Jd4s 4c4h 3dAs Ts7d 3s6d Ah6c 8s6h Tc5s 4dKs"));
  }

  @Test
  public void test_texas_holdem_4988_3d6c9sQsTd_2h6s_2c4d_5c4s_As3s_6h5d() {
    assertEquals(
      "2c4d 5c4s As3s 2h6s=6h5d",
      Solver.process("texas-holdem 3d6c9sQsTd 2h6s 2c4d 5c4s As3s 6h5d"));
  }

  @Test
  public void test_texas_holdem_4989_2c4c6c8cAs_7dAc_5s3d_9cKc_TsJs_2s7h_Qs5d_8h3c_2d8d_4d5c() {
    assertEquals(
      "TsJs Qs5d 2s7h 2d8d 5s3d 8h3c 4d5c 9cKc 7dAc",
      Solver.process("texas-holdem 2c4c6c8cAs 7dAc 5s3d 9cKc TsJs 2s7h Qs5d 8h3c 2d8d 4d5c"));
  }

  @Test
  public void test_texas_holdem_4990_2s4c4sKdQs_8dQc_5cTc_4h3c_JcAs_Kc7s_3h3s_Ks9d() {
    assertEquals(
      "5cTc JcAs 3h3s 8dQc Kc7s=Ks9d 4h3c",
      Solver.process("texas-holdem 2s4c4sKdQs 8dQc 5cTc 4h3c JcAs Kc7s 3h3s Ks9d"));
  }

  @Test
  public void test_texas_holdem_4991_2h7s8sKhQh_3c9d_Tc9c_As5s_Ac6h_4cQc_8d3s_4dTs_5c2c_Jh6c() {
    assertEquals(
      "3c9d 4dTs Tc9c Jh6c Ac6h=As5s 5c2c 8d3s 4cQc",
      Solver.process("texas-holdem 2h7s8sKhQh 3c9d Tc9c As5s Ac6h 4cQc 8d3s 4dTs 5c2c Jh6c"));
  }

  @Test
  public void test_texas_holdem_4992_5c7hJdKdKs_Kc8s_Qc6s_9dJc() {
    assertEquals(
      "Qc6s 9dJc Kc8s",
      Solver.process("texas-holdem 5c7hJdKdKs Kc8s Qc6s 9dJc"));
  }

  @Test
  public void test_texas_holdem_4993_3d9c9hKdTs_5s2d_As6h_7cJc_Kh2s_6d8h_QsAh_8s7d() {
    assertEquals(
      "5s2d 6d8h=8s7d 7cJc As6h QsAh Kh2s",
      Solver.process("texas-holdem 3d9c9hKdTs 5s2d As6h 7cJc Kh2s 6d8h QsAh 8s7d"));
  }

  @Test
  public void test_texas_holdem_4994_6c8s9cQsTd_6hTh_4d3c_As2s_KhKd_4cKc_7hQh() {
    assertEquals(
      "4d3c 4cKc As2s KhKd 6hTh 7hQh",
      Solver.process("texas-holdem 6c8s9cQsTd 6hTh 4d3c As2s KhKd 4cKc 7hQh"));
  }

  @Test
  public void test_texas_holdem_4995_3h9sAhTcTh_2h7d_4c8d_4s9h_As2d_TsAd_7c6c_Td2c_9dAc_4dJh() {
    assertEquals(
      "2h7d=7c6c 4c8d 4dJh 4s9h 9dAc=As2d Td2c TsAd",
      Solver.process("texas-holdem 3h9sAhTcTh 2h7d 4c8d 4s9h As2d TsAd 7c6c Td2c 9dAc 4dJh"));
  }

  @Test
  public void test_texas_holdem_4996_8cAdJhQsTd_2s8s_JsKd_3h5s() {
    assertEquals(
      "3h5s 2s8s JsKd",
      Solver.process("texas-holdem 8cAdJhQsTd 2s8s JsKd 3h5s"));
  }

  @Test
  public void test_texas_holdem_4997_3d4d6dJdKh_8s2h_5d2s() {
    assertEquals(
      "8s2h 5d2s",
      Solver.process("texas-holdem 3d4d6dJdKh 8s2h 5d2s"));
  }

  @Test
  public void test_texas_holdem_4998_2c5h9d9sQd_8cAh_7h3d_8d4d_2dJd_Qc9c_4sTc_7dTd() {
    assertEquals(
      "7h3d 8d4d 4sTc 7dTd 8cAh 2dJd Qc9c",
      Solver.process("texas-holdem 2c5h9d9sQd 8cAh 7h3d 8d4d 2dJd Qc9c 4sTc 7dTd"));
  }

  @Test
  public void test_texas_holdem_4999_7h9c9hJcKd_7d9s_3hJh() {
    assertEquals(
      "3hJh 7d9s",
      Solver.process("texas-holdem 7h9c9hJcKd 7d9s 3hJh"));
  }

}
