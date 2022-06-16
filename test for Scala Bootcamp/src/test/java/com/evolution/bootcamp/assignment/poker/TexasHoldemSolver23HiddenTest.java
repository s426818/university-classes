
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver23HiddenTest {


  @Test
  public void test_texas_holdem_5750_2d2h4s8cJd_4cKd_6cKh() {
    assertEquals(
      "6cKh 4cKd",
      Solver.process("texas-holdem 2d2h4s8cJd 4cKd 6cKh"));
  }

  @Test
  public void test_texas_holdem_5751_2h4c9cQcTh_AdAh_6d7d_Ks6s_Qh3h() {
    assertEquals(
      "6d7d Ks6s Qh3h AdAh",
      Solver.process("texas-holdem 2h4c9cQcTh AdAh 6d7d Ks6s Qh3h"));
  }

  @Test
  public void test_texas_holdem_5752_3c3d4dAdTc_8s2c_5c4c_TsAs_QdTh() {
    assertEquals(
      "8s2c 5c4c QdTh TsAs",
      Solver.process("texas-holdem 3c3d4dAdTc 8s2c 5c4c TsAs QdTh"));
  }

  @Test
  public void test_texas_holdem_5753_4s6s7c8cQc_TcJd_Ac8h_3cJh_3hTs() {
    assertEquals(
      "3hTs 3cJh TcJd Ac8h",
      Solver.process("texas-holdem 4s6s7c8cQc TcJd Ac8h 3cJh 3hTs"));
  }

  @Test
  public void test_texas_holdem_5754_3h9hJcJdJs_Qc7c_Qs5d_2c4s_5h4c_Ts5s_9c8d() {
    assertEquals(
      "2c4s 5h4c Ts5s Qc7c=Qs5d 9c8d",
      Solver.process("texas-holdem 3h9hJcJdJs Qc7c Qs5d 2c4s 5h4c Ts5s 9c8d"));
  }

  @Test
  public void test_texas_holdem_5755_5d8cAdAhQc_Qs8s_5s9d() {
    assertEquals(
      "5s9d Qs8s",
      Solver.process("texas-holdem 5d8cAdAhQc Qs8s 5s9d"));
  }

  @Test
  public void test_texas_holdem_5756_3c8d8hAdKh_7c8s_AhAc_Kc4c_7hKs_7d2d_8c5c_Qd9h_QcKd() {
    assertEquals(
      "7d2d Qd9h 7hKs=Kc4c=QcKd 7c8s=8c5c AhAc",
      Solver.process("texas-holdem 3c8d8hAdKh 7c8s AhAc Kc4c 7hKs 7d2d 8c5c Qd9h QcKd"));
  }

  @Test
  public void test_texas_holdem_5757_2h7s9dKcTs_AsTd_6s6d_8d4s_3c6h_Jh5d_3d4c_2s8c_5sQs_7dAc() {
    assertEquals(
      "3d4c 3c6h 8d4s Jh5d 5sQs 2s8c 6s6d 7dAc AsTd",
      Solver.process("texas-holdem 2h7s9dKcTs AsTd 6s6d 8d4s 3c6h Jh5d 3d4c 2s8c 5sQs 7dAc"));
  }

  @Test
  public void test_texas_holdem_5758_2d3s4cQhTs_8dKc_Ah2h_5c4s_5sJh() {
    assertEquals(
      "5sJh 8dKc Ah2h 5c4s",
      Solver.process("texas-holdem 2d3s4cQhTs 8dKc Ah2h 5c4s 5sJh"));
  }

  @Test
  public void test_texas_holdem_5759_2s5c7sJcTc_Ks8c_Jd4h_2dKc_9s7c_4s6d_Kh4c_Ac9c() {
    assertEquals(
      "4s6d Kh4c Ks8c 2dKc 9s7c Jd4h Ac9c",
      Solver.process("texas-holdem 2s5c7sJcTc Ks8c Jd4h 2dKc 9s7c 4s6d Kh4c Ac9c"));
  }

  @Test
  public void test_texas_holdem_5760_4h5h6h9hTh_9c3d_7sKd() {
    assertEquals(
      "7sKd=9c3d",
      Solver.process("texas-holdem 4h5h6h9hTh 9c3d 7sKd"));
  }

  @Test
  public void test_texas_holdem_5761_2h6d9dJsKd_8dQs_2sTs_Qc3c_As8s_4h4s_5dJh_Th2d() {
    assertEquals(
      "Qc3c 8dQs As8s 2sTs=Th2d 4h4s 5dJh",
      Solver.process("texas-holdem 2h6d9dJsKd 8dQs 2sTs Qc3c As8s 4h4s 5dJh Th2d"));
  }

  @Test
  public void test_texas_holdem_5762_4hAcQsTdTs_8d4s_6h8h_Kd9h() {
    assertEquals(
      "6h8h Kd9h 8d4s",
      Solver.process("texas-holdem 4hAcQsTdTs 8d4s 6h8h Kd9h"));
  }

  @Test
  public void test_texas_holdem_5763_3d3s6dKdQc_4sJc_9dQs_4h9c_8d2c_4dTc_9hJh_ThTd() {
    assertEquals(
      "8d2c 4h9c 4dTc 4sJc=9hJh ThTd 9dQs",
      Solver.process("texas-holdem 3d3s6dKdQc 4sJc 9dQs 4h9c 8d2c 4dTc 9hJh ThTd"));
  }

  @Test
  public void test_texas_holdem_5764_4s5cAsJdQh_6d3s_QsKc_3d8c_Ks2h_4dJc() {
    assertEquals(
      "6d3s 3d8c Ks2h QsKc 4dJc",
      Solver.process("texas-holdem 4s5cAsJdQh 6d3s QsKc 3d8c Ks2h 4dJc"));
  }

  @Test
  public void test_texas_holdem_5765_2h8cJhKdKs_As4s_Ah4c_2sTs() {
    assertEquals(
      "Ah4c=As4s 2sTs",
      Solver.process("texas-holdem 2h8cJhKdKs As4s Ah4c 2sTs"));
  }

  @Test
  public void test_texas_holdem_5766_2c2d3c7hJs_4hQc_7dTs_5hKh_Jh2s_KcKs() {
    assertEquals(
      "4hQc 5hKh 7dTs KcKs Jh2s",
      Solver.process("texas-holdem 2c2d3c7hJs 4hQc 7dTs 5hKh Jh2s KcKs"));
  }

  @Test
  public void test_texas_holdem_5767_2s3d8c9cAh_Qs5h_7dKd_7hTd_QhTc_4d5d_3sJc() {
    assertEquals(
      "7hTd Qs5h QhTc 7dKd 3sJc 4d5d",
      Solver.process("texas-holdem 2s3d8c9cAh Qs5h 7dKd 7hTd QhTc 4d5d 3sJc"));
  }

  @Test
  public void test_texas_holdem_5768_3h6h7cAdTs_7d2c_KsQd_As5c_Th7h() {
    assertEquals(
      "KsQd 7d2c As5c Th7h",
      Solver.process("texas-holdem 3h6h7cAdTs 7d2c KsQd As5c Th7h"));
  }

  @Test
  public void test_texas_holdem_5769_2hJdKdQsTh_2cKc_2s4s_Jc7c_Kh8d_5hQd_6sJs() {
    assertEquals(
      "2s4s 6sJs=Jc7c 5hQd Kh8d 2cKc",
      Solver.process("texas-holdem 2hJdKdQsTh 2cKc 2s4s Jc7c Kh8d 5hQd 6sJs"));
  }

  @Test
  public void test_texas_holdem_5770_2s7c7dAdKc_4d5d_Qc3s_QdTh_5h2h_6h5c_8s9c_2d4h_Qh5s() {
    assertEquals(
      "4d5d 6h5c 8s9c Qc3s=QdTh=Qh5s 2d4h=5h2h",
      Solver.process("texas-holdem 2s7c7dAdKc 4d5d Qc3s QdTh 5h2h 6h5c 8s9c 2d4h Qh5s"));
  }

  @Test
  public void test_texas_holdem_5771_3c4d9hKsQd_5h5s_6hQc_4c8d_JhJs_Td8c_8s2c() {
    assertEquals(
      "8s2c Td8c 4c8d 5h5s JhJs 6hQc",
      Solver.process("texas-holdem 3c4d9hKsQd 5h5s 6hQc 4c8d JhJs Td8c 8s2c"));
  }

  @Test
  public void test_texas_holdem_5772_5s7d8dJhTc_8s3c_2d9h_4cAh_TdKh_2c3d_5d6h_KsQs_JsJc_9dAs() {
    assertEquals(
      "2c3d KsQs 4cAh 5d6h 8s3c TdKh JsJc 2d9h=9dAs",
      Solver.process("texas-holdem 5s7d8dJhTc 8s3c 2d9h 4cAh TdKh 2c3d 5d6h KsQs JsJc 9dAs"));
  }

  @Test
  public void test_texas_holdem_5773_4h6c6d7dJd_9c9d_5h2c_5cKh_9s2s_4s3h_Td8s_6hTh() {
    assertEquals(
      "5h2c 9s2s Td8s 5cKh 4s3h 9c9d 6hTh",
      Solver.process("texas-holdem 4h6c6d7dJd 9c9d 5h2c 5cKh 9s2s 4s3h Td8s 6hTh"));
  }

  @Test
  public void test_texas_holdem_5774_2c7s8d9hTs_7d8s_9d2d_AsTc_9c4c_5s6d() {
    assertEquals(
      "9c4c AsTc 7d8s 9d2d 5s6d",
      Solver.process("texas-holdem 2c7s8d9hTs 7d8s 9d2d AsTc 9c4c 5s6d"));
  }

  @Test
  public void test_texas_holdem_5775_2d4sJcKsQh_Ah3s_7cTc_AcQd_9c2h_3hTd_Kc6s_4dQs() {
    assertEquals(
      "3hTd 7cTc Ah3s 9c2h AcQd Kc6s 4dQs",
      Solver.process("texas-holdem 2d4sJcKsQh Ah3s 7cTc AcQd 9c2h 3hTd Kc6s 4dQs"));
  }

  @Test
  public void test_texas_holdem_5776_2s8s9cAcAd_9d9s_KcQd_Js2d() {
    assertEquals(
      "KcQd Js2d 9d9s",
      Solver.process("texas-holdem 2s8s9cAcAd 9d9s KcQd Js2d"));
  }

  @Test
  public void test_texas_holdem_5777_2d3d5h9hTd_AhKc_AsJs_8sJh_Qd9d() {
    assertEquals(
      "8sJh AsJs AhKc Qd9d",
      Solver.process("texas-holdem 2d3d5h9hTd AhKc AsJs 8sJh Qd9d"));
  }

  @Test
  public void test_texas_holdem_5778_4d7cAdJsTd_4c6s_7sTh_3s9s_3cQc() {
    assertEquals(
      "3s9s 3cQc 4c6s 7sTh",
      Solver.process("texas-holdem 4d7cAdJsTd 4c6s 7sTh 3s9s 3cQc"));
  }

  @Test
  public void test_texas_holdem_5779_6c7sAsQcQd_5c4s_4dKc_Td2h() {
    assertEquals(
      "5c4s Td2h 4dKc",
      Solver.process("texas-holdem 6c7sAsQcQd 5c4s 4dKc Td2h"));
  }

  @Test
  public void test_texas_holdem_5780_5h6c6d9dJd_Jh8d_3cTd_2hKd_Qs9h() {
    assertEquals(
      "3cTd 2hKd Qs9h Jh8d",
      Solver.process("texas-holdem 5h6c6d9dJd Jh8d 3cTd 2hKd Qs9h"));
  }

  @Test
  public void test_texas_holdem_5781_2c2s3c4dQc_AcJs_Ks2d_9d7c_7h4c_Jh6s_TcQd_6cKc_KdAh_9c7s() {
    assertEquals(
      "9c7s=9d7c Jh6s AcJs KdAh 7h4c TcQd Ks2d 6cKc",
      Solver.process("texas-holdem 2c2s3c4dQc AcJs Ks2d 9d7c 7h4c Jh6s TcQd 6cKc KdAh 9c7s"));
  }

  @Test
  public void test_texas_holdem_5782_5h8s9cKcQs_3dJd_3c5d_5cKh_8d5s_8c3h_4d2d() {
    assertEquals(
      "4d2d 3dJd 3c5d 8c3h 8d5s 5cKh",
      Solver.process("texas-holdem 5h8s9cKcQs 3dJd 3c5d 5cKh 8d5s 8c3h 4d2d"));
  }

  @Test
  public void test_texas_holdem_5783_6d6hAhJcJh_Kd7d_TsKs_3hQd_Qc8d() {
    assertEquals(
      "3hQd=Kd7d=Qc8d=TsKs",
      Solver.process("texas-holdem 6d6hAhJcJh Kd7d TsKs 3hQd Qc8d"));
  }

  @Test
  public void test_texas_holdem_5784_5s6s8cJdJh_KhQc_3cTc_2cAs_8hAc_3dAh_Th2h() {
    assertEquals(
      "3cTc=Th2h KhQc 2cAs=3dAh 8hAc",
      Solver.process("texas-holdem 5s6s8cJdJh KhQc 3cTc 2cAs 8hAc 3dAh Th2h"));
  }

  @Test
  public void test_texas_holdem_5785_2d3c3h4s8c_8h5h_4c4d_TsQs_JdQc_6s3s_9sAc_QdJc() {
    assertEquals(
      "TsQs JdQc=QdJc 9sAc 8h5h 6s3s 4c4d",
      Solver.process("texas-holdem 2d3c3h4s8c 8h5h 4c4d TsQs JdQc 6s3s 9sAc QdJc"));
  }

  @Test
  public void test_texas_holdem_5786_9hAdAhKdTs_4s7h_8sKs_2c3s_Qd2h() {
    assertEquals(
      "2c3s=4s7h Qd2h 8sKs",
      Solver.process("texas-holdem 9hAdAhKdTs 4s7h 8sKs 2c3s Qd2h"));
  }

  @Test
  public void test_texas_holdem_5787_4h5s9hKdQd_Ad5d_5c2c_Td8d_6sAh_KhJh_TcJd() {
    assertEquals(
      "Td8d 6sAh 5c2c Ad5d KhJh TcJd",
      Solver.process("texas-holdem 4h5s9hKdQd Ad5d 5c2c Td8d 6sAh KhJh TcJd"));
  }

  @Test
  public void test_texas_holdem_5788_5h6h7s8hKd_7hTh_Qc4h_JhTd_Ah4c_2s5c_5dJc_6dKs_3s3c_2cTs() {
    assertEquals(
      "2cTs JhTd 3s3c 2s5c 5dJc 6dKs Ah4c=Qc4h 7hTh",
      Solver.process("texas-holdem 5h6h7s8hKd 7hTh Qc4h JhTd Ah4c 2s5c 5dJc 6dKs 3s3c 2cTs"));
  }

  @Test
  public void test_texas_holdem_5789_2s7c7hQhTh_KcJd_6s3h_3d2c_3cQd_7d9s_Kh6h_Ad9h() {
    assertEquals(
      "6s3h KcJd Ad9h 3d2c 3cQd 7d9s Kh6h",
      Solver.process("texas-holdem 2s7c7hQhTh KcJd 6s3h 3d2c 3cQd 7d9s Kh6h Ad9h"));
  }

  @Test
  public void test_texas_holdem_5790_2c4c5sTcTd_8dTh_Kc7d_8c5h_KdKh_9sQh() {
    assertEquals(
      "9sQh Kc7d 8c5h KdKh 8dTh",
      Solver.process("texas-holdem 2c4c5sTcTd 8dTh Kc7d 8c5h KdKh 9sQh"));
  }

  @Test
  public void test_texas_holdem_5791_2c2s3s5d7c_TsKc_8sKs_5c2h_4h6c_8h4c_JcQh() {
    assertEquals(
      "8h4c JcQh 8sKs TsKc 4h6c 5c2h",
      Solver.process("texas-holdem 2c2s3s5d7c TsKc 8sKs 5c2h 4h6c 8h4c JcQh"));
  }

  @Test
  public void test_texas_holdem_5792_2h4d4hJcKd_3c4c_3hJd_Kh8d_Tc7d_2cAc_4s6h_5h9c_9s7c_ThQc() {
    assertEquals(
      "5h9c=9s7c Tc7d ThQc 2cAc 3hJd Kh8d 3c4c=4s6h",
      Solver.process("texas-holdem 2h4d4hJcKd 3c4c 3hJd Kh8d Tc7d 2cAc 4s6h 5h9c 9s7c ThQc"));
  }

  @Test
  public void test_texas_holdem_5793_4d5s6s8s9c_2c7c_Th4c_JcQs_KhTc_7sAc_9d9h() {
    assertEquals(
      "JcQs KhTc Th4c 9d9h 2c7c=7sAc",
      Solver.process("texas-holdem 4d5s6s8s9c 2c7c Th4c JcQs KhTc 7sAc 9d9h"));
  }

  @Test
  public void test_texas_holdem_5794_2c3c6h7c9s_Jh3h_9d7s_JcKs_4h6s_3s4s_9cAd_QhQs() {
    assertEquals(
      "JcKs 3s4s Jh3h 4h6s 9cAd QhQs 9d7s",
      Solver.process("texas-holdem 2c3c6h7c9s Jh3h 9d7s JcKs 4h6s 3s4s 9cAd QhQs"));
  }

  @Test
  public void test_texas_holdem_5795_2s4h5s6h8c_Kd2c_Js3c_As5c_3hQh() {
    assertEquals(
      "Kd2c As5c 3hQh=Js3c",
      Solver.process("texas-holdem 2s4h5s6h8c Kd2c Js3c As5c 3hQh"));
  }

  @Test
  public void test_texas_holdem_5796_5c8h8s9cTd_4d2h_As7d() {
    assertEquals(
      "4d2h As7d",
      Solver.process("texas-holdem 5c8h8s9cTd 4d2h As7d"));
  }

  @Test
  public void test_texas_holdem_5797_2d5c6s7hAc_JsTd_Kh8h_Jh7d() {
    assertEquals(
      "JsTd Kh8h Jh7d",
      Solver.process("texas-holdem 2d5c6s7hAc JsTd Kh8h Jh7d"));
  }

  @Test
  public void test_texas_holdem_5798_4c9dTcTdTs_5sQs_9cJd_Jc8c_Ks6s_2sAs_3cAc() {
    assertEquals(
      "Jc8c 5sQs Ks6s 2sAs=3cAc 9cJd",
      Solver.process("texas-holdem 4c9dTcTdTs 5sQs 9cJd Jc8c Ks6s 2sAs 3cAc"));
  }

  @Test
  public void test_texas_holdem_5799_2d3d7s8dQd_Ac6d_9cQh_6c9s_TsTc_Qs5h_9h3s_JdKh_AhKc_7hTh() {
    assertEquals(
      "6c9s AhKc 9h3s 7hTh TsTc Qs5h 9cQh Ac6d JdKh",
      Solver.process("texas-holdem 2d3d7s8dQd Ac6d 9cQh 6c9s TsTc Qs5h 9h3s JdKh AhKc 7hTh"));
  }

  @Test
  public void test_texas_holdem_5800_2h2s8sAcJd_6hTd_7cKs_6s8c_5d9d_7d3h_3cKh_QhAh_4s6c_JsTc() {
    assertEquals(
      "4s6c=7d3h 5d9d 6hTd 3cKh=7cKs 6s8c JsTc QhAh",
      Solver.process("texas-holdem 2h2s8sAcJd 6hTd 7cKs 6s8c 5d9d 7d3h 3cKh QhAh 4s6c JsTc"));
  }

  @Test
  public void test_texas_holdem_5801_2d2h5cJsTd_9c3c_3d3h_6s9d_2s2c_8sKd() {
    assertEquals(
      "6s9d=9c3c 8sKd 3d3h 2s2c",
      Solver.process("texas-holdem 2d2h5cJsTd 9c3c 3d3h 6s9d 2s2c 8sKd"));
  }

  @Test
  public void test_texas_holdem_5802_3s7s8sTcTd_5hJh_Qd7h_6hQs_8c8d_Ts5c() {
    assertEquals(
      "5hJh 6hQs Qd7h Ts5c 8c8d",
      Solver.process("texas-holdem 3s7s8sTcTd 5hJh Qd7h 6hQs 8c8d Ts5c"));
  }

  @Test
  public void test_texas_holdem_5803_3h5s7hAsKh_ThKc_Qd6d_6sQh_6h5d_2c9s_Tc9h_4dKd_Td4h() {
    assertEquals(
      "2c9s Td4h Tc9h 6sQh=Qd6d 6h5d 4dKd ThKc",
      Solver.process("texas-holdem 3h5s7hAsKh ThKc Qd6d 6sQh 6h5d 2c9s Tc9h 4dKd Td4h"));
  }

  @Test
  public void test_texas_holdem_5804_7h8dJhJsQh_7dAc_4d2c_Th6c_4sAs_Ad9d() {
    assertEquals(
      "4d2c Th6c 4sAs Ad9d 7dAc",
      Solver.process("texas-holdem 7h8dJhJsQh 7dAc 4d2c Th6c 4sAs Ad9d"));
  }

  @Test
  public void test_texas_holdem_5805_3c5c7h8dAh_QcQd_8c5s_2dKd_Qh9d_6c3s_5h4d_8hJc() {
    assertEquals(
      "Qh9d 2dKd 6c3s 5h4d 8hJc QcQd 8c5s",
      Solver.process("texas-holdem 3c5c7h8dAh QcQd 8c5s 2dKd Qh9d 6c3s 5h4d 8hJc"));
  }

  @Test
  public void test_texas_holdem_5806_6c6sJcJsQh_AhAs_Jd3c_Qs5d_2dQd_9d3d() {
    assertEquals(
      "9d3d 2dQd=Qs5d AhAs Jd3c",
      Solver.process("texas-holdem 6c6sJcJsQh AhAs Jd3c Qs5d 2dQd 9d3d"));
  }

  @Test
  public void test_texas_holdem_5807_4d4h7c9hKh_2d7d_JcAh_JsAc_5d2s_6sQh_Ts8s() {
    assertEquals(
      "5d2s Ts8s 6sQh JcAh=JsAc 2d7d",
      Solver.process("texas-holdem 4d4h7c9hKh 2d7d JcAh JsAc 5d2s 6sQh Ts8s"));
  }

  @Test
  public void test_texas_holdem_5808_2d4s5s9d9h_7s4d_2h6d_3c2c() {
    assertEquals(
      "3c2c 2h6d 7s4d",
      Solver.process("texas-holdem 2d4s5s9d9h 7s4d 2h6d 3c2c"));
  }

  @Test
  public void test_texas_holdem_5809_3s4s9cAcQc_9dTc_TsQd_Qs6c_7s4c_Jh2s_AhKc_4d8d_AsTh_9h8c() {
    assertEquals(
      "Jh2s 4d8d=7s4c 9h8c 9dTc Qs6c TsQd AsTh AhKc",
      Solver.process("texas-holdem 3s4s9cAcQc 9dTc TsQd Qs6c 7s4c Jh2s AhKc 4d8d AsTh 9h8c"));
  }

  @Test
  public void test_texas_holdem_5810_2c4s6dAdKd_5h3d_Kc9d_KsQh_JhAh_3hTh_Td6s_6h7d_8s5d_JdAs() {
    assertEquals(
      "8s5d 3hTh 6h7d Td6s Kc9d KsQh JdAs=JhAh 5h3d",
      Solver.process("texas-holdem 2c4s6dAdKd 5h3d Kc9d KsQh JhAh 3hTh Td6s 6h7d 8s5d JdAs"));
  }

  @Test
  public void test_texas_holdem_5811_2d2h5cKdKs_TsAh_3s6h_8d2s_KcTc_2cQc_8s6s_Qs8c() {
    assertEquals(
      "3s6h 8s6s Qs8c TsAh 2cQc=8d2s KcTc",
      Solver.process("texas-holdem 2d2h5cKdKs TsAh 3s6h 8d2s KcTc 2cQc 8s6s Qs8c"));
  }

  @Test
  public void test_texas_holdem_5812_4s7cAcJdTh_4hTs_6h4d_8cAh() {
    assertEquals(
      "6h4d 8cAh 4hTs",
      Solver.process("texas-holdem 4s7cAcJdTh 4hTs 6h4d 8cAh"));
  }

  @Test
  public void test_texas_holdem_5813_4c4h5h7h8d_KdTd_8s8h_Ks9s_3hKh_TsTc_Jh7s() {
    assertEquals(
      "Ks9s KdTd Jh7s TsTc 3hKh 8s8h",
      Solver.process("texas-holdem 4c4h5h7h8d KdTd 8s8h Ks9s 3hKh TsTc Jh7s"));
  }

  @Test
  public void test_texas_holdem_5814_6c9cAhQcTc_Qs8h_JcKh_5dAs_9dAd_9sJd_9h6s_3sKc_2dKd() {
    assertEquals(
      "2dKd 9sJd Qs8h 5dAs 9h6s 9dAd JcKh 3sKc",
      Solver.process("texas-holdem 6c9cAhQcTc Qs8h JcKh 5dAs 9dAd 9sJd 9h6s 3sKc 2dKd"));
  }

  @Test
  public void test_texas_holdem_5815_6s7dAcTcTd_2hJh_Qd9c_KcQs() {
    assertEquals(
      "2hJh Qd9c KcQs",
      Solver.process("texas-holdem 6s7dAcTcTd 2hJh Qd9c KcQs"));
  }

  @Test
  public void test_texas_holdem_5816_5c5h6d7sQh_6cAc_4c3d() {
    assertEquals(
      "6cAc 4c3d",
      Solver.process("texas-holdem 5c5h6d7sQh 6cAc 4c3d"));
  }

  @Test
  public void test_texas_holdem_5817_4s7h8s9cKs_AsQs_9h9d_6c4c() {
    assertEquals(
      "6c4c 9h9d AsQs",
      Solver.process("texas-holdem 4s7h8s9cKs AsQs 9h9d 6c4c"));
  }

  @Test
  public void test_texas_holdem_5818_3c5s9cAhTs_8d4c_Th4d_2s8c() {
    assertEquals(
      "2s8c=8d4c Th4d",
      Solver.process("texas-holdem 3c5s9cAhTs 8d4c Th4d 2s8c"));
  }

  @Test
  public void test_texas_holdem_5819_2s5h7cAhJs_8c5s_8hJh_7h2h_3s4c_2d6h_4h2c_Kd7d_Ts4s_9dJc() {
    assertEquals(
      "Ts4s 2d6h=4h2c 8c5s Kd7d 8hJh 9dJc 7h2h 3s4c",
      Solver.process("texas-holdem 2s5h7cAhJs 8c5s 8hJh 7h2h 3s4c 2d6h 4h2c Kd7d Ts4s 9dJc"));
  }

  @Test
  public void test_texas_holdem_5820_2h4d4h7dJc_6h9h_Qd3h_As8c_8s5h_6s9d_QhKd() {
    assertEquals(
      "8s5h 6h9h=6s9d Qd3h QhKd As8c",
      Solver.process("texas-holdem 2h4d4h7dJc 6h9h Qd3h As8c 8s5h 6s9d QhKd"));
  }

  @Test
  public void test_texas_holdem_5821_3s7c8sJcQc_TcKs_Js3d_KcJd_Jh2d_Qd8c_8h4d_3cKh_Ts5c() {
    assertEquals(
      "Ts5c TcKs 3cKh 8h4d Jh2d KcJd Js3d Qd8c",
      Solver.process("texas-holdem 3s7c8sJcQc TcKs Js3d KcJd Jh2d Qd8c 8h4d 3cKh Ts5c"));
  }

  @Test
  public void test_texas_holdem_5822_3c5c8dAhKd_5sKs_4s4h_3hJs() {
    assertEquals(
      "3hJs 4s4h 5sKs",
      Solver.process("texas-holdem 3c5c8dAhKd 5sKs 4s4h 3hJs"));
  }

  @Test
  public void test_texas_holdem_5823_3c5s8sJsQs_2c4h_5c2s_8cAs_8h7s_2d6d_9c3h_Jh4s() {
    assertEquals(
      "2c4h 2d6d 9c3h 5c2s Jh4s 8h7s 8cAs",
      Solver.process("texas-holdem 3c5s8sJsQs 2c4h 5c2s 8cAs 8h7s 2d6d 9c3h Jh4s"));
  }

  @Test
  public void test_texas_holdem_5824_5c6dQdQsTh_Ts6c_2h8h_4cAc_3c6h_Kc5d_3hJh_9cJs_QhKh() {
    assertEquals(
      "2h8h 3hJh 9cJs 4cAc Kc5d 3c6h Ts6c QhKh",
      Solver.process("texas-holdem 5c6dQdQsTh Ts6c 2h8h 4cAc 3c6h Kc5d 3hJh 9cJs QhKh"));
  }

  @Test
  public void test_texas_holdem_5825_3h8c9dJdQh_Ah5s_7c2c_Kc9c() {
    assertEquals(
      "7c2c Ah5s Kc9c",
      Solver.process("texas-holdem 3h8c9dJdQh Ah5s 7c2c Kc9c"));
  }

  @Test
  public void test_texas_holdem_5826_7cJdJhKhQd_3d4c_As9c_Tc2s_7h2h_JsTs_8d5d_8s4d() {
    assertEquals(
      "3d4c 8d5d=8s4d Tc2s As9c 7h2h JsTs",
      Solver.process("texas-holdem 7cJdJhKhQd 3d4c As9c Tc2s 7h2h JsTs 8d5d 8s4d"));
  }

  @Test
  public void test_texas_holdem_5827_2s6h8dQhTc_6d8h_QsAd_6sKc_7c6c_7h4d_4sQc_2cJd_5s4h() {
    assertEquals(
      "5s4h 7h4d 2cJd 7c6c 6sKc 4sQc QsAd 6d8h",
      Solver.process("texas-holdem 2s6h8dQhTc 6d8h QsAd 6sKc 7c6c 7h4d 4sQc 2cJd 5s4h"));
  }

  @Test
  public void test_texas_holdem_5828_3s4d6c6dJd_7cQc_JsQd_KsKd_2cAc() {
    assertEquals(
      "7cQc 2cAc JsQd KsKd",
      Solver.process("texas-holdem 3s4d6c6dJd 7cQc JsQd KsKd 2cAc"));
  }

  @Test
  public void test_texas_holdem_5829_2d3s4h7d8h_3h4d_Ks6d_2s9s_Kc9h_6sTd() {
    assertEquals(
      "6sTd Ks6d Kc9h 2s9s 3h4d",
      Solver.process("texas-holdem 2d3s4h7d8h 3h4d Ks6d 2s9s Kc9h 6sTd"));
  }

  @Test
  public void test_texas_holdem_5830_2h5h6h8cAs_8h4c_5d3s_JhQc_QdQh_4s9d() {
    assertEquals(
      "4s9d JhQc 5d3s 8h4c QdQh",
      Solver.process("texas-holdem 2h5h6h8cAs 8h4c 5d3s JhQc QdQh 4s9d"));
  }

  @Test
  public void test_texas_holdem_5831_2d2h8d8hJc_QdJh_3d8c_3c5s_7hAd_3s9c() {
    assertEquals(
      "3c5s=3s9c 7hAd QdJh 3d8c",
      Solver.process("texas-holdem 2d2h8d8hJc QdJh 3d8c 3c5s 7hAd 3s9c"));
  }

  @Test
  public void test_texas_holdem_5832_AcJcQdTcTh_5dAs_3s8c_2dKs_3cTd_Kc9h() {
    assertEquals(
      "3s8c 5dAs 3cTd 2dKs=Kc9h",
      Solver.process("texas-holdem AcJcQdTcTh 5dAs 3s8c 2dKs 3cTd Kc9h"));
  }

  @Test
  public void test_texas_holdem_5833_2d2h4c5s7c_Qd5c_QsAd_3cAs_8h3s_6dQh_3d7s_7dKh_9dJd_Ah2c() {
    assertEquals(
      "8h3s 9dJd 6dQh QsAd Qd5c 3d7s 7dKh Ah2c 3cAs",
      Solver.process("texas-holdem 2d2h4c5s7c Qd5c QsAd 3cAs 8h3s 6dQh 3d7s 7dKh 9dJd Ah2c"));
  }

  @Test
  public void test_texas_holdem_5834_3c3s6c7c8s_JcQh_2hTc_Qs7s() {
    assertEquals(
      "2hTc JcQh Qs7s",
      Solver.process("texas-holdem 3c3s6c7c8s JcQh 2hTc Qs7s"));
  }

  @Test
  public void test_texas_holdem_5835_2h7hAhAsTd_4s2d_2c3d_7cQd() {
    assertEquals(
      "2c3d=4s2d 7cQd",
      Solver.process("texas-holdem 2h7hAhAsTd 4s2d 2c3d 7cQd"));
  }

  @Test
  public void test_texas_holdem_5836_3h4h5c5dQs_4cTh_6cAd_Qd6s_8h6d_Jh6h_3sJs() {
    assertEquals(
      "8h6d Jh6h 6cAd 3sJs 4cTh Qd6s",
      Solver.process("texas-holdem 3h4h5c5dQs 4cTh 6cAd Qd6s 8h6d Jh6h 3sJs"));
  }

  @Test
  public void test_texas_holdem_5837_2s5s8hKdTc_6d4c_AdTd_Ts2c() {
    assertEquals(
      "6d4c AdTd Ts2c",
      Solver.process("texas-holdem 2s5s8hKdTc 6d4c AdTd Ts2c"));
  }

  @Test
  public void test_texas_holdem_5838_2c2hAdJcTh_3h5h_6c2s_6s6d() {
    assertEquals(
      "3h5h 6s6d 6c2s",
      Solver.process("texas-holdem 2c2hAdJcTh 3h5h 6c2s 6s6d"));
  }

  @Test
  public void test_texas_holdem_5839_7c8hAdKcQs_Jh3h_4c2d() {
    assertEquals(
      "4c2d Jh3h",
      Solver.process("texas-holdem 7c8hAdKcQs Jh3h 4c2d"));
  }

  @Test
  public void test_texas_holdem_5840_5s7d8c8d8h_9c2s_6s8s_Qd9s_4s2d() {
    assertEquals(
      "4s2d 9c2s Qd9s 6s8s",
      Solver.process("texas-holdem 5s7d8c8d8h 9c2s 6s8s Qd9s 4s2d"));
  }

  @Test
  public void test_texas_holdem_5841_4d4h6s9dTs_3s9h_JcAh_2d3h_7d4c_Qc5s_3dQd_As5c() {
    assertEquals(
      "2d3h 3dQd=Qc5s As5c JcAh 3s9h 7d4c",
      Solver.process("texas-holdem 4d4h6s9dTs 3s9h JcAh 2d3h 7d4c Qc5s 3dQd As5c"));
  }

  @Test
  public void test_texas_holdem_5842_2c3c7h7s9h_3sJc_6h7c_Qh3h() {
    assertEquals(
      "3sJc Qh3h 6h7c",
      Solver.process("texas-holdem 2c3c7h7s9h 3sJc 6h7c Qh3h"));
  }

  @Test
  public void test_texas_holdem_5843_3d3h4h5sJd_3cTc_QcQs_9h9s_5c7s_Qd8h_5dTh_6sJs_4s8c() {
    assertEquals(
      "Qd8h 4s8c 5c7s=5dTh 9h9s 6sJs QcQs 3cTc",
      Solver.process("texas-holdem 3d3h4h5sJd 3cTc QcQs 9h9s 5c7s Qd8h 5dTh 6sJs 4s8c"));
  }

  @Test
  public void test_texas_holdem_5844_2d2h6s8sTc_Th4d_KdTs_Jc7d_JsAh_8hQs_7h3h_4h9s_5s4s_2sJd() {
    assertEquals(
      "5s4s 7h3h 4h9s Jc7d JsAh 8hQs Th4d KdTs 2sJd",
      Solver.process("texas-holdem 2d2h6s8sTc Th4d KdTs Jc7d JsAh 8hQs 7h3h 4h9s 5s4s 2sJd"));
  }

  @Test
  public void test_texas_holdem_5845_4s6h9c9dKd_QcAd_2sQd() {
    assertEquals(
      "2sQd QcAd",
      Solver.process("texas-holdem 4s6h9c9dKd QcAd 2sQd"));
  }

  @Test
  public void test_texas_holdem_5846_3s5d5hJdQh_Ks6h_5s6c_3d6d_2c5c_9cQs() {
    assertEquals(
      "Ks6h 3d6d 9cQs 2c5c=5s6c",
      Solver.process("texas-holdem 3s5d5hJdQh Ks6h 5s6c 3d6d 2c5c 9cQs"));
  }

  @Test
  public void test_texas_holdem_5847_4d4hQdQsTs_8cKs_8dKc() {
    assertEquals(
      "8cKs=8dKc",
      Solver.process("texas-holdem 4d4hQdQsTs 8cKs 8dKc"));
  }

  @Test
  public void test_texas_holdem_5848_2c2d7cKdQc_JcAh_4d7d_Ac2h() {
    assertEquals(
      "JcAh 4d7d Ac2h",
      Solver.process("texas-holdem 2c2d7cKdQc JcAh 4d7d Ac2h"));
  }

  @Test
  public void test_texas_holdem_5849_2d3c6dAhJs_Tc4d_KcJh_Ts5s_Jd6c_Ad8c_4s3s_7hQc() {
    assertEquals(
      "Tc4d Ts5s 7hQc 4s3s KcJh Ad8c Jd6c",
      Solver.process("texas-holdem 2d3c6dAhJs Tc4d KcJh Ts5s Jd6c Ad8c 4s3s 7hQc"));
  }

  @Test
  public void test_texas_holdem_5850_3d4h5h6s7h_9s6c_9cJc_3cTs() {
    assertEquals(
      "3cTs=9cJc=9s6c",
      Solver.process("texas-holdem 3d4h5h6s7h 9s6c 9cJc 3cTs"));
  }

  @Test
  public void test_texas_holdem_5851_2sQdQhQsTh_2d5d_2hAd() {
    assertEquals(
      "2d5d=2hAd",
      Solver.process("texas-holdem 2sQdQhQsTh 2d5d 2hAd"));
  }

  @Test
  public void test_texas_holdem_5852_3d4c7c8dQs_Td3c_6hKh_4dAd_9s5d_9hKs_8c2s_8h4s() {
    assertEquals(
      "9s5d 6hKh 9hKs Td3c 4dAd 8c2s 8h4s",
      Solver.process("texas-holdem 3d4c7c8dQs Td3c 6hKh 4dAd 9s5d 9hKs 8c2s 8h4s"));
  }

  @Test
  public void test_texas_holdem_5853_3c7dJdKcTc_AdTd_4d4c_Kd8s_Ac8c_2cJh_Qd4h_TsQc_5d3h() {
    assertEquals(
      "Qd4h 5d3h 4d4c TsQc AdTd 2cJh Kd8s Ac8c",
      Solver.process("texas-holdem 3c7dJdKcTc AdTd 4d4c Kd8s Ac8c 2cJh Qd4h TsQc 5d3h"));
  }

  @Test
  public void test_texas_holdem_5854_5c5h6h8cTh_3hQs_Kd9s_3s9h() {
    assertEquals(
      "3s9h 3hQs Kd9s",
      Solver.process("texas-holdem 5c5h6h8cTh 3hQs Kd9s 3s9h"));
  }

  @Test
  public void test_texas_holdem_5855_4d6s9sAhKh_4c7s_6hAd_8c5h_TcQc_Kd3s_2c6c() {
    assertEquals(
      "8c5h TcQc 4c7s 2c6c Kd3s 6hAd",
      Solver.process("texas-holdem 4d6s9sAhKh 4c7s 6hAd 8c5h TcQc Kd3s 2c6c"));
  }

  @Test
  public void test_texas_holdem_5856_3h6s9sQcTs_5s5c_8sJd_Js3s_AhKs_Kc8c_Jh2h_7cTh_Qd2d_Tc9d() {
    assertEquals(
      "Jh2h Kc8c AhKs 5s5c 7cTh Qd2d Tc9d 8sJd Js3s",
      Solver.process("texas-holdem 3h6s9sQcTs 5s5c 8sJd Js3s AhKs Kc8c Jh2h 7cTh Qd2d Tc9d"));
  }

  @Test
  public void test_texas_holdem_5857_9c9dTdThTs_Kc3c_KdQs() {
    assertEquals(
      "Kc3c=KdQs",
      Solver.process("texas-holdem 9c9dTdThTs Kc3c KdQs"));
  }

  @Test
  public void test_texas_holdem_5858_2s3d4d5dKd_Ks4s_9sJs_9cKh_Tc2c_As6s_Jh9h_4h5h_JcQc() {
    assertEquals(
      "9sJs=Jh9h JcQc Tc2c 9cKh 4h5h Ks4s As6s",
      Solver.process("texas-holdem 2s3d4d5dKd Ks4s 9sJs 9cKh Tc2c As6s Jh9h 4h5h JcQc"));
  }

  @Test
  public void test_texas_holdem_5859_2c3d7c9dJh_9sKs_2s5c() {
    assertEquals(
      "2s5c 9sKs",
      Solver.process("texas-holdem 2c3d7c9dJh 9sKs 2s5c"));
  }

  @Test
  public void test_texas_holdem_5860_3d6c8sAhTc_QcKs_6hJs_5sTh_5c2c() {
    assertEquals(
      "5c2c QcKs 6hJs 5sTh",
      Solver.process("texas-holdem 3d6c8sAhTc QcKs 6hJs 5sTh 5c2c"));
  }

  @Test
  public void test_texas_holdem_5861_5s7dKhQdTc_9cAc_JsAd_8dAs_Ah2h_5h6c_7hQc() {
    assertEquals(
      "Ah2h 8dAs 9cAc 5h6c 7hQc JsAd",
      Solver.process("texas-holdem 5s7dKhQdTc 9cAc JsAd 8dAs Ah2h 5h6c 7hQc"));
  }

  @Test
  public void test_texas_holdem_5862_4dAdAsKsQh_3h5d_3dJs_5hKd_ThTs_7s8h_5sJc() {
    assertEquals(
      "3h5d 7s8h 3dJs=5sJc ThTs 5hKd",
      Solver.process("texas-holdem 4dAdAsKsQh 3h5d 3dJs 5hKd ThTs 7s8h 5sJc"));
  }

  @Test
  public void test_texas_holdem_5863_4c4h7sJdTc_QdJh_Kh2h_Jc8h_7h6h() {
    assertEquals(
      "Kh2h 7h6h Jc8h QdJh",
      Solver.process("texas-holdem 4c4h7sJdTc QdJh Kh2h Jc8h 7h6h"));
  }

  @Test
  public void test_texas_holdem_5864_3h6c8hAdTh_AhQc_9cQh_As9d_5h5d() {
    assertEquals(
      "9cQh 5h5d As9d AhQc",
      Solver.process("texas-holdem 3h6c8hAdTh AhQc 9cQh As9d 5h5d"));
  }

  @Test
  public void test_texas_holdem_5865_3c6dJhJsKc_9c4d_9d4s_6h8s_7h6c_4hTs_8dTc() {
    assertEquals(
      "9c4d=9d4s 4hTs 8dTc 6h8s=7h6c",
      Solver.process("texas-holdem 3c6dJhJsKc 9c4d 9d4s 6h8s 7h6c 4hTs 8dTc"));
  }

  @Test
  public void test_texas_holdem_5866_3d6c9sKhTd_3hTh_Kc8d_As9h_QhAh() {
    assertEquals(
      "QhAh As9h Kc8d 3hTh",
      Solver.process("texas-holdem 3d6c9sKhTd 3hTh Kc8d As9h QhAh"));
  }

  @Test
  public void test_texas_holdem_5867_4c6hAdAhJh_6s7d_Ks4d_Qh6c_Qc7s_5d9d_5hTc_3dAc_3c2h_KhTs() {
    assertEquals(
      "3c2h 5d9d 5hTc Qc7s KhTs Ks4d 6s7d Qh6c 3dAc",
      Solver.process("texas-holdem 4c6hAdAhJh 6s7d Ks4d Qh6c Qc7s 5d9d 5hTc 3dAc 3c2h KhTs"));
  }

  @Test
  public void test_texas_holdem_5868_8c8dJhKhQh_AdTc_8hAs_Qs4s_7cJd_7dKs_6dJs_2c5d_QdKc_2d7s() {
    assertEquals(
      "2c5d=2d7s 6dJs=7cJd Qs4s 7dKs QdKc 8hAs AdTc",
      Solver.process("texas-holdem 8c8dJhKhQh AdTc 8hAs Qs4s 7cJd 7dKs 6dJs 2c5d QdKc 2d7s"));
  }

  @Test
  public void test_texas_holdem_5869_2c2h6dAcKc_QsTd_5sQd_7h8s_8cJd() {
    assertEquals(
      "7h8s 8cJd 5sQd=QsTd",
      Solver.process("texas-holdem 2c2h6dAcKc QsTd 5sQd 7h8s 8cJd"));
  }

  @Test
  public void test_texas_holdem_5870_4c7d8dAcKs_2s4h_6d8c() {
    assertEquals(
      "2s4h 6d8c",
      Solver.process("texas-holdem 4c7d8dAcKs 2s4h 6d8c"));
  }

  @Test
  public void test_texas_holdem_5871_6h8hAdKcQc_AsJs_9dTh_3hJc_7d5h() {
    assertEquals(
      "7d5h 9dTh 3hJc AsJs",
      Solver.process("texas-holdem 6h8hAdKcQc AsJs 9dTh 3hJc 7d5h"));
  }

  @Test
  public void test_texas_holdem_5872_3d3hQdQhTd_8d8h_4dKs() {
    assertEquals(
      "4dKs 8d8h",
      Solver.process("texas-holdem 3d3hQdQhTd 8d8h 4dKs"));
  }

  @Test
  public void test_texas_holdem_5873_2c3hAcKcTs_3s7s_Qd4d_8sQh_6hJs_4s6s_Th7h_Ah2d_KdTd_7dKh() {
    assertEquals(
      "4s6s 6hJs Qd4d 8sQh 3s7s Th7h 7dKh KdTd Ah2d",
      Solver.process("texas-holdem 2c3hAcKcTs 3s7s Qd4d 8sQh 6hJs 4s6s Th7h Ah2d KdTd 7dKh"));
  }

  @Test
  public void test_texas_holdem_5874_7c8hKsQsTh_3sQc_5dTd() {
    assertEquals(
      "5dTd 3sQc",
      Solver.process("texas-holdem 7c8hKsQsTh 3sQc 5dTd"));
  }

  @Test
  public void test_texas_holdem_5875_4h7s8cJcKc_3hKs_Js5d_Ac9c() {
    assertEquals(
      "Js5d 3hKs Ac9c",
      Solver.process("texas-holdem 4h7s8cJcKc 3hKs Js5d Ac9c"));
  }

  @Test
  public void test_texas_holdem_5876_5c5d5s9cJs_Th6h_Kc3d_8s6c() {
    assertEquals(
      "8s6c Th6h Kc3d",
      Solver.process("texas-holdem 5c5d5s9cJs Th6h Kc3d 8s6c"));
  }

  @Test
  public void test_texas_holdem_5877_2s4h7d7h8d_7s3d_6sKd_Kc9d_TsTd_9c6d_Tc4d_4s5h() {
    assertEquals(
      "9c6d 6sKd Kc9d 4s5h Tc4d TsTd 7s3d",
      Solver.process("texas-holdem 2s4h7d7h8d 7s3d 6sKd Kc9d TsTd 9c6d Tc4d 4s5h"));
  }

  @Test
  public void test_texas_holdem_5878_5c5h6c9hAc_6d9s_6h2c_3hTd() {
    assertEquals(
      "3hTd 6h2c 6d9s",
      Solver.process("texas-holdem 5c5h6c9hAc 6d9s 6h2c 3hTd"));
  }

  @Test
  public void test_texas_holdem_5879_2c5s7hAdKd_5hQd_Kc6h_7dJs_4s2h_6d9d_Td6s_9h4d_Qc8c_3hAh() {
    assertEquals(
      "9h4d 6d9d Td6s Qc8c 4s2h 5hQd 7dJs Kc6h 3hAh",
      Solver.process("texas-holdem 2c5s7hAdKd 5hQd Kc6h 7dJs 4s2h 6d9d Td6s 9h4d Qc8c 3hAh"));
  }

  @Test
  public void test_texas_holdem_5880_5h5s6c8sTd_7sKs_6dJc_9h4s_Kh3d_Qh2h_5d9c_8d7c() {
    assertEquals(
      "9h4s Qh2h 7sKs=Kh3d 6dJc 8d7c 5d9c",
      Solver.process("texas-holdem 5h5s6c8sTd 7sKs 6dJc 9h4s Kh3d Qh2h 5d9c 8d7c"));
  }

  @Test
  public void test_texas_holdem_5881_2d2h5c5hQd_4d6c_7c8d_Tc5s_JdAd_QhKh() {
    assertEquals(
      "4d6c=7c8d JdAd QhKh Tc5s",
      Solver.process("texas-holdem 2d2h5c5hQd 4d6c 7c8d Tc5s JdAd QhKh"));
  }

  @Test
  public void test_texas_holdem_5882_2h3s9dAhJc_JdKh_4d8s_5h9c_Kc9h_TsJs() {
    assertEquals(
      "4d8s 5h9c Kc9h TsJs JdKh",
      Solver.process("texas-holdem 2h3s9dAhJc JdKh 4d8s 5h9c Kc9h TsJs"));
  }

  @Test
  public void test_texas_holdem_5883_5hJhQcQdTh_8c4d_As9d_3s4c_4sJc_5s9s_6s2c() {
    assertEquals(
      "3s4c 6s2c 8c4d As9d 5s9s 4sJc",
      Solver.process("texas-holdem 5hJhQcQdTh 8c4d As9d 3s4c 4sJc 5s9s 6s2c"));
  }

  @Test
  public void test_texas_holdem_5884_6h7c9hAhTc_2sTs_As7h() {
    assertEquals(
      "2sTs As7h",
      Solver.process("texas-holdem 6h7c9hAhTc 2sTs As7h"));
  }

  @Test
  public void test_texas_holdem_5885_3s6s7s8hKd_Tc3h_Ks7c_AdQh_ThTs_Jd4h() {
    assertEquals(
      "Jd4h AdQh Tc3h ThTs Ks7c",
      Solver.process("texas-holdem 3s6s7s8hKd Tc3h Ks7c AdQh ThTs Jd4h"));
  }

  @Test
  public void test_texas_holdem_5886_5d6sAsJsKd_KhQh_Jd2h_3h6h_Kc4s_4cTs_3s2d_7sQd() {
    assertEquals(
      "3s2d 4cTs 7sQd 3h6h Jd2h Kc4s KhQh",
      Solver.process("texas-holdem 5d6sAsJsKd KhQh Jd2h 3h6h Kc4s 4cTs 3s2d 7sQd"));
  }

  @Test
  public void test_texas_holdem_5887_2d2h7d8sKs_5c3d_6sKd_JdAh_JhJs_9h8d_Th6d() {
    assertEquals(
      "5c3d Th6d JdAh 9h8d JhJs 6sKd",
      Solver.process("texas-holdem 2d2h7d8sKs 5c3d 6sKd JdAh JhJs 9h8d Th6d"));
  }

  @Test
  public void test_texas_holdem_5888_4s5s9sAsTc_Kh6s_7dAc_7hJd_JhTd() {
    assertEquals(
      "7hJd JhTd 7dAc Kh6s",
      Solver.process("texas-holdem 4s5s9sAsTc Kh6s 7dAc 7hJd JhTd"));
  }

  @Test
  public void test_texas_holdem_5889_3h5c9cKsTc_Kd7s_9d9s_Ts2h_Jh6c_AcAh_Th5s_4d2d_Jc9h() {
    assertEquals(
      "4d2d Jh6c Jc9h Ts2h Kd7s AcAh Th5s 9d9s",
      Solver.process("texas-holdem 3h5c9cKsTc Kd7s 9d9s Ts2h Jh6c AcAh Th5s 4d2d Jc9h"));
  }

  @Test
  public void test_texas_holdem_5890_2h3c3sKcKs_Qd6c_Ah6h_JsTs_6sAs_9d4s_3hQs_9hTd_Qh3d_6d5d() {
    assertEquals(
      "6d5d 9d4s 9hTd JsTs Qd6c 6sAs=Ah6h 3hQs=Qh3d",
      Solver.process("texas-holdem 2h3c3sKcKs Qd6c Ah6h JsTs 6sAs 9d4s 3hQs 9hTd Qh3d 6d5d"));
  }

  @Test
  public void test_texas_holdem_5891_3h3s5h6dKd_8h9h_KsAd_8cQs_9s7s_Ts6h_4hAh() {
    assertEquals(
      "9s7s 8h9h 8cQs 4hAh Ts6h KsAd",
      Solver.process("texas-holdem 3h3s5h6dKd 8h9h KsAd 8cQs 9s7s Ts6h 4hAh"));
  }

  @Test
  public void test_texas_holdem_5892_6c7c9sAcTh_Kh5c_9d4s_4dAh() {
    assertEquals(
      "Kh5c 9d4s 4dAh",
      Solver.process("texas-holdem 6c7c9sAcTh Kh5c 9d4s 4dAh"));
  }

  @Test
  public void test_texas_holdem_5893_2h6c7c9cJc_Tc8h_3d2c_Ad5c_9s7h_4d8s() {
    assertEquals(
      "4d8s 9s7h 3d2c Ad5c Tc8h",
      Solver.process("texas-holdem 2h6c7c9cJc Tc8h 3d2c Ad5c 9s7h 4d8s"));
  }

  @Test
  public void test_texas_holdem_5894_3h4s6c7hJc_5cQd_4hKc() {
    assertEquals(
      "4hKc 5cQd",
      Solver.process("texas-holdem 3h4s6c7hJc 5cQd 4hKc"));
  }

  @Test
  public void test_texas_holdem_5895_2h7c7s8dAd_KhKc_Th2c_2s6s_5cJs() {
    assertEquals(
      "5cJs 2s6s=Th2c KhKc",
      Solver.process("texas-holdem 2h7c7s8dAd KhKc Th2c 2s6s 5cJs"));
  }

  @Test
  public void test_texas_holdem_5896_2h4d5s9cKd_2s6s_KcTc_5h7c_2c9s_7s5d_JdKh() {
    assertEquals(
      "2s6s 5h7c=7s5d KcTc JdKh 2c9s",
      Solver.process("texas-holdem 2h4d5s9cKd 2s6s KcTc 5h7c 2c9s 7s5d JdKh"));
  }

  @Test
  public void test_texas_holdem_5897_6c8cKhKsQd_9cAs_Tc7s_6s4d_TdQs_2dJd_2c2h_5h9d() {
    assertEquals(
      "5h9d Tc7s 2dJd 9cAs 2c2h 6s4d TdQs",
      Solver.process("texas-holdem 6c8cKhKsQd 9cAs Tc7s 6s4d TdQs 2dJd 2c2h 5h9d"));
  }

  @Test
  public void test_texas_holdem_5898_2d6c6s8c9h_5h7s_Th7d_4sQs_AhJh_9c7h_2hQc_Js9d_3c3s_Td8h() {
    assertEquals(
      "4sQs AhJh 2hQc 3c3s Td8h 9c7h Js9d 5h7s Th7d",
      Solver.process("texas-holdem 2d6c6s8c9h 5h7s Th7d 4sQs AhJh 9c7h 2hQc Js9d 3c3s Td8h"));
  }

  @Test
  public void test_texas_holdem_5899_2d3h8hJcKd_7sAh_5c3s_6c2c_6d3d_8s7c_4hQs_QcAs_Ac8c() {
    assertEquals(
      "4hQs 7sAh QcAs 6c2c 5c3s=6d3d 8s7c Ac8c",
      Solver.process("texas-holdem 2d3h8hJcKd 7sAh 5c3s 6c2c 6d3d 8s7c 4hQs QcAs Ac8c"));
  }

  @Test
  public void test_texas_holdem_5900_2d5h9d9hTc_JhJs_9s8h_7h3c_8cAd_AsTd_KdJc_KhQh_Qs7s() {
    assertEquals(
      "7h3c Qs7s KdJc KhQh 8cAd AsTd JhJs 9s8h",
      Solver.process("texas-holdem 2d5h9d9hTc JhJs 9s8h 7h3c 8cAd AsTd KdJc KhQh Qs7s"));
  }

  @Test
  public void test_texas_holdem_5901_3h5h7c9cKc_5d9s_6cKd_Qs4d() {
    assertEquals(
      "Qs4d 6cKd 5d9s",
      Solver.process("texas-holdem 3h5h7c9cKc 5d9s 6cKd Qs4d"));
  }

  @Test
  public void test_texas_holdem_5902_7c7d7s9dAd_5cJh_AhQs_6d5s_6s7h_Qh5d_3h4h_3d2h_4c8d() {
    assertEquals(
      "3d2h=3h4h=4c8d=6d5s 5cJh Qh5d AhQs 6s7h",
      Solver.process("texas-holdem 7c7d7s9dAd 5cJh AhQs 6d5s 6s7h Qh5d 3h4h 3d2h 4c8d"));
  }

  @Test
  public void test_texas_holdem_5903_4s5c8dKsQh_3dQs_JhKh_3s8h() {
    assertEquals(
      "3s8h 3dQs JhKh",
      Solver.process("texas-holdem 4s5c8dKsQh 3dQs JhKh 3s8h"));
  }

  @Test
  public void test_texas_holdem_5904_2h9cKcQhTs_9dAd_7hKs_ThAh_7d5c_7c4d() {
    assertEquals(
      "7c4d=7d5c 9dAd ThAh 7hKs",
      Solver.process("texas-holdem 2h9cKcQhTs 9dAd 7hKs ThAh 7d5c 7c4d"));
  }

  @Test
  public void test_texas_holdem_5905_4s7c9cJsKs_3d2d_TdQs_KcQh_4c7d() {
    assertEquals(
      "3d2d KcQh 4c7d TdQs",
      Solver.process("texas-holdem 4s7c9cJsKs 3d2d TdQs KcQh 4c7d"));
  }

  @Test
  public void test_texas_holdem_5906_2c8hJsKcQc_3h2d_2s2h_5sJd_AhQs_6h9h_TcKd_Th6s_4d9s() {
    assertEquals(
      "4d9s=6h9h Th6s 3h2d 5sJd AhQs TcKd 2s2h",
      Solver.process("texas-holdem 2c8hJsKcQc 3h2d 2s2h 5sJd AhQs 6h9h TcKd Th6s 4d9s"));
  }

  @Test
  public void test_texas_holdem_5907_3h5s6d6hAc_Ks9h_5h3c_5c7c_5d9s_2h9d_4s8s_8h4h_QsAs() {
    assertEquals(
      "4s8s=8h4h 2h9d Ks9h 5c7c=5d9s=5h3c QsAs",
      Solver.process("texas-holdem 3h5s6d6hAc Ks9h 5h3c 5c7c 5d9s 2h9d 4s8s 8h4h QsAs"));
  }

  @Test
  public void test_texas_holdem_5908_5d8h8sAsJd_ThKd_4h5h_2h8c_KcKs_8dQs() {
    assertEquals(
      "ThKd 4h5h KcKs 2h8c 8dQs",
      Solver.process("texas-holdem 5d8h8sAsJd ThKd 4h5h 2h8c KcKs 8dQs"));
  }

  @Test
  public void test_texas_holdem_5909_2s5h6c7sAc_QcJs_6sTs_9s7h_8hAs_9cQd_2dJd_Kh4d_4hKd() {
    assertEquals(
      "9cQd QcJs 4hKd=Kh4d 2dJd 6sTs 9s7h 8hAs",
      Solver.process("texas-holdem 2s5h6c7sAc QcJs 6sTs 9s7h 8hAs 9cQd 2dJd Kh4d 4hKd"));
  }

  @Test
  public void test_texas_holdem_5910_4h6s7h8sTs_9s6d_9dKd_7d8c_5sKs_2hTh_TcQs_4s7s_6h7c() {
    assertEquals(
      "2hTh TcQs 6h7c 7d8c 9dKd=9s6d 4s7s 5sKs",
      Solver.process("texas-holdem 4h6s7h8sTs 9s6d 9dKd 7d8c 5sKs 2hTh TcQs 4s7s 6h7c"));
  }

  @Test
  public void test_texas_holdem_5911_2d3d6d9hAh_2h7s_5sTh_6c8h_3s3c_Ad6s_9sQs_Td7h_Kc3h_4s7d() {
    assertEquals(
      "4s7d 5sTh Td7h 2h7s Kc3h 6c8h 9sQs Ad6s 3s3c",
      Solver.process("texas-holdem 2d3d6d9hAh 2h7s 5sTh 6c8h 3s3c Ad6s 9sQs Td7h Kc3h 4s7d"));
  }

  @Test
  public void test_texas_holdem_5912_2s6h8dAdJd_4h2h_Js8c_5s6d_KsTc_QcQs() {
    assertEquals(
      "KsTc 4h2h 5s6d QcQs Js8c",
      Solver.process("texas-holdem 2s6h8dAdJd 4h2h Js8c 5s6d KsTc QcQs"));
  }

  @Test
  public void test_texas_holdem_5913_2s5cJsKcKh_2d8d_Qc8c_7hTh() {
    assertEquals(
      "7hTh Qc8c 2d8d",
      Solver.process("texas-holdem 2s5cJsKcKh 2d8d Qc8c 7hTh"));
  }

  @Test
  public void test_texas_holdem_5914_4s7d8c9hJc_JhTd_3hTc_6d3c_QsAd_9s5h_2h9c_Ks2c() {
    assertEquals(
      "6d3c Ks2c QsAd 2h9c=9s5h 3hTc=JhTd",
      Solver.process("texas-holdem 4s7d8c9hJc JhTd 3hTc 6d3c QsAd 9s5h 2h9c Ks2c"));
  }

  @Test
  public void test_texas_holdem_5915_7h8dJsQdQs_AsTh_3c6c_8h6d_Qc2h_Td5c_4s6s() {
    assertEquals(
      "3c6c=4s6s Td5c AsTh 8h6d Qc2h",
      Solver.process("texas-holdem 7h8dJsQdQs AsTh 3c6c 8h6d Qc2h Td5c 4s6s"));
  }

  @Test
  public void test_texas_holdem_5916_5s9sJdKsTh_8d9c_7sTd_KhJc_Js5h_9dKc_4dKd_8hAs_AhQc_8sQh() {
    assertEquals(
      "8hAs 8d9c 7sTd 4dKd Js5h 9dKc KhJc 8sQh AhQc",
      Solver.process("texas-holdem 5s9sJdKsTh 8d9c 7sTd KhJc Js5h 9dKc 4dKd 8hAs AhQc 8sQh"));
  }

  @Test
  public void test_texas_holdem_5917_3h5hJdJsTs_6dJc_Ks8h_2cKc_KhQh() {
    assertEquals(
      "2cKc Ks8h KhQh 6dJc",
      Solver.process("texas-holdem 3h5hJdJsTs 6dJc Ks8h 2cKc KhQh"));
  }

  @Test
  public void test_texas_holdem_5918_2c6d7sJcKs_KcJh_5d4c_5s3s() {
    assertEquals(
      "5d4c=5s3s KcJh",
      Solver.process("texas-holdem 2c6d7sJcKs KcJh 5d4c 5s3s"));
  }

  @Test
  public void test_texas_holdem_5919_4s7h9dJhKh_5s4c_7s2s_TdJd_Jc8d_Th6h() {
    assertEquals(
      "5s4c 7s2s Jc8d TdJd Th6h",
      Solver.process("texas-holdem 4s7h9dJhKh 5s4c 7s2s TdJd Jc8d Th6h"));
  }

  @Test
  public void test_texas_holdem_5920_5d5h6s8c8d_5cQc_Kc2s() {
    assertEquals(
      "Kc2s 5cQc",
      Solver.process("texas-holdem 5d5h6s8c8d 5cQc Kc2s"));
  }

  @Test
  public void test_texas_holdem_5921_8c9dAsTdTs_Kh3h_4s7s_Jh4h_6sQh_4c2h() {
    assertEquals(
      "4c2h=4s7s Jh4h 6sQh Kh3h",
      Solver.process("texas-holdem 8c9dAsTdTs Kh3h 4s7s Jh4h 6sQh 4c2h"));
  }

  @Test
  public void test_texas_holdem_5922_2c2s4c7sAs_Td5s_3sTc_9h2h_Qh2d_QcQs() {
    assertEquals(
      "3sTc=Td5s QcQs 9h2h Qh2d",
      Solver.process("texas-holdem 2c2s4c7sAs Td5s 3sTc 9h2h Qh2d QcQs"));
  }

  @Test
  public void test_texas_holdem_5923_2d3cAhQdQs_As3d_9d7c_4c5s_5c5d_8cTs_Td9h() {
    assertEquals(
      "9d7c 8cTs Td9h 5c5d As3d 4c5s",
      Solver.process("texas-holdem 2d3cAhQdQs As3d 9d7c 4c5s 5c5d 8cTs Td9h"));
  }

  @Test
  public void test_texas_holdem_5924_5h6d9dAsTc_Ac3h_7dQd_7sQh_Ks4s_5s9s_Ad9h_2c4d_3c6c_7h6s() {
    assertEquals(
      "2c4d 7dQd=7sQh Ks4s 3c6c=7h6s Ac3h 5s9s Ad9h",
      Solver.process("texas-holdem 5h6d9dAsTc Ac3h 7dQd 7sQh Ks4s 5s9s Ad9h 2c4d 3c6c 7h6s"));
  }

  @Test
  public void test_texas_holdem_5925_2c5d5h9hTs_QdTh_9cKh() {
    assertEquals(
      "9cKh QdTh",
      Solver.process("texas-holdem 2c5d5h9hTs QdTh 9cKh"));
  }

  @Test
  public void test_texas_holdem_5926_2c2h2s3s6h_6c7s_AsKh_9h8d_4c2d_3d4s_TcJc_TdTh_3h9d_4h6s() {
    assertEquals(
      "9h8d TcJc AsKh 3d4s=3h9d 4h6s=6c7s TdTh 4c2d",
      Solver.process("texas-holdem 2c2h2s3s6h 6c7s AsKh 9h8d 4c2d 3d4s TcJc TdTh 3h9d 4h6s"));
  }

  @Test
  public void test_texas_holdem_5927_4d6d7h8s9c_5dAd_QsKc_Qc8h_3c9d_7cTs_Th2s() {
    assertEquals(
      "QsKc Qc8h 3c9d 5dAd 7cTs=Th2s",
      Solver.process("texas-holdem 4d6d7h8s9c 5dAd QsKc Qc8h 3c9d 7cTs Th2s"));
  }

  @Test
  public void test_texas_holdem_5928_3d5d6h8d9s_7s5c_5sQc_4s4h_2c3s() {
    assertEquals(
      "2c3s 4s4h 5sQc 7s5c",
      Solver.process("texas-holdem 3d5d6h8d9s 7s5c 5sQc 4s4h 2c3s"));
  }

  @Test
  public void test_texas_holdem_5929_3d4c4d9cQs_9dTd_AcTs_3c8c_2h5c_7dJh_Tc7c_7h6h() {
    assertEquals(
      "2h5c 7h6h Tc7c 7dJh AcTs 3c8c 9dTd",
      Solver.process("texas-holdem 3d4c4d9cQs 9dTd AcTs 3c8c 2h5c 7dJh Tc7c 7h6h"));
  }

  @Test
  public void test_texas_holdem_5930_2h4d8sAhAs_Jh7s_2s4h_Td9c_6dJc_3h7h() {
    assertEquals(
      "3h7h Td9c 6dJc Jh7s 2s4h",
      Solver.process("texas-holdem 2h4d8sAhAs Jh7s 2s4h Td9c 6dJc 3h7h"));
  }

  @Test
  public void test_texas_holdem_5931_4d8sJsThTs_7c6d_4s2d_AdQh_Qd3d_9c3s() {
    assertEquals(
      "7c6d 9c3s Qd3d AdQh 4s2d",
      Solver.process("texas-holdem 4d8sJsThTs 7c6d 4s2d AdQh Qd3d 9c3s"));
  }

  @Test
  public void test_texas_holdem_5932_2c2h9c9hAh_3c5c_Tc6c_Qd2d_Ks5s_Ts6s_JsQs_8c2s() {
    assertEquals(
      "3c5c=JsQs=Ks5s=Tc6c=Ts6s 8c2s=Qd2d",
      Solver.process("texas-holdem 2c2h9c9hAh 3c5c Tc6c Qd2d Ks5s Ts6s JsQs 8c2s"));
  }

  @Test
  public void test_texas_holdem_5933_2d3d4c4h6c_6dKd_Qh7s_9cTc_2s4d_Qs2c_8sAc() {
    assertEquals(
      "9cTc Qh7s 8sAc Qs2c 6dKd 2s4d",
      Solver.process("texas-holdem 2d3d4c4h6c 6dKd Qh7s 9cTc 2s4d Qs2c 8sAc"));
  }

  @Test
  public void test_texas_holdem_5934_9hAhAsJcJd_Ks7h_8cJh_3d4h_7s7c_Qh3s() {
    assertEquals(
      "3d4h=7s7c Qh3s Ks7h 8cJh",
      Solver.process("texas-holdem 9hAhAsJcJd Ks7h 8cJh 3d4h 7s7c Qh3s"));
  }

  @Test
  public void test_texas_holdem_5935_7d8s9hQhTh_9d3s_6s3h_4s4d_3d7c() {
    assertEquals(
      "4s4d 3d7c 9d3s 6s3h",
      Solver.process("texas-holdem 7d8s9hQhTh 9d3s 6s3h 4s4d 3d7c"));
  }

  @Test
  public void test_texas_holdem_5936_3h5sAdJhKd_KhJs_Td4h_Tc9c_Kc4d_4s2c() {
    assertEquals(
      "Td4h Tc9c Kc4d KhJs 4s2c",
      Solver.process("texas-holdem 3h5sAdJhKd KhJs Td4h Tc9c Kc4d 4s2c"));
  }

  @Test
  public void test_texas_holdem_5937_3d4d5c8dAs_Qd9c_5sKs() {
    assertEquals(
      "Qd9c 5sKs",
      Solver.process("texas-holdem 3d4d5c8dAs Qd9c 5sKs"));
  }

  @Test
  public void test_texas_holdem_5938_3s5d7s8cQs_3c5s_Kc9d_Jh6h_AcJs_As7h() {
    assertEquals(
      "Jh6h Kc9d AcJs As7h 3c5s",
      Solver.process("texas-holdem 3s5d7s8cQs 3c5s Kc9d Jh6h AcJs As7h"));
  }

  @Test
  public void test_texas_holdem_5939_3s4dJcKdTd_7sKs_8dKh_5d4h() {
    assertEquals(
      "5d4h 7sKs 8dKh",
      Solver.process("texas-holdem 3s4dJcKdTd 7sKs 8dKh 5d4h"));
  }

  @Test
  public void test_texas_holdem_5940_3c6c8sKcQh_5s4h_3s9s_9h5c_5dAc_4d3d_2sJc_7s7c_2dKd() {
    assertEquals(
      "5s4h 9h5c 2sJc 5dAc 4d3d 3s9s 7s7c 2dKd",
      Solver.process("texas-holdem 3c6c8sKcQh 5s4h 3s9s 9h5c 5dAc 4d3d 2sJc 7s7c 2dKd"));
  }

  @Test
  public void test_texas_holdem_5941_2c4hKcKdTh_6cTs_4dJc_6d5h_3c2d_TcKh_Jd4c_Ks9d() {
    assertEquals(
      "6d5h 3c2d 4dJc=Jd4c 6cTs Ks9d TcKh",
      Solver.process("texas-holdem 2c4hKcKdTh 6cTs 4dJc 6d5h 3c2d TcKh Jd4c Ks9d"));
  }

  @Test
  public void test_texas_holdem_5942_2d4c6s8hKd_6cAs_2c7c_Jc8d() {
    assertEquals(
      "2c7c 6cAs Jc8d",
      Solver.process("texas-holdem 2d4c6s8hKd 6cAs 2c7c Jc8d"));
  }

  @Test
  public void test_texas_holdem_5943_2c4c5d6s8c_Td8d_3dJs_9cQc_8s9s_Jc2h_7d6d_Qd2d() {
    assertEquals(
      "Jc2h Qd2d 8s9s Td8d 3dJs 7d6d 9cQc",
      Solver.process("texas-holdem 2c4c5d6s8c Td8d 3dJs 9cQc 8s9s Jc2h 7d6d Qd2d"));
  }

  @Test
  public void test_texas_holdem_5944_2s5s6h7cQc_Ks4d_2hAd_3sTd_6c4h_4cKc_Th7d_Qd9d() {
    assertEquals(
      "3sTd 4cKc=Ks4d 2hAd 6c4h Th7d Qd9d",
      Solver.process("texas-holdem 2s5s6h7cQc Ks4d 2hAd 3sTd 6c4h 4cKc Th7d Qd9d"));
  }

  @Test
  public void test_texas_holdem_5945_3c6h7dKhTd_QhTs_Jc3d_As5d_9s4s_6d5s_4c2s() {
    assertEquals(
      "4c2s 9s4s As5d Jc3d 6d5s QhTs",
      Solver.process("texas-holdem 3c6h7dKhTd QhTs Jc3d As5d 9s4s 6d5s 4c2s"));
  }

  @Test
  public void test_texas_holdem_5946_2d3h4s6h9s_Qs5h_JdTs() {
    assertEquals(
      "JdTs Qs5h",
      Solver.process("texas-holdem 2d3h4s6h9s Qs5h JdTs"));
  }

  @Test
  public void test_texas_holdem_5947_2c2d3s5c8h_9sTd_5d8d_6sKd_7s7c_Qh5h_Jh4d_2s6h_KhTh() {
    assertEquals(
      "9sTd Jh4d 6sKd KhTh Qh5h 7s7c 5d8d 2s6h",
      Solver.process("texas-holdem 2c2d3s5c8h 9sTd 5d8d 6sKd 7s7c Qh5h Jh4d 2s6h KhTh"));
  }

  @Test
  public void test_texas_holdem_5948_4s5c7sAcKh_3s9s_2c9c_Tc3d_5sJs() {
    assertEquals(
      "2c9c=3s9s Tc3d 5sJs",
      Solver.process("texas-holdem 4s5c7sAcKh 3s9s 2c9c Tc3d 5sJs"));
  }

  @Test
  public void test_texas_holdem_5949_6hJcKcQdTd_Ks6s_9d4d_7c2d() {
    assertEquals(
      "7c2d Ks6s 9d4d",
      Solver.process("texas-holdem 6hJcKcQdTd Ks6s 9d4d 7c2d"));
  }

  @Test
  public void test_texas_holdem_5950_2d5d6h7hJd_6d4d_KhTd() {
    assertEquals(
      "KhTd 6d4d",
      Solver.process("texas-holdem 2d5d6h7hJd 6d4d KhTd"));
  }

  @Test
  public void test_texas_holdem_5951_4d7dJhKhQc_6c4h_JsJd_6dTc() {
    assertEquals(
      "6dTc 6c4h JsJd",
      Solver.process("texas-holdem 4d7dJhKhQc 6c4h JsJd 6dTc"));
  }

  @Test
  public void test_texas_holdem_5952_8c9dAhJsKd_6c2d_QcTc_2cQd_3d3h() {
    assertEquals(
      "6c2d 2cQd 3d3h QcTc",
      Solver.process("texas-holdem 8c9dAhJsKd 6c2d QcTc 2cQd 3d3h"));
  }

  @Test
  public void test_texas_holdem_5953_2c8s9c9sAc_8dTs_6s6h_2h5h_7cKd_2dQs_QdJs() {
    assertEquals(
      "QdJs 7cKd 2dQs=2h5h 6s6h 8dTs",
      Solver.process("texas-holdem 2c8s9c9sAc 8dTs 6s6h 2h5h 7cKd 2dQs QdJs"));
  }

  @Test
  public void test_texas_holdem_5954_2s4d7sJdTh_3cJs_8dAc_Tc4s_TsQs_KhQc_Jc3d_2dAd_8cQd_6h2c() {
    assertEquals(
      "8cQd KhQc 8dAc 6h2c 2dAd TsQs 3cJs=Jc3d Tc4s",
      Solver.process("texas-holdem 2s4d7sJdTh 3cJs 8dAc Tc4s TsQs KhQc Jc3d 2dAd 8cQd 6h2c"));
  }

  @Test
  public void test_texas_holdem_5955_2d7h8cAcJd_5d7d_5c6s_2s8h_9h5s_2h9d_KcAs() {
    assertEquals(
      "5c6s 9h5s 2h9d 5d7d KcAs 2s8h",
      Solver.process("texas-holdem 2d7h8cAcJd 5d7d 5c6s 2s8h 9h5s 2h9d KcAs"));
  }

  @Test
  public void test_texas_holdem_5956_2s6c7cAsQd_4sTd_6h9c_8d3h_Ts5d_8s7h_8cQc_5sTh_Qh4d_AdAh() {
    assertEquals(
      "8d3h 4sTd=5sTh=Ts5d 6h9c 8s7h Qh4d 8cQc AdAh",
      Solver.process("texas-holdem 2s6c7cAsQd 4sTd 6h9c 8d3h Ts5d 8s7h 8cQc 5sTh Qh4d AdAh"));
  }

  @Test
  public void test_texas_holdem_5957_5c6s9cJsTh_6c5d_7d3c_6hJh_Ah8c() {
    assertEquals(
      "7d3c Ah8c 6c5d 6hJh",
      Solver.process("texas-holdem 5c6s9cJsTh 6c5d 7d3c 6hJh Ah8c"));
  }

  @Test
  public void test_texas_holdem_5958_2c6d7h9sJh_2s4d_KcQh_9c6c_Jd7s_Ad7c() {
    assertEquals(
      "KcQh 2s4d Ad7c 9c6c Jd7s",
      Solver.process("texas-holdem 2c6d7h9sJh 2s4d KcQh 9c6c Jd7s Ad7c"));
  }

  @Test
  public void test_texas_holdem_5959_2d4c6c7hQs_6sJh_8hAs_3hAc_7c8c_KsQh_4d4s_Qd5h() {
    assertEquals(
      "3hAc 8hAs 6sJh 7c8c Qd5h KsQh 4d4s",
      Solver.process("texas-holdem 2d4c6c7hQs 6sJh 8hAs 3hAc 7c8c KsQh 4d4s Qd5h"));
  }

  @Test
  public void test_texas_holdem_5960_7d8sJcJsTc_8c9s_7sQh_4d9c_4h6c_Qc5h_Qs4s_As7c_Th9d_4c9h() {
    assertEquals(
      "4h6c Qc5h=Qs4s 7sQh As7c 4c9h=4d9c=8c9s=Th9d",
      Solver.process("texas-holdem 7d8sJcJsTc 8c9s 7sQh 4d9c 4h6c Qc5h Qs4s As7c Th9d 4c9h"));
  }

  @Test
  public void test_texas_holdem_5961_2d2s5hAdKc_3dTs_9d7c_5sKs_4h2h_KdAh_Qd8c_9h5c_2c7h() {
    assertEquals(
      "9d7c 3dTs Qd8c 9h5c 5sKs KdAh 2c7h=4h2h",
      Solver.process("texas-holdem 2d2s5hAdKc 3dTs 9d7c 5sKs 4h2h KdAh Qd8c 9h5c 2c7h"));
  }

  @Test
  public void test_texas_holdem_5962_3d7cAcAsJh_9s5d_6h7h_6cTs_9d3h_3cKs_Qs2h_Kh7s_5s9h_Js4c() {
    assertEquals(
      "5s9h=9s5d 6cTs Qs2h 9d3h 3cKs 6h7h Kh7s Js4c",
      Solver.process("texas-holdem 3d7cAcAsJh 9s5d 6h7h 6cTs 9d3h 3cKs Qs2h Kh7s 5s9h Js4c"));
  }

  @Test
  public void test_texas_holdem_5963_2s7d9cJcQs_3sKs_Th5d_2hQc_Jh4s_7s8h_3dKd() {
    assertEquals(
      "Th5d 3dKd=3sKs 7s8h Jh4s 2hQc",
      Solver.process("texas-holdem 2s7d9cJcQs 3sKs Th5d 2hQc Jh4s 7s8h 3dKd"));
  }

  @Test
  public void test_texas_holdem_5964_4d5c5sAdJh_7cKh_2hQh_Ts9c_2s6c_QdTc_3s4c_Ah3c() {
    assertEquals(
      "2s6c Ts9c 2hQh=QdTc 7cKh 3s4c Ah3c",
      Solver.process("texas-holdem 4d5c5sAdJh 7cKh 2hQh Ts9c 2s6c QdTc 3s4c Ah3c"));
  }

  @Test
  public void test_texas_holdem_5965_2c8h9dQdTh_7sAh_6sTc() {
    assertEquals(
      "7sAh 6sTc",
      Solver.process("texas-holdem 2c8h9dQdTh 7sAh 6sTc"));
  }

  @Test
  public void test_texas_holdem_5966_3d5d5sKsQd_7sTh_AhKd_3cJd_8c2s() {
    assertEquals(
      "8c2s 7sTh 3cJd AhKd",
      Solver.process("texas-holdem 3d5d5sKsQd 7sTh AhKd 3cJd 8c2s"));
  }

  @Test
  public void test_texas_holdem_5967_2c9sAdJsKh_8s9c_4d6h_7h4c_2dJd_QhAc_9d8d_QcJh() {
    assertEquals(
      "4d6h 7h4c 8s9c=9d8d QcJh QhAc 2dJd",
      Solver.process("texas-holdem 2c9sAdJsKh 8s9c 4d6h 7h4c 2dJd QhAc 9d8d QcJh"));
  }

  @Test
  public void test_texas_holdem_5968_3d6s7s9cTs_Ac4s_KdJs_3h5s() {
    assertEquals(
      "KdJs Ac4s 3h5s",
      Solver.process("texas-holdem 3d6s7s9cTs Ac4s KdJs 3h5s"));
  }

  @Test
  public void test_texas_holdem_5969_3c5sJdKcQh_ThAh_8d9s_9cQc_2d6d_3d4d_6hTc() {
    assertEquals(
      "2d6d 8d9s 6hTc 3d4d 9cQc ThAh",
      Solver.process("texas-holdem 3c5sJdKcQh ThAh 8d9s 9cQc 2d6d 3d4d 6hTc"));
  }

  @Test
  public void test_texas_holdem_5970_2s3c7c9sJh_7hQc_5s6d_ThKd_8d4c_9h2d() {
    assertEquals(
      "5s6d 8d4c ThKd 7hQc 9h2d",
      Solver.process("texas-holdem 2s3c7c9sJh 7hQc 5s6d ThKd 8d4c 9h2d"));
  }

  @Test
  public void test_texas_holdem_5971_5h6c7cQhTs_Qs4d_Qc9s_4s6s_Th9h() {
    assertEquals(
      "4s6s Th9h Qs4d Qc9s",
      Solver.process("texas-holdem 5h6c7cQhTs Qs4d Qc9s 4s6s Th9h"));
  }

  @Test
  public void test_texas_holdem_5972_5c5hJhQsTc_3s3c_Jd6d_4d4c_JcTh_3d9h_QhKc_Ad5s_9cQd_9s4s() {
    assertEquals(
      "3d9h=9s4s 3s3c 4d4c Jd6d JcTh 9cQd QhKc Ad5s",
      Solver.process("texas-holdem 5c5hJhQsTc 3s3c Jd6d 4d4c JcTh 3d9h QhKc Ad5s 9cQd 9s4s"));
  }

  @Test
  public void test_texas_holdem_5973_4s7s8dAhJc_7c8h_6s9d() {
    assertEquals(
      "6s9d 7c8h",
      Solver.process("texas-holdem 4s7s8dAhJc 7c8h 6s9d"));
  }

  @Test
  public void test_texas_holdem_5974_3d7d8dJdJh_5cQc_ThAd_Kc3h_Ah8c() {
    assertEquals(
      "5cQc Kc3h Ah8c ThAd",
      Solver.process("texas-holdem 3d7d8dJdJh 5cQc ThAd Kc3h Ah8c"));
  }

  @Test
  public void test_texas_holdem_5975_2d3c5cJsKh_7sJc_Ts8c_Qs2c_KdTh_Td3d_6s6h_3h8d() {
    assertEquals(
      "Ts8c Qs2c 3h8d Td3d 6s6h 7sJc KdTh",
      Solver.process("texas-holdem 2d3c5cJsKh 7sJc Ts8c Qs2c KdTh Td3d 6s6h 3h8d"));
  }

  @Test
  public void test_texas_holdem_5976_4h8c9sAsKc_TcKs_5sTd_4c5h_Jd7s_3sJc_3d6s_6h8s_2cJs_7c8d() {
    assertEquals(
      "3d6s 5sTd 2cJs=3sJc=Jd7s 4c5h 6h8s=7c8d TcKs",
      Solver.process("texas-holdem 4h8c9sAsKc TcKs 5sTd 4c5h Jd7s 3sJc 3d6s 6h8s 2cJs 7c8d"));
  }

  @Test
  public void test_texas_holdem_5977_6d8c8d8sKs_Kh2h_8hAc_TcAh() {
    assertEquals(
      "TcAh Kh2h 8hAc",
      Solver.process("texas-holdem 6d8c8d8sKs Kh2h 8hAc TcAh"));
  }

  @Test
  public void test_texas_holdem_5978_7c8cAcAdKh_2s5c_Qs4d_7sQh() {
    assertEquals(
      "2s5c Qs4d 7sQh",
      Solver.process("texas-holdem 7c8cAcAdKh 2s5c Qs4d 7sQh"));
  }

  @Test
  public void test_texas_holdem_5979_2d4c6sQcTc_Jh3d_5d7h_9d9h_7dJc_AcJs() {
    assertEquals(
      "5d7h Jh3d 7dJc AcJs 9d9h",
      Solver.process("texas-holdem 2d4c6sQcTc Jh3d 5d7h 9d9h 7dJc AcJs"));
  }

  @Test
  public void test_texas_holdem_5980_3s5h7d9cTh_QsTs_JdTd_Jh8c_8hJc_5sKc_4hAc_8s7h() {
    assertEquals(
      "4hAc 5sKc 8s7h JdTd QsTs 8hJc=Jh8c",
      Solver.process("texas-holdem 3s5h7d9cTh QsTs JdTd Jh8c 8hJc 5sKc 4hAc 8s7h"));
  }

  @Test
  public void test_texas_holdem_5981_2s5s8dAcKs_9d6h_QdTh_7dJd_Ad6d_KdJc() {
    assertEquals(
      "9d6h 7dJd QdTh KdJc Ad6d",
      Solver.process("texas-holdem 2s5s8dAcKs 9d6h QdTh 7dJd Ad6d KdJc"));
  }

  @Test
  public void test_texas_holdem_5982_2d4s6h8dJs_3sAc_QcKd() {
    assertEquals(
      "QcKd 3sAc",
      Solver.process("texas-holdem 2d4s6h8dJs 3sAc QcKd"));
  }

  @Test
  public void test_texas_holdem_5983_5s6d7d7sJh_7h2h_JcQc_4sKd_TdAh_Kh8d_4c3h_4h6c_5dKs_6sQh() {
    assertEquals(
      "4sKd Kh8d TdAh 5dKs 4h6c 6sQh JcQc 7h2h 4c3h",
      Solver.process("texas-holdem 5s6d7d7sJh 7h2h JcQc 4sKd TdAh Kh8d 4c3h 4h6c 5dKs 6sQh"));
  }

  @Test
  public void test_texas_holdem_5984_2s3c3s4dKd_9h6d_9s5h_QdTd() {
    assertEquals(
      "9s5h 9h6d QdTd",
      Solver.process("texas-holdem 2s3c3s4dKd 9h6d 9s5h QdTd"));
  }

  @Test
  public void test_texas_holdem_5985_3h4d5sAcJs_2s2h_4sKd_5h7d() {
    assertEquals(
      "4sKd 5h7d 2s2h",
      Solver.process("texas-holdem 3h4d5sAcJs 2s2h 4sKd 5h7d"));
  }

  @Test
  public void test_texas_holdem_5986_2c4c6hJdQh_2sKc_3dAs_9dJc_8hTd_AhTs_3h3s() {
    assertEquals(
      "8hTd 3dAs AhTs 2sKc 3h3s 9dJc",
      Solver.process("texas-holdem 2c4c6hJdQh 2sKc 3dAs 9dJc 8hTd AhTs 3h3s"));
  }

  @Test
  public void test_texas_holdem_5987_3d3s4sJdKs_As7c_9d9c_Qd4h() {
    assertEquals(
      "As7c Qd4h 9d9c",
      Solver.process("texas-holdem 3d3s4sJdKs As7c 9d9c Qd4h"));
  }

  @Test
  public void test_texas_holdem_5988_2h6c6h8s9s_8h9h_KsJh_QsJs_8d3c() {
    assertEquals(
      "QsJs KsJh 8d3c 8h9h",
      Solver.process("texas-holdem 2h6c6h8s9s 8h9h KsJh QsJs 8d3c"));
  }

  @Test
  public void test_texas_holdem_5989_2c3d4sJcQs_2s3s_2d6d() {
    assertEquals(
      "2d6d 2s3s",
      Solver.process("texas-holdem 2c3d4sJcQs 2s3s 2d6d"));
  }

  @Test
  public void test_texas_holdem_5990_6d7dJcQcTc_Qs3h_4hAc_6h8d_3cTd_QdKh_4s3d() {
    assertEquals(
      "4s3d 4hAc 6h8d 3cTd Qs3h QdKh",
      Solver.process("texas-holdem 6d7dJcQcTc Qs3h 4hAc 6h8d 3cTd QdKh 4s3d"));
  }

  @Test
  public void test_texas_holdem_5991_5d7s8dKsQc_2s5c_6c3s_As8s() {
    assertEquals(
      "6c3s 2s5c As8s",
      Solver.process("texas-holdem 5d7s8dKsQc 2s5c 6c3s As8s"));
  }

  @Test
  public void test_texas_holdem_5992_3h4h5dAdKc_6s9s_TcJc_Ts3c_QdAs_AhKs_Jd6d() {
    assertEquals(
      "6s9s Jd6d TcJc Ts3c QdAs AhKs",
      Solver.process("texas-holdem 3h4h5dAdKc 6s9s TcJc Ts3c QdAs AhKs Jd6d"));
  }

  @Test
  public void test_texas_holdem_5993_3c7c8s9dTh_3h4d_8h7h() {
    assertEquals(
      "3h4d 8h7h",
      Solver.process("texas-holdem 3c7c8s9dTh 3h4d 8h7h"));
  }

  @Test
  public void test_texas_holdem_5994_7h8sJcThTs_6cQc_AcJh_QsAd_Tc9d() {
    assertEquals(
      "6cQc QsAd AcJh Tc9d",
      Solver.process("texas-holdem 7h8sJcThTs 6cQc AcJh QsAd Tc9d"));
  }

  @Test
  public void test_texas_holdem_5995_JsQcTcThTs_Ah7d_8dKc_5cKh_3sQd_4s5d_JhAs_8c5h_5s3d() {
    assertEquals(
      "4s5d=5s3d=8c5h 5cKh=8dKc Ah7d JhAs 3sQd",
      Solver.process("texas-holdem JsQcTcThTs Ah7d 8dKc 5cKh 3sQd 4s5d JhAs 8c5h 5s3d"));
  }

  @Test
  public void test_texas_holdem_5996_2h4h5h7d9d_6h3h_8cQh_2d6s_5s8h_Ks7c_6dQd_Jc5d_2cKh_3cAs() {
    assertEquals(
      "6dQd 8cQh 2d6s 2cKh 5s8h Jc5d Ks7c 3cAs 6h3h",
      Solver.process("texas-holdem 2h4h5h7d9d 6h3h 8cQh 2d6s 5s8h Ks7c 6dQd Jc5d 2cKh 3cAs"));
  }

  @Test
  public void test_texas_holdem_5997_4h6h9sKhQs_Ts8d_4s5h_2d7h_2c3h_3s5d_2hAh() {
    assertEquals(
      "2c3h 3s5d 2d7h Ts8d 4s5h 2hAh",
      Solver.process("texas-holdem 4h6h9sKhQs Ts8d 4s5h 2d7h 2c3h 3s5d 2hAh"));
  }

  @Test
  public void test_texas_holdem_5998_2s3d4s7c8h_Tc9h_Qd7s_7h8c() {
    assertEquals(
      "Tc9h Qd7s 7h8c",
      Solver.process("texas-holdem 2s3d4s7c8h Tc9h Qd7s 7h8c"));
  }

  @Test
  public void test_texas_holdem_5999_2d8h9cJsTh_7c2c_As8d_4hTd_9s6c_QdAd_Tc4s_9hKh() {
    assertEquals(
      "As8d 9s6c 9hKh 4hTd=Tc4s 7c2c QdAd",
      Solver.process("texas-holdem 2d8h9cJsTh 7c2c As8d 4hTd 9s6c QdAd Tc4s 9hKh"));
  }

}
