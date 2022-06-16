
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver9HiddenTest {


  @Test
  public void test_texas_holdem_2250_4d8sKdQcTs_4sQh_9h5s_6s7h_2c3d_Js3h_Jd5d_6c4h() {
    assertEquals(
      "2c3d 6s7h 9h5s Jd5d=Js3h 6c4h 4sQh",
      Solver.process("texas-holdem 4d8sKdQcTs 4sQh 9h5s 6s7h 2c3d Js3h Jd5d 6c4h"));
  }

  @Test
  public void test_texas_holdem_2251_2h8d9cAhTd_5h6d_3cKh_6hKd_3d2c_Ac7d_9hQd_8s9d_KcTh_Qh6s() {
    assertEquals(
      "5h6d Qh6s 3cKh=6hKd 3d2c 9hQd KcTh Ac7d 8s9d",
      Solver.process("texas-holdem 2h8d9cAhTd 5h6d 3cKh 6hKd 3d2c Ac7d 9hQd 8s9d KcTh Qh6s"));
  }

  @Test
  public void test_texas_holdem_2252_2h2s3h6dJh_4s7c_Qh4h_2dKd_5d6h_QsKs() {
    assertEquals(
      "4s7c QsKs 5d6h 2dKd Qh4h",
      Solver.process("texas-holdem 2h2s3h6dJh 4s7c Qh4h 2dKd 5d6h QsKs"));
  }

  @Test
  public void test_texas_holdem_2253_6h9dAcAsQs_7hQc_8d8h_3c4c_6dQd_ThAh_5d5s() {
    assertEquals(
      "3c4c 5d5s 8d8h 6dQd=7hQc ThAh",
      Solver.process("texas-holdem 6h9dAcAsQs 7hQc 8d8h 3c4c 6dQd ThAh 5d5s"));
  }

  @Test
  public void test_texas_holdem_2254_5d6h7dAdKs_QhJs_As7h_Jh4c_9d2d_9sQd() {
    assertEquals(
      "Jh4c 9sQd QhJs As7h 9d2d",
      Solver.process("texas-holdem 5d6h7dAdKs QhJs As7h Jh4c 9d2d 9sQd"));
  }

  @Test
  public void test_texas_holdem_2255_8s9dAhKdQd_QhKs_2c7c_5hJc_9s7h() {
    assertEquals(
      "2c7c 5hJc 9s7h QhKs",
      Solver.process("texas-holdem 8s9dAhKdQd QhKs 2c7c 5hJc 9s7h"));
  }

  @Test
  public void test_texas_holdem_2256_6h6s9cAsJh_4d3c_8dQc_5hKd_Qs3h_7d4h_Ah7h() {
    assertEquals(
      "4d3c=7d4h 8dQc=Qs3h 5hKd Ah7h",
      Solver.process("texas-holdem 6h6s9cAsJh 4d3c 8dQc 5hKd Qs3h 7d4h Ah7h"));
  }

  @Test
  public void test_texas_holdem_2257_6s9sQdTdTh_2h7c_Kd3c() {
    assertEquals(
      "2h7c Kd3c",
      Solver.process("texas-holdem 6s9sQdTdTh 2h7c Kd3c"));
  }

  @Test
  public void test_texas_holdem_2258_8hJdJsKcKh_5s3c_9h9c_JhTc_8d2c_Th3s_6cJc() {
    assertEquals(
      "5s3c=8d2c 9h9c Th3s 6cJc=JhTc",
      Solver.process("texas-holdem 8hJdJsKcKh 5s3c 9h9c JhTc 8d2c Th3s 6cJc"));
  }

  @Test
  public void test_texas_holdem_2259_4c5sAcJdJs_2s5c_Th8s_QdQh() {
    assertEquals(
      "Th8s 2s5c QdQh",
      Solver.process("texas-holdem 4c5sAcJdJs 2s5c Th8s QdQh"));
  }

  @Test
  public void test_texas_holdem_2260_3c3d9sAcKd_7c7d_Qh5h_3s4s_Jd9d() {
    assertEquals(
      "Qh5h 7c7d Jd9d 3s4s",
      Solver.process("texas-holdem 3c3d9sAcKd 7c7d Qh5h 3s4s Jd9d"));
  }

  @Test
  public void test_texas_holdem_2261_3h4s6cAhQs_2cKh_5d5s_2h3d_7cQh_5cKs_QcJh() {
    assertEquals(
      "2cKh 5cKs 2h3d 5d5s 7cQh QcJh",
      Solver.process("texas-holdem 3h4s6cAhQs 2cKh 5d5s 2h3d 7cQh 5cKs QcJh"));
  }

  @Test
  public void test_texas_holdem_2262_2h3s4d5cTh_6hAc_8s9h_7h5h_9s6s() {
    assertEquals(
      "8s9h 7h5h 6hAc=9s6s",
      Solver.process("texas-holdem 2h3s4d5cTh 6hAc 8s9h 7h5h 9s6s"));
  }

  @Test
  public void test_texas_holdem_2263_3s5s9dAdJh_9hQd_8s3c_9s4c_Qc2d_4s4d() {
    assertEquals(
      "Qc2d 8s3c 4s4d 9s4c 9hQd",
      Solver.process("texas-holdem 3s5s9dAdJh 9hQd 8s3c 9s4c Qc2d 4s4d"));
  }

  @Test
  public void test_texas_holdem_2264_2s5dAhJcKd_Ac5s_7dTs_QcTh_6c6s() {
    assertEquals(
      "7dTs 6c6s Ac5s QcTh",
      Solver.process("texas-holdem 2s5dAhJcKd Ac5s 7dTs QcTh 6c6s"));
  }

  @Test
  public void test_texas_holdem_2265_3h5h8d8sQc_9d3c_6cQs_8hQd_JhJc_Tc6d_4s2h() {
    assertEquals(
      "4s2h Tc6d 9d3c JhJc 6cQs 8hQd",
      Solver.process("texas-holdem 3h5h8d8sQc 9d3c 6cQs 8hQd JhJc Tc6d 4s2h"));
  }

  @Test
  public void test_texas_holdem_2266_5c6c9hQdQs_7s4s_3hTs_5dJd() {
    assertEquals(
      "7s4s 3hTs 5dJd",
      Solver.process("texas-holdem 5c6c9hQdQs 7s4s 3hTs 5dJd"));
  }

  @Test
  public void test_texas_holdem_2267_2s7h8h8sQc_Td8d_As4h_Th3d_Ah5s_9s5c_6dKh_2dJh() {
    assertEquals(
      "9s5c Th3d 6dKh Ah5s=As4h 2dJh Td8d",
      Solver.process("texas-holdem 2s7h8h8sQc Td8d As4h Th3d Ah5s 9s5c 6dKh 2dJh"));
  }

  @Test
  public void test_texas_holdem_2268_5s8hAsQcQd_Js7d_3hKd_Ad9h_7hJc_4s6c_Ts2s_2c8c_9cTd() {
    assertEquals(
      "4s6c Ts2s 9cTd 7hJc=Js7d 3hKd 2c8c Ad9h",
      Solver.process("texas-holdem 5s8hAsQcQd Js7d 3hKd Ad9h 7hJc 4s6c Ts2s 2c8c 9cTd"));
  }

  @Test
  public void test_texas_holdem_2269_2h4h5s6dAh_3d6h_2s6s_7cJs_8c2d_Ks8s() {
    assertEquals(
      "7cJs Ks8s 8c2d 2s6s 3d6h",
      Solver.process("texas-holdem 2h4h5s6dAh 3d6h 2s6s 7cJs 8c2d Ks8s"));
  }

  @Test
  public void test_texas_holdem_2270_3s4hJcJsTc_7d7c_Kc5d_Ks6d_Th3c_JdQs() {
    assertEquals(
      "Kc5d Ks6d 7d7c Th3c JdQs",
      Solver.process("texas-holdem 3s4hJcJsTc 7d7c Kc5d Ks6d Th3c JdQs"));
  }

  @Test
  public void test_texas_holdem_2271_2c4d5cQcQs_5d2h_8s2d() {
    assertEquals(
      "8s2d 5d2h",
      Solver.process("texas-holdem 2c4d5cQcQs 5d2h 8s2d"));
  }

  @Test
  public void test_texas_holdem_2272_2c3d4cJcJs_5c2h_4d8d_9dAh_6d7s_Kc7c_Qc8s_Kh2s_4s2d() {
    assertEquals(
      "6d7s Qc8s 9dAh 5c2h Kh2s 4s2d 4d8d Kc7c",
      Solver.process("texas-holdem 2c3d4cJcJs 5c2h 4d8d 9dAh 6d7s Kc7c Qc8s Kh2s 4s2d"));
  }

  @Test
  public void test_texas_holdem_2273_6s7h8dJdKc_QsTs_JsQh_3c6h_5h6d_5s2s_Kh4h_6c4c() {
    assertEquals(
      "5s2s QsTs 3c6h=5h6d=6c4c JsQh Kh4h",
      Solver.process("texas-holdem 6s7h8dJdKc QsTs JsQh 3c6h 5h6d 5s2s Kh4h 6c4c"));
  }

  @Test
  public void test_texas_holdem_2274_5cAcAdAhJs_KhKd_7h5s_9cKs_3s2c_2h6d_7sJc() {
    assertEquals(
      "3s2c 2h6d 9cKs 7h5s 7sJc KhKd",
      Solver.process("texas-holdem 5cAcAdAhJs KhKd 7h5s 9cKs 3s2c 2h6d 7sJc"));
  }

  @Test
  public void test_texas_holdem_2275_5s7d9c9sQd_9h7h_Ts4c_QcAd() {
    assertEquals(
      "Ts4c QcAd 9h7h",
      Solver.process("texas-holdem 5s7d9c9sQd 9h7h Ts4c QcAd"));
  }

  @Test
  public void test_texas_holdem_2276_5d5h6c8h9d_3d2s_2cKd_3hQh_QsJc_Kh7c_As8s() {
    assertEquals(
      "3d2s 3hQh QsJc 2cKd As8s Kh7c",
      Solver.process("texas-holdem 5d5h6c8h9d 3d2s 2cKd 3hQh QsJc Kh7c As8s"));
  }

  @Test
  public void test_texas_holdem_2277_5d5s6s8cTs_TdJc_9h7s_Ks3d_2s5h() {
    assertEquals(
      "Ks3d TdJc 2s5h 9h7s",
      Solver.process("texas-holdem 5d5s6s8cTs TdJc 9h7s Ks3d 2s5h"));
  }

  @Test
  public void test_texas_holdem_2278_6c6dJhKdQs_Ts9d_Js5s_5hQh_Ah4s_Tc8h_As3c_2hTd_6s8c() {
    assertEquals(
      "2hTd=Tc8h Ah4s=As3c Js5s 5hQh 6s8c Ts9d",
      Solver.process("texas-holdem 6c6dJhKdQs Ts9d Js5s 5hQh Ah4s Tc8h As3c 2hTd 6s8c"));
  }

  @Test
  public void test_texas_holdem_2279_4s7sAsJdQc_4dJc_3d5h_6s2c_Ac2d() {
    assertEquals(
      "3d5h 6s2c Ac2d 4dJc",
      Solver.process("texas-holdem 4s7sAsJdQc 4dJc 3d5h 6s2c Ac2d"));
  }

  @Test
  public void test_texas_holdem_2280_4d7d7hKhQc_6s5c_2d8h_4h5s_Kd3c() {
    assertEquals(
      "6s5c 2d8h 4h5s Kd3c",
      Solver.process("texas-holdem 4d7d7hKhQc 6s5c 2d8h 4h5s Kd3c"));
  }

  @Test
  public void test_texas_holdem_2281_7c7d8dAhJs_Th6c_5cQs_7hJc_5hKc() {
    assertEquals(
      "Th6c 5cQs 5hKc 7hJc",
      Solver.process("texas-holdem 7c7d8dAhJs Th6c 5cQs 7hJc 5hKc"));
  }

  @Test
  public void test_texas_holdem_2282_3h3s4d6c7c_Kc5d_9cAs_Ks9d_9sQs_8s6h_JhJd_Ac6s_6d4h() {
    assertEquals(
      "9sQs Ks9d 9cAs 8s6h Ac6s 6d4h JhJd Kc5d",
      Solver.process("texas-holdem 3h3s4d6c7c Kc5d 9cAs Ks9d 9sQs 8s6h JhJd Ac6s 6d4h"));
  }

  @Test
  public void test_texas_holdem_2283_3h5s7c9c9d_Qc8h_Kh9s_6h4h_Tc3s_6cQd_AhTh_5c6d() {
    assertEquals(
      "6cQd Qc8h AhTh Tc3s 5c6d Kh9s 6h4h",
      Solver.process("texas-holdem 3h5s7c9c9d Qc8h Kh9s 6h4h Tc3s 6cQd AhTh 5c6d"));
  }

  @Test
  public void test_texas_holdem_2284_4d5h8dJhQh_2hKh_6sQc() {
    assertEquals(
      "6sQc 2hKh",
      Solver.process("texas-holdem 4d5h8dJhQh 2hKh 6sQc"));
  }

  @Test
  public void test_texas_holdem_2285_5s6c7d8hQh_Qd3s_8d6s() {
    assertEquals(
      "Qd3s 8d6s",
      Solver.process("texas-holdem 5s6c7d8hQh Qd3s 8d6s"));
  }

  @Test
  public void test_texas_holdem_2286_2h3d8s9sAc_7d5c_KsJd_Ah3h_7c4h() {
    assertEquals(
      "7c4h 7d5c KsJd Ah3h",
      Solver.process("texas-holdem 2h3d8s9sAc 7d5c KsJd Ah3h 7c4h"));
  }

  @Test
  public void test_texas_holdem_2287_2s4h5dJsKc_3c8c_QhTh_3s6d_Jh2h_9sKd_6sJc_QsAd_7cTs() {
    assertEquals(
      "3c8c 7cTs QhTh QsAd 6sJc 9sKd Jh2h 3s6d",
      Solver.process("texas-holdem 2s4h5dJsKc 3c8c QhTh 3s6d Jh2h 9sKd 6sJc QsAd 7cTs"));
  }

  @Test
  public void test_texas_holdem_2288_3c5d8cAhJd_Jc8s_8d2s_2cJh_Js7c_4dKc_Ac3d_4c2h_QhQc() {
    assertEquals(
      "4dKc 8d2s 2cJh Js7c QhQc Jc8s Ac3d 4c2h",
      Solver.process("texas-holdem 3c5d8cAhJd Jc8s 8d2s 2cJh Js7c 4dKc Ac3d 4c2h QhQc"));
  }

  @Test
  public void test_texas_holdem_2289_2d5c7h8d8h_QdTs_4hAc_Ks9d_Ah9h() {
    assertEquals(
      "QdTs Ks9d 4hAc Ah9h",
      Solver.process("texas-holdem 2d5c7h8d8h QdTs 4hAc Ks9d Ah9h"));
  }

  @Test
  public void test_texas_holdem_2290_3s4h7dKcQd_Kd4s_Jh7s_7c2d_2c5s_3h5h_8s6d_AhKs_2h8d_2s6h() {
    assertEquals(
      "2c5s 2s6h 2h8d 8s6d 3h5h 7c2d Jh7s AhKs Kd4s",
      Solver.process("texas-holdem 3s4h7dKcQd Kd4s Jh7s 7c2d 2c5s 3h5h 8s6d AhKs 2h8d 2s6h"));
  }

  @Test
  public void test_texas_holdem_2291_3s4d5sKcTh_2d2h_3d8s_2s6c_5c3h() {
    assertEquals(
      "2d2h 3d8s 5c3h 2s6c",
      Solver.process("texas-holdem 3s4d5sKcTh 2d2h 3d8s 2s6c 5c3h"));
  }

  @Test
  public void test_texas_holdem_2292_4c5s8dAhTc_7dTs_6hJc_8cAd_7c3h_6sQc_2d9d_4d5c() {
    assertEquals(
      "7c3h 2d9d 6hJc 6sQc 7dTs 4d5c 8cAd",
      Solver.process("texas-holdem 4c5s8dAhTc 7dTs 6hJc 8cAd 7c3h 6sQc 2d9d 4d5c"));
  }

  @Test
  public void test_texas_holdem_2293_9cJdJsQdQs_QcKh_7hAs_5c4h_Jh9h_4d7s() {
    assertEquals(
      "4d7s=5c4h 7hAs Jh9h QcKh",
      Solver.process("texas-holdem 9cJdJsQdQs QcKh 7hAs 5c4h Jh9h 4d7s"));
  }

  @Test
  public void test_texas_holdem_2294_2s5h9dAhTh_As3c_8c5d_KdQc_4c4h() {
    assertEquals(
      "KdQc 4c4h 8c5d As3c",
      Solver.process("texas-holdem 2s5h9dAhTh As3c 8c5d KdQc 4c4h"));
  }

  @Test
  public void test_texas_holdem_2295_2h7h9hAsQh_4c3c_9c8d() {
    assertEquals(
      "4c3c 9c8d",
      Solver.process("texas-holdem 2h7h9hAsQh 4c3c 9c8d"));
  }

  @Test
  public void test_texas_holdem_2296_2s5h8s9dKs_3dQs_Kd2c_3cTc_2d3h() {
    assertEquals(
      "3cTc 3dQs 2d3h Kd2c",
      Solver.process("texas-holdem 2s5h8s9dKs 3dQs Kd2c 3cTc 2d3h"));
  }

  @Test
  public void test_texas_holdem_2297_2c5h7h8dAd_Kh2s_3s3h_2d4c_AcJd_8cTs() {
    assertEquals(
      "2d4c Kh2s 3s3h 8cTs AcJd",
      Solver.process("texas-holdem 2c5h7h8dAd Kh2s 3s3h 2d4c AcJd 8cTs"));
  }

  @Test
  public void test_texas_holdem_2298_7h9cAsTcTh_3h3c_8hAc_QhAd() {
    assertEquals(
      "3h3c 8hAc QhAd",
      Solver.process("texas-holdem 7h9cAsTcTh 3h3c 8hAc QhAd"));
  }

  @Test
  public void test_texas_holdem_2299_6c6h7c7sQd_5d2h_6dJh_3dAh() {
    assertEquals(
      "5d2h 3dAh 6dJh",
      Solver.process("texas-holdem 6c6h7c7sQd 5d2h 6dJh 3dAh"));
  }

  @Test
  public void test_texas_holdem_2300_7d8d9hAcQc_Jd4s_8s2s_3cKh_3hTd_As7h_ThQh_2d2h() {
    assertEquals(
      "3hTd Jd4s 3cKh 2d2h 8s2s ThQh As7h",
      Solver.process("texas-holdem 7d8d9hAcQc Jd4s 8s2s 3cKh 3hTd As7h ThQh 2d2h"));
  }

  @Test
  public void test_texas_holdem_2301_3c4h6s9hQc_6h6c_KcTc_JsAc_8h3h_5h3d_7h9s() {
    assertEquals(
      "KcTc JsAc 5h3d 8h3h 7h9s 6h6c",
      Solver.process("texas-holdem 3c4h6s9hQc 6h6c KcTc JsAc 8h3h 5h3d 7h9s"));
  }

  @Test
  public void test_texas_holdem_2302_6d6s8hAcQh_Qd7d_2h9s_Ad7s_9d3c_KhJc_4s3h_JhQs() {
    assertEquals(
      "4s3h 2h9s=9d3c KhJc JhQs=Qd7d Ad7s",
      Solver.process("texas-holdem 6d6s8hAcQh Qd7d 2h9s Ad7s 9d3c KhJc 4s3h JhQs"));
  }

  @Test
  public void test_texas_holdem_2303_3s5h7s9cJh_KsTd_Th5d_AhQc_Ts2h_3hJd_Qh2c_4c9s_3c9h() {
    assertEquals(
      "Ts2h Qh2c KsTd AhQc Th5d 4c9s 3c9h 3hJd",
      Solver.process("texas-holdem 3s5h7s9cJh KsTd Th5d AhQc Ts2h 3hJd Qh2c 4c9s 3c9h"));
  }

  @Test
  public void test_texas_holdem_2304_3d4c8dAhQc_Ac7h_3cQd_4dQh_Ad6c() {
    assertEquals(
      "Ad6c Ac7h 3cQd 4dQh",
      Solver.process("texas-holdem 3d4c8dAhQc Ac7h 3cQd 4dQh Ad6c"));
  }

  @Test
  public void test_texas_holdem_2305_4h8hAhKdQd_Jh6h_3cKh() {
    assertEquals(
      "3cKh Jh6h",
      Solver.process("texas-holdem 4h8hAhKdQd Jh6h 3cKh"));
  }

  @Test
  public void test_texas_holdem_2306_2h5h7hKdTc_Jh8c_6sJd_9s2c() {
    assertEquals(
      "6sJd Jh8c 9s2c",
      Solver.process("texas-holdem 2h5h7hKdTc Jh8c 6sJd 9s2c"));
  }

  @Test
  public void test_texas_holdem_2307_2c7dJdJsKh_2dKd_5s6h_4d9h_JhTh_6s9s_4cJc_Ad9d() {
    assertEquals(
      "5s6h 4d9h=6s9s Ad9d 2dKd 4cJc JhTh",
      Solver.process("texas-holdem 2c7dJdJsKh 2dKd 5s6h 4d9h JhTh 6s9s 4cJc Ad9d"));
  }

  @Test
  public void test_texas_holdem_2308_3h3s9dJcQs_7c4s_AhTc_Jh3d_2s4d_8h6h() {
    assertEquals(
      "2s4d=7c4s=8h6h AhTc Jh3d",
      Solver.process("texas-holdem 3h3s9dJcQs 7c4s AhTc Jh3d 2s4d 8h6h"));
  }

  @Test
  public void test_texas_holdem_2309_4h5c5d6sQs_TdQc_9c6c_7c8s_Qh3c_8d9d_Ad4d() {
    assertEquals(
      "8d9d Ad4d 9c6c Qh3c TdQc 7c8s",
      Solver.process("texas-holdem 4h5c5d6sQs TdQc 9c6c 7c8s Qh3c 8d9d Ad4d"));
  }

  @Test
  public void test_texas_holdem_2310_3c4cAcJcQs_6d9s_Kc2h_5dKs() {
    assertEquals(
      "6d9s 5dKs Kc2h",
      Solver.process("texas-holdem 3c4cAcJcQs 6d9s Kc2h 5dKs"));
  }

  @Test
  public void test_texas_holdem_2311_2s5s7hAcTd_6sJs_3s7d_4d2h_8h8c_AhKs_4c4s_5c9d_Jc7c() {
    assertEquals(
      "6sJs 4d2h 4c4s 5c9d 3s7d Jc7c 8h8c AhKs",
      Solver.process("texas-holdem 2s5s7hAcTd 6sJs 3s7d 4d2h 8h8c AhKs 4c4s 5c9d Jc7c"));
  }

  @Test
  public void test_texas_holdem_2312_2d3c5h8dTc_7c3s_Ah6c_Qh7h_2sKh_4dJs_5dKd_2c3d() {
    assertEquals(
      "4dJs Qh7h Ah6c 2sKh 7c3s 5dKd 2c3d",
      Solver.process("texas-holdem 2d3c5h8dTc 7c3s Ah6c Qh7h 2sKh 4dJs 5dKd 2c3d"));
  }

  @Test
  public void test_texas_holdem_2313_8d9hAsKdQd_Jc7d_6s3c_JdQs_4s2s_Ah9s_5s3h_8c4d_TdTs() {
    assertEquals(
      "4s2s=5s3h=6s3c Jc7d 8c4d TdTs JdQs Ah9s",
      Solver.process("texas-holdem 8d9hAsKdQd Jc7d 6s3c JdQs 4s2s Ah9s 5s3h 8c4d TdTs"));
  }

  @Test
  public void test_texas_holdem_2314_3d5h6sAdQc_TsAh_Tc9d_3sJh_5s4c() {
    assertEquals(
      "Tc9d 3sJh 5s4c TsAh",
      Solver.process("texas-holdem 3d5h6sAdQc TsAh Tc9d 3sJh 5s4c"));
  }

  @Test
  public void test_texas_holdem_2315_3h3s4c8cAs_AcJs_4s7d_5h2h_6s9s_4d3c_9cKh() {
    assertEquals(
      "6s9s 9cKh 4s7d AcJs 5h2h 4d3c",
      Solver.process("texas-holdem 3h3s4c8cAs AcJs 4s7d 5h2h 6s9s 4d3c 9cKh"));
  }

  @Test
  public void test_texas_holdem_2316_4c9d9sQsTs_8sAh_4h6c_9hJs_8h7c_JdAs() {
    assertEquals(
      "8h7c 8sAh JdAs 4h6c 9hJs",
      Solver.process("texas-holdem 4c9d9sQsTs 8sAh 4h6c 9hJs 8h7c JdAs"));
  }

  @Test
  public void test_texas_holdem_2317_5c6sAcKdTd_4c7s_KsQh_4h9s_8d8s_8c2c_Qs7d_4d5d_AhQd() {
    assertEquals(
      "4c7s 8c2c 4h9s Qs7d 4d5d 8d8s KsQh AhQd",
      Solver.process("texas-holdem 5c6sAcKdTd 4c7s KsQh 4h9s 8d8s 8c2c Qs7d 4d5d AhQd"));
  }

  @Test
  public void test_texas_holdem_2318_7s8d8hQcTh_4sTs_3hAh_7d9d() {
    assertEquals(
      "3hAh 7d9d 4sTs",
      Solver.process("texas-holdem 7s8d8hQcTh 4sTs 3hAh 7d9d"));
  }

  @Test
  public void test_texas_holdem_2319_3d9hJsKcKs_4sTd_2c9s_2dKd_Ah5s_Qh8s() {
    assertEquals(
      "4sTd Qh8s Ah5s 2c9s 2dKd",
      Solver.process("texas-holdem 3d9hJsKcKs 4sTd 2c9s 2dKd Ah5s Qh8s"));
  }

  @Test
  public void test_texas_holdem_2320_3c4d7cAdAs_9c4h_Qh7s_2c2h_6hKc() {
    assertEquals(
      "6hKc 2c2h 9c4h Qh7s",
      Solver.process("texas-holdem 3c4d7cAdAs 9c4h Qh7s 2c2h 6hKc"));
  }

  @Test
  public void test_texas_holdem_2321_2c3d4dAcAd_3h6c_7sKh_3sQd_Jc3c() {
    assertEquals(
      "7sKh 3h6c Jc3c 3sQd",
      Solver.process("texas-holdem 2c3d4dAcAd 3h6c 7sKh 3sQd Jc3c"));
  }

  @Test
  public void test_texas_holdem_2322_3c8h8s9cAh_9sJh_9dAs_5d7h_Ad3d_4d2h_JdQd_8d6c() {
    assertEquals(
      "4d2h 5d7h JdQd 9sJh Ad3d 9dAs 8d6c",
      Solver.process("texas-holdem 3c8h8s9cAh 9sJh 9dAs 5d7h Ad3d 4d2h JdQd 8d6c"));
  }

  @Test
  public void test_texas_holdem_2323_3s4d4h6cTc_6hAd_Jd7s_7d9d_8c8s_4sQd_Ac7h_JcQc_As8d_KdTh() {
    assertEquals(
      "7d9d Jd7s JcQc Ac7h As8d 6hAd 8c8s KdTh 4sQd",
      Solver.process("texas-holdem 3s4d4h6cTc 6hAd Jd7s 7d9d 8c8s 4sQd Ac7h JcQc As8d KdTh"));
  }

  @Test
  public void test_texas_holdem_2324_2h7sAhKdQd_Ks9d_9c5c_Th3h_2d9h_6cJs_Jc3s() {
    assertEquals(
      "9c5c Th3h 6cJs=Jc3s 2d9h Ks9d",
      Solver.process("texas-holdem 2h7sAhKdQd Ks9d 9c5c Th3h 2d9h 6cJs Jc3s"));
  }

  @Test
  public void test_texas_holdem_2325_6d7h8d8hJh_Qc2d_2h7c_6hKs_8cKd() {
    assertEquals(
      "Qc2d 6hKs 2h7c 8cKd",
      Solver.process("texas-holdem 6d7h8d8hJh Qc2d 2h7c 6hKs 8cKd"));
  }

  @Test
  public void test_texas_holdem_2326_8h9hAhTdTs_3c4c_2cTc_3s4h_6dQd_Kc7d() {
    assertEquals(
      "3c4c=3s4h 6dQd Kc7d 2cTc",
      Solver.process("texas-holdem 8h9hAhTdTs 3c4c 2cTc 3s4h 6dQd Kc7d"));
  }

  @Test
  public void test_texas_holdem_2327_3d4s7c7hQd_3s8c_9d6h_3c9s_9h5h_Qh8s_9c2d_AsAd_5sJd_6c6d() {
    assertEquals(
      "9c2d 9h5h 9d6h 5sJd 3c9s=3s8c 6c6d Qh8s AsAd",
      Solver.process("texas-holdem 3d4s7c7hQd 3s8c 9d6h 3c9s 9h5h Qh8s 9c2d AsAd 5sJd 6c6d"));
  }

  @Test
  public void test_texas_holdem_2328_2h4h5c8c9h_QcJc_3hAh() {
    assertEquals(
      "QcJc 3hAh",
      Solver.process("texas-holdem 2h4h5c8c9h QcJc 3hAh"));
  }

  @Test
  public void test_texas_holdem_2329_2h3c4s9dQs_2dKc_AsAh_Ks5d_3h5c() {
    assertEquals(
      "Ks5d 2dKc 3h5c AsAh",
      Solver.process("texas-holdem 2h3c4s9dQs 2dKc AsAh Ks5d 3h5c"));
  }

  @Test
  public void test_texas_holdem_2330_2d2h3s4c7d_Jh2c_7c9h_Jc8s_Ac4s_9cTs() {
    assertEquals(
      "9cTs Jc8s Ac4s 7c9h Jh2c",
      Solver.process("texas-holdem 2d2h3s4c7d Jh2c 7c9h Jc8s Ac4s 9cTs"));
  }

  @Test
  public void test_texas_holdem_2331_8c9cJsKcQc_7c8s_Ks7h() {
    assertEquals(
      "Ks7h 7c8s",
      Solver.process("texas-holdem 8c9cJsKcQc 7c8s Ks7h"));
  }

  @Test
  public void test_texas_holdem_2332_4h8s9dAdQs_5s2s_3cKh() {
    assertEquals(
      "5s2s 3cKh",
      Solver.process("texas-holdem 4h8s9dAdQs 5s2s 3cKh"));
  }

  @Test
  public void test_texas_holdem_2333_3s4dAdKsTd_5s5c_2hTs() {
    assertEquals(
      "5s5c 2hTs",
      Solver.process("texas-holdem 3s4dAdKsTd 5s5c 2hTs"));
  }

  @Test
  public void test_texas_holdem_2334_2c3h5s6s9h_4h9s_JdQc_7d3d_4sAh_QhQs_Th8h_8d9d_Kc3s() {
    assertEquals(
      "Th8h JdQc 7d3d Kc3s 8d9d QhQs 4h9s=4sAh",
      Solver.process("texas-holdem 2c3h5s6s9h 4h9s JdQc 7d3d 4sAh QhQs Th8h 8d9d Kc3s"));
  }

  @Test
  public void test_texas_holdem_2335_2c3c5d9hKd_2dTc_Jh4s() {
    assertEquals(
      "Jh4s 2dTc",
      Solver.process("texas-holdem 2c3c5d9hKd 2dTc Jh4s"));
  }

  @Test
  public void test_texas_holdem_2336_4d5c9sAcAs_7dJc_4h6h() {
    assertEquals(
      "7dJc 4h6h",
      Solver.process("texas-holdem 4d5c9sAcAs 7dJc 4h6h"));
  }

  @Test
  public void test_texas_holdem_2337_5s6dQcQdQs_KsJd_KcAs_2c3c_5dAd_9c8d_Jh7d_7sTh_6sTd_6h4s() {
    assertEquals(
      "2c3c 9c8d 7sTh Jh7d KsJd KcAs 5dAd 6h4s=6sTd",
      Solver.process("texas-holdem 5s6dQcQdQs KsJd KcAs 2c3c 5dAd 9c8d Jh7d 7sTh 6sTd 6h4s"));
  }

  @Test
  public void test_texas_holdem_2338_2c2h6s7sQd_Jc3d_Ah7h_5hKs_9s6d_TcTh_Js7d_5d4h_7cKc_8c8s() {
    assertEquals(
      "5d4h Jc3d 5hKs 9s6d Js7d 7cKc Ah7h 8c8s TcTh",
      Solver.process("texas-holdem 2c2h6s7sQd Jc3d Ah7h 5hKs 9s6d TcTh Js7d 5d4h 7cKc 8c8s"));
  }

  @Test
  public void test_texas_holdem_2339_2d3dKcKhTc_9dQd_8h5c_8s2c_8cAh() {
    assertEquals(
      "8h5c 9dQd 8cAh 8s2c",
      Solver.process("texas-holdem 2d3dKcKhTc 9dQd 8h5c 8s2c 8cAh"));
  }

  @Test
  public void test_texas_holdem_2340_3c4s8sJdTd_Ad5s_QcJs_9s6s_3sAs_6d6c_4d9c_7d9h() {
    assertEquals(
      "9s6s Ad5s 3sAs 4d9c 6d6c QcJs 7d9h",
      Solver.process("texas-holdem 3c4s8sJdTd Ad5s QcJs 9s6s 3sAs 6d6c 4d9c 7d9h"));
  }

  @Test
  public void test_texas_holdem_2341_3h5c6dJsQc_6h4h_5sTh_9hAc_Kd4c_TsJd_3cJc_7h9s() {
    assertEquals(
      "7h9s Kd4c 9hAc 5sTh 6h4h TsJd 3cJc",
      Solver.process("texas-holdem 3h5c6dJsQc 6h4h 5sTh 9hAc Kd4c TsJd 3cJc 7h9s"));
  }

  @Test
  public void test_texas_holdem_2342_2c9hKdQsTc_Ac4h_5s6h_5c5d_Js8s_4cQh() {
    assertEquals(
      "5s6h Ac4h 5c5d 4cQh Js8s",
      Solver.process("texas-holdem 2c9hKdQsTc Ac4h 5s6h 5c5d Js8s 4cQh"));
  }

  @Test
  public void test_texas_holdem_2343_7h7sAdJsKc_Kh3d_9cAc_8cTs_TdJc() {
    assertEquals(
      "8cTs TdJc Kh3d 9cAc",
      Solver.process("texas-holdem 7h7sAdJsKc Kh3d 9cAc 8cTs TdJc"));
  }

  @Test
  public void test_texas_holdem_2344_8cAdAsKhQs_8dKd_5hTh_JdJc_4sKs_5d6s_4c7s_2d6c_9dQh_2sTd() {
    assertEquals(
      "2d6c=4c7s=5d6s 2sTd=5hTh JdJc 9dQh 4sKs=8dKd",
      Solver.process("texas-holdem 8cAdAsKhQs 8dKd 5hTh JdJc 4sKs 5d6s 4c7s 2d6c 9dQh 2sTd"));
  }

  @Test
  public void test_texas_holdem_2345_3c6h8sAcJd_5sJh_Kh7s_9d4h_Ks4c() {
    assertEquals(
      "9d4h Ks4c Kh7s 5sJh",
      Solver.process("texas-holdem 3c6h8sAcJd 5sJh Kh7s 9d4h Ks4c"));
  }

  @Test
  public void test_texas_holdem_2346_4d8c9dAhKc_Th5d_JdKs_JcQh_TsAc() {
    assertEquals(
      "Th5d JcQh JdKs TsAc",
      Solver.process("texas-holdem 4d8c9dAhKc Th5d JdKs JcQh TsAc"));
  }

  @Test
  public void test_texas_holdem_2347_5d6cJdQdTs_QcTh_9cKc_9s4s_8hKd_3h9d() {
    assertEquals(
      "3h9d=9s4s 8hKd QcTh 9cKc",
      Solver.process("texas-holdem 5d6cJdQdTs QcTh 9cKc 9s4s 8hKd 3h9d"));
  }

  @Test
  public void test_texas_holdem_2348_4c4h8dAcJh_Kc7c_Qs8h_Th6h_8s5d_Ad9s_8cKs_As7s_2sQd() {
    assertEquals(
      "Th6h 2sQd Kc7c 8cKs=8s5d=Qs8h Ad9s=As7s",
      Solver.process("texas-holdem 4c4h8dAcJh Kc7c Qs8h Th6h 8s5d Ad9s 8cKs As7s 2sQd"));
  }

  @Test
  public void test_texas_holdem_2349_2h2s6c6dTc_Th8c_7hJd_3h8d_5h3d_As8s_KdAd_4hJh_6s8h() {
    assertEquals(
      "3h8d=5h3d 4hJh=7hJd As8s=KdAd Th8c 6s8h",
      Solver.process("texas-holdem 2h2s6c6dTc Th8c 7hJd 3h8d 5h3d As8s KdAd 4hJh 6s8h"));
  }

  @Test
  public void test_texas_holdem_2350_2c6d6s8dQs_4h3h_9c8c_5d3s() {
    assertEquals(
      "4h3h 5d3s 9c8c",
      Solver.process("texas-holdem 2c6d6s8dQs 4h3h 9c8c 5d3s"));
  }

  @Test
  public void test_texas_holdem_2351_3d6s9sAcJd_KcJs_3c4d_7dKs_Qc7c_5c5d_2d9d_9c8d() {
    assertEquals(
      "Qc7c 7dKs 3c4d 5c5d 2d9d 9c8d KcJs",
      Solver.process("texas-holdem 3d6s9sAcJd KcJs 3c4d 7dKs Qc7c 5c5d 2d9d 9c8d"));
  }

  @Test
  public void test_texas_holdem_2352_3cJcKdQcQs_Js6c_Qh5h_9c8h_Ts8d() {
    assertEquals(
      "9c8h Ts8d Js6c Qh5h",
      Solver.process("texas-holdem 3cJcKdQcQs Js6c Qh5h 9c8h Ts8d"));
  }

  @Test
  public void test_texas_holdem_2353_5c8c9dAhKd_Ts8h_Qd8s_Jh4c_3d6s_5d5s_AsTc() {
    assertEquals(
      "3d6s Jh4c Ts8h Qd8s AsTc 5d5s",
      Solver.process("texas-holdem 5c8c9dAhKd Ts8h Qd8s Jh4c 3d6s 5d5s AsTc"));
  }

  @Test
  public void test_texas_holdem_2354_2c8d9hAcTd_Ts7d_6h2h_6d4c_3h4s_4h6s_TcAh_Qc5c() {
    assertEquals(
      "3h4s 4h6s=6d4c Qc5c 6h2h Ts7d TcAh",
      Solver.process("texas-holdem 2c8d9hAcTd Ts7d 6h2h 6d4c 3h4s 4h6s TcAh Qc5c"));
  }

  @Test
  public void test_texas_holdem_2355_4h5h5s9hJc_Ac7c_TcAh_Jh2h_3h2s_9cKc() {
    assertEquals(
      "3h2s Ac7c TcAh 9cKc Jh2h",
      Solver.process("texas-holdem 4h5h5s9hJc Ac7c TcAh Jh2h 3h2s 9cKc"));
  }

  @Test
  public void test_texas_holdem_2356_3c6h8cTdTs_6dKd_Th8d_3h2h_AhJs_Jh4h() {
    assertEquals(
      "Jh4h AhJs 3h2h 6dKd Th8d",
      Solver.process("texas-holdem 3c6h8cTdTs 6dKd Th8d 3h2h AhJs Jh4h"));
  }

  @Test
  public void test_texas_holdem_2357_4d6h7d8sAc_9sJs_3d8h_2c5s_Tc6d_As3s_6sKc_4cTd_TsQc_Ah2d() {
    assertEquals(
      "9sJs TsQc 4cTd Tc6d 6sKc 3d8h Ah2d=As3s 2c5s",
      Solver.process("texas-holdem 4d6h7d8sAc 9sJs 3d8h 2c5s Tc6d As3s 6sKc 4cTd TsQc Ah2d"));
  }

  @Test
  public void test_texas_holdem_2358_2h4h9cAcKh_JcTs_Td3c_6dAd_3d5c_JdKd_Qh7d_KsQc_9s8c() {
    assertEquals(
      "Td3c JcTs Qh7d 9s8c JdKd KsQc 6dAd 3d5c",
      Solver.process("texas-holdem 2h4h9cAcKh JcTs Td3c 6dAd 3d5c JdKd Qh7d KsQc 9s8c"));
  }

  @Test
  public void test_texas_holdem_2359_2h4h8dKhKs_Js2s_Qh4c_TcQd_Ts3s() {
    assertEquals(
      "Ts3s TcQd Js2s Qh4c",
      Solver.process("texas-holdem 2h4h8dKhKs Js2s Qh4c TcQd Ts3s"));
  }

  @Test
  public void test_texas_holdem_2360_2d7c8s9hAc_5h3h_Js9c_6hJh_4s3s_5dQc_5s8d_Tc3d() {
    assertEquals(
      "4s3s 5h3h Tc3d 6hJh 5dQc 5s8d Js9c",
      Solver.process("texas-holdem 2d7c8s9hAc 5h3h Js9c 6hJh 4s3s 5dQc 5s8d Tc3d"));
  }

  @Test
  public void test_texas_holdem_2361_2d3d6d7sKd_KcQd_4dAc_2sQc_8h5c() {
    assertEquals(
      "8h5c 2sQc 4dAc KcQd",
      Solver.process("texas-holdem 2d3d6d7sKd KcQd 4dAc 2sQc 8h5c"));
  }

  @Test
  public void test_texas_holdem_2362_6d7d8c8d8h_Kd6h_4cAh() {
    assertEquals(
      "4cAh Kd6h",
      Solver.process("texas-holdem 6d7d8c8d8h Kd6h 4cAh"));
  }

  @Test
  public void test_texas_holdem_2363_2d5d6cKcTh_Kh3d_Qs2s_Ac2h_Ks3s_Ts8s_Td4c_7s7d_Qd9d() {
    assertEquals(
      "Qd9d Qs2s Ac2h 7s7d Td4c Ts8s Kh3d=Ks3s",
      Solver.process("texas-holdem 2d5d6cKcTh Kh3d Qs2s Ac2h Ks3s Ts8s Td4c 7s7d Qd9d"));
  }

  @Test
  public void test_texas_holdem_2364_3h6h9dKhTh_Qd8d_2d5s_6d5h_9c8c_3dKd() {
    assertEquals(
      "2d5s Qd8d 9c8c 3dKd 6d5h",
      Solver.process("texas-holdem 3h6h9dKhTh Qd8d 2d5s 6d5h 9c8c 3dKd"));
  }

  @Test
  public void test_texas_holdem_2365_5d6s9dJcTd_6d8c_5h5s_7c4s_2dQs() {
    assertEquals(
      "7c4s 2dQs 6d8c 5h5s",
      Solver.process("texas-holdem 5d6s9dJcTd 6d8c 5h5s 7c4s 2dQs"));
  }

  @Test
  public void test_texas_holdem_2366_3h5d8c9sAd_7h6c_Kd3d_5h4h_9dJs() {
    assertEquals(
      "Kd3d 5h4h 9dJs 7h6c",
      Solver.process("texas-holdem 3h5d8c9sAd 7h6c Kd3d 5h4h 9dJs"));
  }

  @Test
  public void test_texas_holdem_2367_3h5cAhJdTc_Jc2s_2h7h_Ac6s_6h8h_7s9s() {
    assertEquals(
      "2h7h 6h8h 7s9s Jc2s Ac6s",
      Solver.process("texas-holdem 3h5cAhJdTc Jc2s 2h7h Ac6s 6h8h 7s9s"));
  }

  @Test
  public void test_texas_holdem_2368_3h9dAdQdTh_Ac9h_5s7c_QhQs_3d9s_6d4c_2cJd_2dJh() {
    assertEquals(
      "6d4c 5s7c 2cJd=2dJh 3d9s Ac9h QhQs",
      Solver.process("texas-holdem 3h9dAdQdTh Ac9h 5s7c QhQs 3d9s 6d4c 2cJd 2dJh"));
  }

  @Test
  public void test_texas_holdem_2369_2d3c5c5s9h_2c8c_3dTd_AhJc_KdQh() {
    assertEquals(
      "KdQh AhJc 2c8c 3dTd",
      Solver.process("texas-holdem 2d3c5c5s9h 2c8c 3dTd AhJc KdQh"));
  }

  @Test
  public void test_texas_holdem_2370_2h8sAcAdTh_9cQs_5s6s_Kd9d_4sJd_Qd2d_Jh3h() {
    assertEquals(
      "5s6s 4sJd=Jh3h 9cQs Kd9d Qd2d",
      Solver.process("texas-holdem 2h8sAcAdTh 9cQs 5s6s Kd9d 4sJd Qd2d Jh3h"));
  }

  @Test
  public void test_texas_holdem_2371_2s5d5h6h7d_KdQd_8s8h() {
    assertEquals(
      "KdQd 8s8h",
      Solver.process("texas-holdem 2s5d5h6h7d KdQd 8s8h"));
  }

  @Test
  public void test_texas_holdem_2372_4d5dKsQsTh_3s4h_AhTc_6s3c_4sAc_Jc2s_Kc8d_9h6d_5h9d() {
    assertEquals(
      "6s3c 9h6d Jc2s 3s4h 4sAc 5h9d AhTc Kc8d",
      Solver.process("texas-holdem 4d5dKsQsTh 3s4h AhTc 6s3c 4sAc Jc2s Kc8d 9h6d 5h9d"));
  }

  @Test
  public void test_texas_holdem_2373_3c3d4s9sJc_6h7c_4h5s_Ks4c_AhTh_Qd2d_9dJs_KhQh() {
    assertEquals(
      "6h7c Qd2d KhQh AhTh 4h5s Ks4c 9dJs",
      Solver.process("texas-holdem 3c3d4s9sJc 6h7c 4h5s Ks4c AhTh Qd2d 9dJs KhQh"));
  }

  @Test
  public void test_texas_holdem_2374_5dJcJdKdTd_6s9c_KcAs_2h9s_3sAc() {
    assertEquals(
      "2h9s=6s9c 3sAc KcAs",
      Solver.process("texas-holdem 5dJcJdKdTd 6s9c KcAs 2h9s 3sAc"));
  }

  @Test
  public void test_texas_holdem_2375_4c5h7h8hQh_2cJs_7sQs_6hTh_9hKd() {
    assertEquals(
      "2cJs 7sQs 9hKd 6hTh",
      Solver.process("texas-holdem 4c5h7h8hQh 2cJs 7sQs 6hTh 9hKd"));
  }

  @Test
  public void test_texas_holdem_2376_4c6s7dJsKs_3c7h_As9d_2d3h_QdQh_QsKd_Qc4h() {
    assertEquals(
      "2d3h As9d Qc4h 3c7h QdQh QsKd",
      Solver.process("texas-holdem 4c6s7dJsKs 3c7h As9d 2d3h QdQh QsKd Qc4h"));
  }

  @Test
  public void test_texas_holdem_2377_2h4d4h8dKs_7sJh_9cAd_3s8s_8cTc_9h6d_Qd2c_3hAs_TdTh_5cJs() {
    assertEquals(
      "9h6d 5cJs=7sJh 3hAs 9cAd Qd2c 3s8s=8cTc TdTh",
      Solver.process("texas-holdem 2h4d4h8dKs 7sJh 9cAd 3s8s 8cTc 9h6d Qd2c 3hAs TdTh 5cJs"));
  }

  @Test
  public void test_texas_holdem_2378_3d7sAsQcQs_5d3h_4h9s_4s9d_8hAc_6d8c_Kc5h_8s5s() {
    assertEquals(
      "6d8c 4h9s=4s9d Kc5h 5d3h 8hAc 8s5s",
      Solver.process("texas-holdem 3d7sAsQcQs 5d3h 4h9s 4s9d 8hAc 6d8c Kc5h 8s5s"));
  }

  @Test
  public void test_texas_holdem_2379_2c3d5dJhTc_4d7d_QsAd_TdKs_7h8d() {
    assertEquals(
      "4d7d 7h8d QsAd TdKs",
      Solver.process("texas-holdem 2c3d5dJhTc 4d7d QsAd TdKs 7h8d"));
  }

  @Test
  public void test_texas_holdem_2380_2c4s6sKcQh_Jh5c_AsTh_9cQd_7hAd_3sJd_5d7s() {
    assertEquals(
      "5d7s 3sJd Jh5c 7hAd AsTh 9cQd",
      Solver.process("texas-holdem 2c4s6sKcQh Jh5c AsTh 9cQd 7hAd 3sJd 5d7s"));
  }

  @Test
  public void test_texas_holdem_2381_5d7hJsTcTs_9c4d_Ac2d_4c4h_Qd3c_7dQh_KdKc() {
    assertEquals(
      "9c4d Qd3c Ac2d 4c4h 7dQh KdKc",
      Solver.process("texas-holdem 5d7hJsTcTs 9c4d Ac2d 4c4h Qd3c 7dQh KdKc"));
  }

  @Test
  public void test_texas_holdem_2382_7h8h9dKsTs_AcAh_2d4d_9cQh_4h2s_2hKh_Kc4s_Jh5s_4c6d() {
    assertEquals(
      "2d4d=4h2s 9cQh 2hKh=Kc4s AcAh 4c6d Jh5s",
      Solver.process("texas-holdem 7h8h9dKsTs AcAh 2d4d 9cQh 4h2s 2hKh Kc4s Jh5s 4c6d"));
  }

  @Test
  public void test_texas_holdem_2383_4h6h8cJdTc_7h5c_4s9d_5sAs_AdQd() {
    assertEquals(
      "5sAs AdQd 4s9d 7h5c",
      Solver.process("texas-holdem 4h6h8cJdTc 7h5c 4s9d 5sAs AdQd"));
  }

  @Test
  public void test_texas_holdem_2384_5c6h7sAcQh_6c4d_4cQs_Tc2c_8d6d_Qc9d() {
    assertEquals(
      "Tc2c 6c4d 8d6d 4cQs Qc9d",
      Solver.process("texas-holdem 5c6h7sAcQh 6c4d 4cQs Tc2c 8d6d Qc9d"));
  }

  @Test
  public void test_texas_holdem_2385_5d6d9dAsTd_2d9h_9c8s() {
    assertEquals(
      "9c8s 2d9h",
      Solver.process("texas-holdem 5d6d9dAsTd 2d9h 9c8s"));
  }

  @Test
  public void test_texas_holdem_2386_2s3s8dQcTs_6h5d_9c6d_Kd5c_8s7s_5hAd_7h4c_7dQh_Td7c_JsQs() {
    assertEquals(
      "6h5d 7h4c 9c6d Kd5c 5hAd Td7c 7dQh 8s7s JsQs",
      Solver.process("texas-holdem 2s3s8dQcTs 6h5d 9c6d Kd5c 8s7s 5hAd 7h4c 7dQh Td7c JsQs"));
  }

  @Test
  public void test_texas_holdem_2387_2h3cJhKhTc_3s7s_Ah6h_6sAc_9cQd_2dKd_Th8s_Jd5h() {
    assertEquals(
      "6sAc 3s7s Th8s Jd5h 2dKd 9cQd Ah6h",
      Solver.process("texas-holdem 2h3cJhKhTc 3s7s Ah6h 6sAc 9cQd 2dKd Th8s Jd5h"));
  }

  @Test
  public void test_texas_holdem_2388_6d8cJdKcQd_2h4c_Js6c_2d6h_3dTs_Ah4s_2c7d_5sQs_7c4d_9d5c() {
    assertEquals(
      "2h4c 2c7d=7c4d 9d5c 3dTs Ah4s 2d6h 5sQs Js6c",
      Solver.process("texas-holdem 6d8cJdKcQd 2h4c Js6c 2d6h 3dTs Ah4s 2c7d 5sQs 7c4d 9d5c"));
  }

  @Test
  public void test_texas_holdem_2389_4d5cAsQcTd_2sTc_Ks5d() {
    assertEquals(
      "Ks5d 2sTc",
      Solver.process("texas-holdem 4d5cAsQcTd 2sTc Ks5d"));
  }

  @Test
  public void test_texas_holdem_2390_2c5h6s7cQd_JdAh_9sKh_5d4c_7h4s_2h6d() {
    assertEquals(
      "9sKh JdAh 5d4c 7h4s 2h6d",
      Solver.process("texas-holdem 2c5h6s7cQd JdAh 9sKh 5d4c 7h4s 2h6d"));
  }

  @Test
  public void test_texas_holdem_2391_3c6s7s8hTs_8cAs_AcAh_7h6c() {
    assertEquals(
      "8cAs AcAh 7h6c",
      Solver.process("texas-holdem 3c6s7s8hTs 8cAs AcAh 7h6c"));
  }

  @Test
  public void test_texas_holdem_2392_4c4s7hJhKc_Ts2c_6hTc_3h7c_5d9c_9hJd_5h6d_8s3s_Td7s_Ad5s() {
    assertEquals(
      "5h6d 8s3s 5d9c 6hTc=Ts2c Ad5s 3h7c=Td7s 9hJd",
      Solver.process("texas-holdem 4c4s7hJhKc Ts2c 6hTc 3h7c 5d9c 9hJd 5h6d 8s3s Td7s Ad5s"));
  }

  @Test
  public void test_texas_holdem_2393_2h7c9cKhQs_7s4d_3h4s_Jd3d_5h5c_Td7h_9s5d() {
    assertEquals(
      "3h4s Jd3d 5h5c 7s4d Td7h 9s5d",
      Solver.process("texas-holdem 2h7c9cKhQs 7s4d 3h4s Jd3d 5h5c Td7h 9s5d"));
  }

  @Test
  public void test_texas_holdem_2394_5d6s7c7hTd_7d5c_8d4c() {
    assertEquals(
      "8d4c 7d5c",
      Solver.process("texas-holdem 5d6s7c7hTd 7d5c 8d4c"));
  }

  @Test
  public void test_texas_holdem_2395_6h7cJsQdQs_6c7d_6s5c_Th9d_3c8d() {
    assertEquals(
      "3c8d Th9d 6s5c 6c7d",
      Solver.process("texas-holdem 6h7cJsQdQs 6c7d 6s5c Th9d 3c8d"));
  }

  @Test
  public void test_texas_holdem_2396_2c8h8s9cKs_8dAh_3s5s_JhQh_4c6s() {
    assertEquals(
      "3s5s 4c6s JhQh 8dAh",
      Solver.process("texas-holdem 2c8h8s9cKs 8dAh 3s5s JhQh 4c6s"));
  }

  @Test
  public void test_texas_holdem_2397_4h5s8hJsTs_5cJc_2s4s() {
    assertEquals(
      "5cJc 2s4s",
      Solver.process("texas-holdem 4h5s8hJsTs 5cJc 2s4s"));
  }

  @Test
  public void test_texas_holdem_2398_3d3hAcAsJc_QcQs_Qh7h_2cQd_2d4c_9d7d() {
    assertEquals(
      "2d4c=9d7d 2cQd=Qh7h QcQs",
      Solver.process("texas-holdem 3d3hAcAsJc QcQs Qh7h 2cQd 2d4c 9d7d"));
  }

  @Test
  public void test_texas_holdem_2399_4s6dJhQsTs_2c9c_3sJc_Kc7c_7sKd_ThTc_6c2h_3h3c_4d2s_5dQc() {
    assertEquals(
      "2c9c 7sKd=Kc7c 3h3c 4d2s 6c2h 3sJc 5dQc ThTc",
      Solver.process("texas-holdem 4s6dJhQsTs 2c9c 3sJc Kc7c 7sKd ThTc 6c2h 3h3c 4d2s 5dQc"));
  }

  @Test
  public void test_texas_holdem_2400_5c6d7s8sKc_4dQc_9dAs_8c3d_6sQh() {
    assertEquals(
      "6sQh 8c3d 4dQc 9dAs",
      Solver.process("texas-holdem 5c6d7s8sKc 4dQc 9dAs 8c3d 6sQh"));
  }

  @Test
  public void test_texas_holdem_2401_2d3c3s9sJs_2h7s_Qh3d_KhAh_Jh4c_5s9d() {
    assertEquals(
      "KhAh 2h7s 5s9d Jh4c Qh3d",
      Solver.process("texas-holdem 2d3c3s9sJs 2h7s Qh3d KhAh Jh4c 5s9d"));
  }

  @Test
  public void test_texas_holdem_2402_3c3hQcTcTd_4sTs_AdAc_7hTh_9c2c_Ks2d() {
    assertEquals(
      "Ks2d AdAc 9c2c 4sTs=7hTh",
      Solver.process("texas-holdem 3c3hQcTcTd 4sTs AdAc 7hTh 9c2c Ks2d"));
  }

  @Test
  public void test_texas_holdem_2403_6d7h8dAsTh_JdKc_2d7c_3dQc_9sKd_Ts4h_3c5h_3s8s() {
    assertEquals(
      "3c5h 3dQc JdKc 2d7c 3s8s Ts4h 9sKd",
      Solver.process("texas-holdem 6d7h8dAsTh JdKc 2d7c 3dQc 9sKd Ts4h 3c5h 3s8s"));
  }

  @Test
  public void test_texas_holdem_2404_7hAcKsTdTs_8cQh_Ad3h_3d5c_6c7d_2s8s_Ah2h_9c4d() {
    assertEquals(
      "3d5c 2s8s 9c4d 8cQh 6c7d Ad3h=Ah2h",
      Solver.process("texas-holdem 7hAcKsTdTs 8cQh Ad3h 3d5c 6c7d 2s8s Ah2h 9c4d"));
  }

  @Test
  public void test_texas_holdem_2405_5d7h8cAdTs_8dTc_3c6d_9h6h_3d2d_Kc4s_2hJs_5cAc_3h9d_Qd5h() {
    assertEquals(
      "3d2d 3c6d 3h9d 2hJs Kc4s Qd5h 8dTc 5cAc 9h6h",
      Solver.process("texas-holdem 5d7h8cAdTs 8dTc 3c6d 9h6h 3d2d Kc4s 2hJs 5cAc 3h9d Qd5h"));
  }

  @Test
  public void test_texas_holdem_2406_3c3d3s4cQs_9cKh_5c9s_8sJh_9dQh_TsQc_9hJc_6sKc() {
    assertEquals(
      "5c9s 8sJh=9hJc 6sKc=9cKh 9dQh=TsQc",
      Solver.process("texas-holdem 3c3d3s4cQs 9cKh 5c9s 8sJh 9dQh TsQc 9hJc 6sKc"));
  }

  @Test
  public void test_texas_holdem_2407_5h6s7sAhTd_6hAd_ThQh_Jh7c() {
    assertEquals(
      "Jh7c ThQh 6hAd",
      Solver.process("texas-holdem 5h6s7sAhTd 6hAd ThQh Jh7c"));
  }

  @Test
  public void test_texas_holdem_2408_3c6sAcQhTc_TsAd_8sQd_Th7s_2c4s_2h4h() {
    assertEquals(
      "2c4s=2h4h Th7s 8sQd TsAd",
      Solver.process("texas-holdem 3c6sAcQhTc TsAd 8sQd Th7s 2c4s 2h4h"));
  }

  @Test
  public void test_texas_holdem_2409_3d6s7hJsQh_8c4s_7sQc_Kh9c_Th9h() {
    assertEquals(
      "8c4s Th9h Kh9c 7sQc",
      Solver.process("texas-holdem 3d6s7hJsQh 8c4s 7sQc Kh9c Th9h"));
  }

  @Test
  public void test_texas_holdem_2410_3c4s7d9cTh_AdAc_9h2s() {
    assertEquals(
      "9h2s AdAc",
      Solver.process("texas-holdem 3c4s7d9cTh AdAc 9h2s"));
  }

  @Test
  public void test_texas_holdem_2411_2c3c4d4sJs_6h7h_QdQs_JcJh_8c5h_6d3h_Ad5s_8s5d_8d4c_2dAh() {
    assertEquals(
      "6h7h 8c5h=8s5d 2dAh 6d3h QdQs 8d4c Ad5s JcJh",
      Solver.process("texas-holdem 2c3c4d4sJs 6h7h QdQs JcJh 8c5h 6d3h Ad5s 8s5d 8d4c 2dAh"));
  }

  @Test
  public void test_texas_holdem_2412_4h6h8hAsQd_Kd5c_Js9d_QhJc_3dKc() {
    assertEquals(
      "Js9d 3dKc=Kd5c QhJc",
      Solver.process("texas-holdem 4h6h8hAsQd Kd5c Js9d QhJc 3dKc"));
  }

  @Test
  public void test_texas_holdem_2413_2d5c7h9cJd_Tc7d_4h2s_AdQc_8sKc_4cJh() {
    assertEquals(
      "8sKc AdQc 4h2s Tc7d 4cJh",
      Solver.process("texas-holdem 2d5c7h9cJd Tc7d 4h2s AdQc 8sKc 4cJh"));
  }

  @Test
  public void test_texas_holdem_2414_2h5c8d8hTd_JhJc_Kc4d_4c3s_5d8c() {
    assertEquals(
      "4c3s Kc4d JhJc 5d8c",
      Solver.process("texas-holdem 2h5c8d8hTd JhJc Kc4d 4c3s 5d8c"));
  }

  @Test
  public void test_texas_holdem_2415_2h3s9cJsTs_QcQh_7s5s_7c4c_7dAs() {
    assertEquals(
      "7c4c 7dAs QcQh 7s5s",
      Solver.process("texas-holdem 2h3s9cJsTs QcQh 7s5s 7c4c 7dAs"));
  }

  @Test
  public void test_texas_holdem_2416_3h8h9c9hQh_KcJd_7sKs() {
    assertEquals(
      "7sKs KcJd",
      Solver.process("texas-holdem 3h8h9c9hQh KcJd 7sKs"));
  }

  @Test
  public void test_texas_holdem_2417_6h8d9sJsTc_2s4h_JhKh() {
    assertEquals(
      "2s4h JhKh",
      Solver.process("texas-holdem 6h8d9sJsTc 2s4h JhKh"));
  }

  @Test
  public void test_texas_holdem_2418_4h6s8hQsTh_2dJc_7d7s_TsAh_QcKd_8dJs_4d3d() {
    assertEquals(
      "2dJc 4d3d 7d7s 8dJs TsAh QcKd",
      Solver.process("texas-holdem 4h6s8hQsTh 2dJc 7d7s TsAh QcKd 8dJs 4d3d"));
  }

  @Test
  public void test_texas_holdem_2419_4c4h6h7c9c_6c2c_7h8s_9h5c_4s9d_Th8h_Qh7d_KhQd_9s2h() {
    assertEquals(
      "KhQd 7h8s Qh7d 9h5c=9s2h Th8h 6c2c 4s9d",
      Solver.process("texas-holdem 4c4h6h7c9c 6c2c 7h8s 9h5c 4s9d Th8h Qh7d KhQd 9s2h"));
  }

  @Test
  public void test_texas_holdem_2420_2h5s6dKcKh_3c6c_8h7s_4sAd_5h4c_Ks3h_9cQd_7hJs() {
    assertEquals(
      "8h7s 7hJs 9cQd 4sAd 5h4c 3c6c Ks3h",
      Solver.process("texas-holdem 2h5s6dKcKh 3c6c 8h7s 4sAd 5h4c Ks3h 9cQd 7hJs"));
  }

  @Test
  public void test_texas_holdem_2421_2h3h7hJhTs_8sAc_8c6d_5d7s_3c3d() {
    assertEquals(
      "8c6d 8sAc 5d7s 3c3d",
      Solver.process("texas-holdem 2h3h7hJhTs 8sAc 8c6d 5d7s 3c3d"));
  }

  @Test
  public void test_texas_holdem_2422_3d8c8d9cJs_As6c_9d2c_7cKs_Kh6d_5d7d_3c2h_3hTc() {
    assertEquals(
      "5d7d 7cKs=Kh6d As6c 3c2h=3hTc 9d2c",
      Solver.process("texas-holdem 3d8c8d9cJs As6c 9d2c 7cKs Kh6d 5d7d 3c2h 3hTc"));
  }

  @Test
  public void test_texas_holdem_2423_4dQdQhQsTd_5d9h_4cKs_5h3s_3c6d_As6c_Jc2h_8d7c_9cQc_8h7s() {
    assertEquals(
      "5h3s 3c6d 8d7c=8h7s 5d9h Jc2h As6c 4cKs 9cQc",
      Solver.process("texas-holdem 4dQdQhQsTd 5d9h 4cKs 5h3s 3c6d As6c Jc2h 8d7c 9cQc 8h7s"));
  }

  @Test
  public void test_texas_holdem_2424_9d9hAhQcTc_Kd6h_TsKs_Ac8h_2h7c_9cQd_TdKc_Qs2d() {
    assertEquals(
      "2h7c Kd6h TdKc=TsKs Qs2d Ac8h 9cQd",
      Solver.process("texas-holdem 9d9hAhQcTc Kd6h TsKs Ac8h 2h7c 9cQd TdKc Qs2d"));
  }

  @Test
  public void test_texas_holdem_2425_2s4h6d8dJs_3cTs_9s5d_2cJd_6s2d_3d7d_Qd3s_Jc7c_Ah7h() {
    assertEquals(
      "3d7d 9s5d 3cTs Qd3s Ah7h Jc7c 6s2d 2cJd",
      Solver.process("texas-holdem 2s4h6d8dJs 3cTs 9s5d 2cJd 6s2d 3d7d Qd3s Jc7c Ah7h"));
  }

  @Test
  public void test_texas_holdem_2426_4h8h9dKdQd_JsAc_6h2h_6s4d_3c3s() {
    assertEquals(
      "6h2h JsAc 3c3s 6s4d",
      Solver.process("texas-holdem 4h8h9dKdQd JsAc 6h2h 6s4d 3c3s"));
  }

  @Test
  public void test_texas_holdem_2427_2s8dJdQcTc_9c4s_5h2h() {
    assertEquals(
      "5h2h 9c4s",
      Solver.process("texas-holdem 2s8dJdQcTc 9c4s 5h2h"));
  }

  @Test
  public void test_texas_holdem_2428_3d3s5hTcTd_5dJc_3h6d_Jd4c_9c5s_5c7h_Kc7c_4d7s_4h6s() {
    assertEquals(
      "4h6s 4d7s Jd4c Kc7c 5c7h 9c5s 5dJc 3h6d",
      Solver.process("texas-holdem 3d3s5hTcTd 5dJc 3h6d Jd4c 9c5s 5c7h Kc7c 4d7s 4h6s"));
  }

  @Test
  public void test_texas_holdem_2429_3d3h5c7hQd_KdJs_Tc5h_Qs6d() {
    assertEquals(
      "KdJs Tc5h Qs6d",
      Solver.process("texas-holdem 3d3h5c7hQd KdJs Tc5h Qs6d"));
  }

  @Test
  public void test_texas_holdem_2430_3h6sJhQdTh_Td5c_Jd2h_Js3c_KcAd_8d9d_Qs5h_Ac4s() {
    assertEquals(
      "Ac4s Td5c Jd2h Qs5h Js3c 8d9d KcAd",
      Solver.process("texas-holdem 3h6sJhQdTh Td5c Jd2h Js3c KcAd 8d9d Qs5h Ac4s"));
  }

  @Test
  public void test_texas_holdem_2431_5h8h9d9hJs_Jc3d_4sJd_Qd4h_2cTd_9cQh_QcAd_6cKd_As5s() {
    assertEquals(
      "2cTd Qd4h 6cKd QcAd As5s 4sJd=Jc3d 9cQh",
      Solver.process("texas-holdem 5h8h9d9hJs Jc3d 4sJd Qd4h 2cTd 9cQh QcAd 6cKd As5s"));
  }

  @Test
  public void test_texas_holdem_2432_3h8s9c9hJc_6h5h_9dTh_8d3d_8c3s() {
    assertEquals(
      "6h5h 8c3s=8d3d 9dTh",
      Solver.process("texas-holdem 3h8s9c9hJc 6h5h 9dTh 8d3d 8c3s"));
  }

  @Test
  public void test_texas_holdem_2433_3d5d8h9hAc_8c3s_Jc5c_JsKd() {
    assertEquals(
      "JsKd Jc5c 8c3s",
      Solver.process("texas-holdem 3d5d8h9hAc 8c3s Jc5c JsKd"));
  }

  @Test
  public void test_texas_holdem_2434_4d8sAdKsTd_2c4s_7cAs() {
    assertEquals(
      "2c4s 7cAs",
      Solver.process("texas-holdem 4d8sAdKsTd 2c4s 7cAs"));
  }

  @Test
  public void test_texas_holdem_2435_5c5s9cJsKh_AcKc_As3s() {
    assertEquals(
      "As3s AcKc",
      Solver.process("texas-holdem 5c5s9cJsKh AcKc As3s"));
  }

  @Test
  public void test_texas_holdem_2436_3d6c7h8cAc_Qh3c_4hTs_6sKd() {
    assertEquals(
      "4hTs Qh3c 6sKd",
      Solver.process("texas-holdem 3d6c7h8cAc Qh3c 4hTs 6sKd"));
  }

  @Test
  public void test_texas_holdem_2437_3c5s6cAcQs_Jd5d_Qh6h_Td8c_Ts7s_6dJh_KhAd() {
    assertEquals(
      "Ts7s Td8c Jd5d 6dJh KhAd Qh6h",
      Solver.process("texas-holdem 3c5s6cAcQs Jd5d Qh6h Td8c Ts7s 6dJh KhAd"));
  }

  @Test
  public void test_texas_holdem_2438_2h3d5sAsQh_7h3h_Ad4c() {
    assertEquals(
      "7h3h Ad4c",
      Solver.process("texas-holdem 2h3d5sAsQh 7h3h Ad4c"));
  }

  @Test
  public void test_texas_holdem_2439_2d3h8sKsTh_Qh3c_Jd2h_6d3s_8hAs_2cJh_TcKh_7dQd_Js6h() {
    assertEquals(
      "Js6h 7dQd 2cJh=Jd2h 6d3s Qh3c 8hAs TcKh",
      Solver.process("texas-holdem 2d3h8sKsTh Qh3c Jd2h 6d3s 8hAs 2cJh TcKh 7dQd Js6h"));
  }

  @Test
  public void test_texas_holdem_2440_3c5h6dKdKh_3sTd_Qd7d_8d2c_Jc2h_9c2s_Tc7h_Jd4s_Th5c_QcKc() {
    assertEquals(
      "8d2c 9c2s Tc7h Jc2h=Jd4s Qd7d 3sTd Th5c QcKc",
      Solver.process("texas-holdem 3c5h6dKdKh 3sTd Qd7d 8d2c Jc2h 9c2s Tc7h Jd4s Th5c QcKc"));
  }

  @Test
  public void test_texas_holdem_2441_8cAhAsQcQd_7dAc_QhKc_6c7h_2h7c_4s6s_2dJd_Th3s() {
    assertEquals(
      "2h7c=4s6s=6c7h Th3s 2dJd QhKc 7dAc",
      Solver.process("texas-holdem 8cAhAsQcQd 7dAc QhKc 6c7h 2h7c 4s6s 2dJd Th3s"));
  }

  @Test
  public void test_texas_holdem_2442_2c4c5hJsQd_ThTd_6dJd_3sAh_7h6h_6s2s_Ks8s_4s4d_Ac5c_9h8h() {
    assertEquals(
      "7h6h 9h8h Ks8s 6s2s Ac5c ThTd 6dJd 4s4d 3sAh",
      Solver.process("texas-holdem 2c4c5hJsQd ThTd 6dJd 3sAh 7h6h 6s2s Ks8s 4s4d Ac5c 9h8h"));
  }

  @Test
  public void test_texas_holdem_2443_2c8h9hKdTd_Ac7s_2sKh() {
    assertEquals(
      "Ac7s 2sKh",
      Solver.process("texas-holdem 2c8h9hKdTd Ac7s 2sKh"));
  }

  @Test
  public void test_texas_holdem_2444_4c4h9c9sTs_KcAd_2sTd_Ks2c_3h9h_6c8c_Kd3d() {
    assertEquals(
      "6c8c Kd3d=Ks2c KcAd 2sTd 3h9h",
      Solver.process("texas-holdem 4c4h9c9sTs KcAd 2sTd Ks2c 3h9h 6c8c Kd3d"));
  }

  @Test
  public void test_texas_holdem_2445_2h5d6s7c9d_9h5c_AhKc_4s4h() {
    assertEquals(
      "AhKc 4s4h 9h5c",
      Solver.process("texas-holdem 2h5d6s7c9d 9h5c AhKc 4s4h"));
  }

  @Test
  public void test_texas_holdem_2446_2c6sAcKhKs_2sAd_4sTc_5cQd_TsAs_7cTd_5hAh_Kd2d() {
    assertEquals(
      "4sTc 7cTd 5cQd 2sAd=5hAh TsAs Kd2d",
      Solver.process("texas-holdem 2c6sAcKhKs 2sAd 4sTc 5cQd TsAs 7cTd 5hAh Kd2d"));
  }

  @Test
  public void test_texas_holdem_2447_2d5d7hJcJs_Qs3d_Tc6d_6sTd_5hAs() {
    assertEquals(
      "6sTd=Tc6d Qs3d 5hAs",
      Solver.process("texas-holdem 2d5d7hJcJs Qs3d Tc6d 6sTd 5hAs"));
  }

  @Test
  public void test_texas_holdem_2448_3s6d8dJcQh_4h2d_Kh7d_AcKc() {
    assertEquals(
      "4h2d Kh7d AcKc",
      Solver.process("texas-holdem 3s6d8dJcQh 4h2d Kh7d AcKc"));
  }

  @Test
  public void test_texas_holdem_2449_3d5sJdQcTs_7h4c_6c9h_Td6s_Ac2s() {
    assertEquals(
      "7h4c 6c9h Ac2s Td6s",
      Solver.process("texas-holdem 3d5sJdQcTs 7h4c 6c9h Td6s Ac2s"));
  }

  @Test
  public void test_texas_holdem_2450_6c9hKhQhQs_7c8s_9d6h_Qd2s_Ks5s_4s7d_2c3h() {
    assertEquals(
      "2c3h 4s7d 7c8s 9d6h Ks5s Qd2s",
      Solver.process("texas-holdem 6c9hKhQhQs 7c8s 9d6h Qd2s Ks5s 4s7d 2c3h"));
  }

  @Test
  public void test_texas_holdem_2451_2d4c9dKcQd_Qs5c_2c8c_6hQc_7cKd_8s4h() {
    assertEquals(
      "2c8c 8s4h Qs5c 6hQc 7cKd",
      Solver.process("texas-holdem 2d4c9dKcQd Qs5c 2c8c 6hQc 7cKd 8s4h"));
  }

  @Test
  public void test_texas_holdem_2452_2d5c6c8hQc_Qd2s_7d4s_4h2c_Jh6d_Kh5d_5h8c_3cAs_ThTc() {
    assertEquals(
      "3cAs 4h2c Kh5d Jh6d ThTc 5h8c Qd2s 7d4s",
      Solver.process("texas-holdem 2d5c6c8hQc Qd2s 7d4s 4h2c Jh6d Kh5d 5h8c 3cAs ThTc"));
  }

  @Test
  public void test_texas_holdem_2453_2c6s9c9hJc_9s8h_Qh4d_6hTd() {
    assertEquals(
      "Qh4d 6hTd 9s8h",
      Solver.process("texas-holdem 2c6s9c9hJc 9s8h Qh4d 6hTd"));
  }

  @Test
  public void test_texas_holdem_2454_3d6d8dQcTh_5s3h_KcAs_AhQd_5h8c_6c2d_Ks3c_8hTs_Qh4d_2cTc() {
    assertEquals(
      "KcAs 5s3h Ks3c 6c2d 5h8c 2cTc Qh4d AhQd 8hTs",
      Solver.process("texas-holdem 3d6d8dQcTh 5s3h KcAs AhQd 5h8c 6c2d Ks3c 8hTs Qh4d 2cTc"));
  }

  @Test
  public void test_texas_holdem_2455_7c8hAcJsTd_8dJd_QsJc_4d8s_9c2h_9s9h_8c7s() {
    assertEquals(
      "4d8s QsJc 8c7s 8dJd 9c2h=9s9h",
      Solver.process("texas-holdem 7c8hAcJsTd 8dJd QsJc 4d8s 9c2h 9s9h 8c7s"));
  }

  @Test
  public void test_texas_holdem_2456_2c7c7h9dTs_Qd4h_2s8h_QhAh() {
    assertEquals(
      "Qd4h QhAh 2s8h",
      Solver.process("texas-holdem 2c7c7h9dTs Qd4h 2s8h QhAh"));
  }

  @Test
  public void test_texas_holdem_2457_3d9d9hAhJc_QcKd_Qd2d_Ks5c_7h8h_Ts7s_2sKc() {
    assertEquals(
      "7h8h Ts7s Qd2d 2sKc=Ks5c QcKd",
      Solver.process("texas-holdem 3d9d9hAhJc QcKd Qd2d Ks5c 7h8h Ts7s 2sKc"));
  }

  @Test
  public void test_texas_holdem_2458_5c7h9c9dKd_Qd7c_8c4c_7sJs() {
    assertEquals(
      "8c4c 7sJs=Qd7c",
      Solver.process("texas-holdem 5c7h9c9dKd Qd7c 8c4c 7sJs"));
  }

  @Test
  public void test_texas_holdem_2459_4c9hJhKdKs_Ah9s_As9c() {
    assertEquals(
      "Ah9s=As9c",
      Solver.process("texas-holdem 4c9hJhKdKs Ah9s As9c"));
  }

  @Test
  public void test_texas_holdem_2460_6s8d9hJsKd_3sAc_Jc3h_2dJh_8s4d() {
    assertEquals(
      "3sAc 8s4d 2dJh=Jc3h",
      Solver.process("texas-holdem 6s8d9hJsKd 3sAc Jc3h 2dJh 8s4d"));
  }

  @Test
  public void test_texas_holdem_2461_4h5hAcAhTd_3c7s_7hTh_TsJd_Tc2h_4c3h_Jh4s() {
    assertEquals(
      "3c7s 4c3h Jh4s Tc2h TsJd 7hTh",
      Solver.process("texas-holdem 4h5hAcAhTd 3c7s 7hTh TsJd Tc2h 4c3h Jh4s"));
  }

  @Test
  public void test_texas_holdem_2462_7dAdAsJdKs_9s8h_3c7h_6dAc_Ah9h_9cQd() {
    assertEquals(
      "9s8h 9cQd 3c7h 6dAc=Ah9h",
      Solver.process("texas-holdem 7dAdAsJdKs 9s8h 3c7h 6dAc Ah9h 9cQd"));
  }

  @Test
  public void test_texas_holdem_2463_5d6h8hTdTh_AhJh_4c8d_9s4d() {
    assertEquals(
      "9s4d 4c8d AhJh",
      Solver.process("texas-holdem 5d6h8hTdTh AhJh 4c8d 9s4d"));
  }

  @Test
  public void test_texas_holdem_2464_4d8dJsKdTd_5cJh_2c9s() {
    assertEquals(
      "2c9s 5cJh",
      Solver.process("texas-holdem 4d8dJsKdTd 5cJh 2c9s"));
  }

  @Test
  public void test_texas_holdem_2465_2c2d3h8sTd_6h3d_As5c_9s5h_Kd8h_9hJs_4h5s_QdQs_2sJc() {
    assertEquals(
      "4h5s 9s5h 9hJs As5c 6h3d Kd8h QdQs 2sJc",
      Solver.process("texas-holdem 2c2d3h8sTd 6h3d As5c 9s5h Kd8h 9hJs 4h5s QdQs 2sJc"));
  }

  @Test
  public void test_texas_holdem_2466_5s8cJsQsTd_6dQc_5c6h_AdAh_7cAs() {
    assertEquals(
      "7cAs 5c6h 6dQc AdAh",
      Solver.process("texas-holdem 5s8cJsQsTd 6dQc 5c6h AdAh 7cAs"));
  }

  @Test
  public void test_texas_holdem_2467_2h5s8hAsQs_9c5c_9h2c_Jc7h_4s8c_QdAc_Th6d_TcJd_5dTd_5h7d() {
    assertEquals(
      "Th6d Jc7h TcJd 9h2c 5h7d 9c5c 5dTd 4s8c QdAc",
      Solver.process("texas-holdem 2h5s8hAsQs 9c5c 9h2c Jc7h 4s8c QdAc Th6d TcJd 5dTd 5h7d"));
  }

  @Test
  public void test_texas_holdem_2468_2d3h4d5d9h_Qd3c_2sAd() {
    assertEquals(
      "Qd3c 2sAd",
      Solver.process("texas-holdem 2d3h4d5d9h Qd3c 2sAd"));
  }

  @Test
  public void test_texas_holdem_2469_4d4h9dKcQh_3h2s_JdAh_8s5d() {
    assertEquals(
      "3h2s=8s5d JdAh",
      Solver.process("texas-holdem 4d4h9dKcQh 3h2s JdAh 8s5d"));
  }

  @Test
  public void test_texas_holdem_2470_2h6h7c8c9c_Td5h_3c7d_Qh5s_Js2s_As8d_4d4h_6dTc_Kh6s() {
    assertEquals(
      "Js2s 4d4h Kh6s 3c7d As8d Qh5s 6dTc=Td5h",
      Solver.process("texas-holdem 2h6h7c8c9c Td5h 3c7d Qh5s Js2s As8d 4d4h 6dTc Kh6s"));
  }

  @Test
  public void test_texas_holdem_2471_2c7h8dAhJd_Kh5h_QdKs_3h4d_AdQs_5s4h() {
    assertEquals(
      "3h4d 5s4h Kh5h QdKs AdQs",
      Solver.process("texas-holdem 2c7h8dAhJd Kh5h QdKs 3h4d AdQs 5s4h"));
  }

  @Test
  public void test_texas_holdem_2472_2d2s8d8sKd_5d2h_Ts7h_QhKh_3cJd_7s6d_8h5c() {
    assertEquals(
      "3cJd=7s6d=Ts7h QhKh 5d2h 8h5c",
      Solver.process("texas-holdem 2d2s8d8sKd 5d2h Ts7h QhKh 3cJd 7s6d 8h5c"));
  }

  @Test
  public void test_texas_holdem_2473_5c6d9dAcTc_5h8s_4d4s_4c8c() {
    assertEquals(
      "4d4s 5h8s 4c8c",
      Solver.process("texas-holdem 5c6d9dAcTc 5h8s 4d4s 4c8c"));
  }

  @Test
  public void test_texas_holdem_2474_4d7hAsJsQd_6cAc_Kc2c_4s8s_Kd9d_5s9s_3s7s_2h7d() {
    assertEquals(
      "5s9s Kc2c Kd9d 4s8s 2h7d=3s7s 6cAc",
      Solver.process("texas-holdem 4d7hAsJsQd 6cAc Kc2c 4s8s Kd9d 5s9s 3s7s 2h7d"));
  }

  @Test
  public void test_texas_holdem_2475_3d4c8cQcTh_6h8d_7s2c_AsJs() {
    assertEquals(
      "7s2c AsJs 6h8d",
      Solver.process("texas-holdem 3d4c8cQcTh 6h8d 7s2c AsJs"));
  }

  @Test
  public void test_texas_holdem_2476_3c3h4h5d6d_KcJd_JsKd_Jh6s_9sTc_4c9c_7s5c_Qd8d() {
    assertEquals(
      "9sTc Qd8d JsKd=KcJd 4c9c Jh6s 7s5c",
      Solver.process("texas-holdem 3c3h4h5d6d KcJd JsKd Jh6s 9sTc 4c9c 7s5c Qd8d"));
  }

  @Test
  public void test_texas_holdem_2477_7h8s9hJdKc_3sTs_As3d_9dJh_8h4c_TdTh_Qs5c_Ac2h_4dJc() {
    assertEquals(
      "Qs5c Ac2h=As3d 8h4c 4dJc 9dJh 3sTs=TdTh",
      Solver.process("texas-holdem 7h8s9hJdKc 3sTs As3d 9dJh 8h4c TdTh Qs5c Ac2h 4dJc"));
  }

  @Test
  public void test_texas_holdem_2478_4h7sKcKdTs_3h8s_6dQs_3c6s_JcQc() {
    assertEquals(
      "3c6s 3h8s 6dQs JcQc",
      Solver.process("texas-holdem 4h7sKcKdTs 3h8s 6dQs 3c6s JcQc"));
  }

  @Test
  public void test_texas_holdem_2479_2s4hAcQdTc_6sTd_Jc3c_Jd2h() {
    assertEquals(
      "Jc3c Jd2h 6sTd",
      Solver.process("texas-holdem 2s4hAcQdTc 6sTd Jc3c Jd2h"));
  }

  @Test
  public void test_texas_holdem_2480_4h7d8c9cTd_4c6d_7c3c_JdAd_6cKc_KsAs_Ts6s_8d2h_KhAc() {
    assertEquals(
      "KhAc=KsAs 7c3c 8d2h 4c6d=6cKc=Ts6s JdAd",
      Solver.process("texas-holdem 4h7d8c9cTd 4c6d 7c3c JdAd 6cKc KsAs Ts6s 8d2h KhAc"));
  }

  @Test
  public void test_texas_holdem_2481_5d5h6s8cTh_Ad6d_KdQc() {
    assertEquals(
      "KdQc Ad6d",
      Solver.process("texas-holdem 5d5h6s8cTh Ad6d KdQc"));
  }

  @Test
  public void test_texas_holdem_2482_2d2s6d6sKc_9s9h_TcTh_TsAc_4cKs_3c8s_4s4d_6hJs_3h8d_Td2h() {
    assertEquals(
      "3c8s=3h8d TsAc 4s4d 9s9h TcTh 4cKs Td2h 6hJs",
      Solver.process("texas-holdem 2d2s6d6sKc 9s9h TcTh TsAc 4cKs 3c8s 4s4d 6hJs 3h8d Td2h"));
  }

  @Test
  public void test_texas_holdem_2483_6h7hAdKhQc_7d2d_3d5s_9dTs_TcJs_7cQs_6sTd_4sJd() {
    assertEquals(
      "3d5s 9dTs 4sJd 6sTd 7d2d 7cQs TcJs",
      Solver.process("texas-holdem 6h7hAdKhQc 7d2d 3d5s 9dTs TcJs 7cQs 6sTd 4sJd"));
  }

  @Test
  public void test_texas_holdem_2484_3c7c9sAdAh_Ks9h_Th6c_8h7h_Ts4s_9cAc_2s7s_8d2d_5s7d() {
    assertEquals(
      "8d2d Th6c=Ts4s 2s7s=5s7d=8h7h Ks9h 9cAc",
      Solver.process("texas-holdem 3c7c9sAdAh Ks9h Th6c 8h7h Ts4s 9cAc 2s7s 8d2d 5s7d"));
  }

  @Test
  public void test_texas_holdem_2485_7d8dAcQsTc_4hKc_AsJd_Kd2s_9s2h_Ts9c() {
    assertEquals(
      "9s2h 4hKc=Kd2s Ts9c AsJd",
      Solver.process("texas-holdem 7d8dAcQsTc 4hKc AsJd Kd2s 9s2h Ts9c"));
  }

  @Test
  public void test_texas_holdem_2486_4cKcKhKsQc_5h9s_9c2d_Ad5s_4d6d_TsKd_3dQs_Tc8d_Qd8c() {
    assertEquals(
      "5h9s=9c2d Tc8d Ad5s 4d6d 3dQs=Qd8c TsKd",
      Solver.process("texas-holdem 4cKcKhKsQc 5h9s 9c2d Ad5s 4d6d TsKd 3dQs Tc8d Qd8c"));
  }

  @Test
  public void test_texas_holdem_2487_3c5s6h6sQs_9sJh_4c6c() {
    assertEquals(
      "9sJh 4c6c",
      Solver.process("texas-holdem 3c5s6h6sQs 9sJh 4c6c"));
  }

  @Test
  public void test_texas_holdem_2488_4h6hJhJsKh_5h8d_QhKc_2c9s_3d3s_Ad3c_Kd2d_5s6s_ThTs() {
    assertEquals(
      "2c9s Ad3c 3d3s 5s6s Kd2d 5h8d ThTs QhKc",
      Solver.process("texas-holdem 4h6hJhJsKh 5h8d QhKc 2c9s 3d3s Ad3c Kd2d 5s6s ThTs"));
  }

  @Test
  public void test_texas_holdem_2489_3c3d4d4s5h_2cTd_Ts9s_7h6d_QcAs_ThJs_Tc9c_8hAd_4cKd_7c9d() {
    assertEquals(
      "7c9d 2cTd=Tc9c=Ts9s ThJs 8hAd=QcAs 7h6d 4cKd",
      Solver.process("texas-holdem 3c3d4d4s5h 2cTd Ts9s 7h6d QcAs ThJs Tc9c 8hAd 4cKd 7c9d"));
  }

  @Test
  public void test_texas_holdem_2490_2d5h5s9sAc_KdQd_Tc7c_9h4c_Jd6c_7hQs_ThKh() {
    assertEquals(
      "Tc7c Jd6c 7hQs ThKh KdQd 9h4c",
      Solver.process("texas-holdem 2d5h5s9sAc KdQd Tc7c 9h4c Jd6c 7hQs ThKh"));
  }

  @Test
  public void test_texas_holdem_2491_2h4c7sKdQs_Th6s_Ac5s_Qc7h_7c9h_8h8c_5dJs_9cTc() {
    assertEquals(
      "Th6s 9cTc 5dJs Ac5s 7c9h 8h8c Qc7h",
      Solver.process("texas-holdem 2h4c7sKdQs Th6s Ac5s Qc7h 7c9h 8h8c 5dJs 9cTc"));
  }

  @Test
  public void test_texas_holdem_2492_3d3s5cAhJh_9h4s_8dKc_5sJs_2d7c_KhKd_2cAs_7d5h_JdQd() {
    assertEquals(
      "2d7c 9h4s 8dKc 7d5h JdQd 5sJs KhKd 2cAs",
      Solver.process("texas-holdem 3d3s5cAhJh 9h4s 8dKc 5sJs 2d7c KhKd 2cAs 7d5h JdQd"));
  }

  @Test
  public void test_texas_holdem_2493_6d8c9c9hAc_8hTs_8d5s_Ah7s_Th3c_2hJh_TcJc_6h4s_3h4c_Kh4d() {
    assertEquals(
      "3h4c Th3c 2hJh Kh4d 6h4s 8d5s=8hTs Ah7s TcJc",
      Solver.process("texas-holdem 6d8c9c9hAc 8hTs 8d5s Ah7s Th3c 2hJh TcJc 6h4s 3h4c Kh4d"));
  }

  @Test
  public void test_texas_holdem_2494_3c8c9sJdKc_2c5c_4h9c_8d3s_9h6c_5hQd_4s3h() {
    assertEquals(
      "5hQd 4s3h 4h9c=9h6c 8d3s 2c5c",
      Solver.process("texas-holdem 3c8c9sJdKc 2c5c 4h9c 8d3s 9h6c 5hQd 4s3h"));
  }

  @Test
  public void test_texas_holdem_2495_7h8sJhQcQh_6d5c_Qs7s_Ad3d_3hKd() {
    assertEquals(
      "6d5c 3hKd Ad3d Qs7s",
      Solver.process("texas-holdem 7h8sJhQcQh 6d5c Qs7s Ad3d 3hKd"));
  }

  @Test
  public void test_texas_holdem_2496_2c2s4c4h9h_As6d_KhKc_Jd7s_Qh8s_Qd9d_4d5h() {
    assertEquals(
      "Jd7s Qh8s As6d Qd9d KhKc 4d5h",
      Solver.process("texas-holdem 2c2s4c4h9h As6d KhKc Jd7s Qh8s Qd9d 4d5h"));
  }

  @Test
  public void test_texas_holdem_2497_4c7h8dJhJs_9d8c_4d3c_4h5s_Th3h() {
    assertEquals(
      "Th3h 4d3c=4h5s 9d8c",
      Solver.process("texas-holdem 4c7h8dJhJs 9d8c 4d3c 4h5s Th3h"));
  }

  @Test
  public void test_texas_holdem_2498_6hJdJhQsTs_4s4d_Qh3d() {
    assertEquals(
      "4s4d Qh3d",
      Solver.process("texas-holdem 6hJdJhQsTs 4s4d Qh3d"));
  }

  @Test
  public void test_texas_holdem_2499_3h4d9dQsTd_AhTc_2c7d_5h7s_3sAc_JdKd_Qc8h_TsQh_4sJs_6d3c() {
    assertEquals(
      "2c7d 5h7s 6d3c 3sAc 4sJs AhTc Qc8h TsQh JdKd",
      Solver.process("texas-holdem 3h4d9dQsTd AhTc 2c7d 5h7s 3sAc JdKd Qc8h TsQh 4sJs 6d3c"));
  }

}
