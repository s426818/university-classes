
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver20HiddenTest {


  @Test
  public void test_texas_holdem_5000_6h7h8c8dQc_3s9h_Ts5c_AhKs_8s3c_6d4h() {
    assertEquals(
      "3s9h Ts5c AhKs 6d4h 8s3c",
      Solver.process("texas-holdem 6h7h8c8dQc 3s9h Ts5c AhKs 8s3c 6d4h"));
  }

  @Test
  public void test_texas_holdem_5001_2c8c9dJdTd_Qd7c_8s8d_2s4d() {
    assertEquals(
      "2s4d 8s8d Qd7c",
      Solver.process("texas-holdem 2c8c9dJdTd Qd7c 8s8d 2s4d"));
  }

  @Test
  public void test_texas_holdem_5002_6c8c8s9hAc_5sQc_4h2d_QdAs_6h7c_4sTh_QsKd_7hKs_2hJd_9sTd() {
    assertEquals(
      "4h2d 4sTh 2hJd 5sQc 7hKs QsKd 6h7c 9sTd QdAs",
      Solver.process("texas-holdem 6c8c8s9hAc 5sQc 4h2d QdAs 6h7c 4sTh QsKd 7hKs 2hJd 9sTd"));
  }

  @Test
  public void test_texas_holdem_5003_4d7dAsJcJh_Ac4h_Qd2c_2hAh_6s3s_Ad2d_5dTs() {
    assertEquals(
      "6s3s 5dTs Qd2c 2hAh=Ac4h=Ad2d",
      Solver.process("texas-holdem 4d7dAsJcJh Ac4h Qd2c 2hAh 6s3s Ad2d 5dTs"));
  }

  @Test
  public void test_texas_holdem_5004_3d3h4d5dAs_3cAc_7d9c_Ah8s() {
    assertEquals(
      "7d9c Ah8s 3cAc",
      Solver.process("texas-holdem 3d3h4d5dAs 3cAc 7d9c Ah8s"));
  }

  @Test
  public void test_texas_holdem_5005_4c4h7hAhJh_Jd8d_3hAd_9sQc_Kd7s() {
    assertEquals(
      "9sQc Kd7s Jd8d 3hAd",
      Solver.process("texas-holdem 4c4h7hAhJh Jd8d 3hAd 9sQc Kd7s"));
  }

  @Test
  public void test_texas_holdem_5006_2d3c3h7dKh_7sTh_QcAc_9h8h_3d5d_4cKd_8s2c_9sJh_Jd8c() {
    assertEquals(
      "9h8h Jd8c 9sJh QcAc 8s2c 7sTh 4cKd 3d5d",
      Solver.process("texas-holdem 2d3c3h7dKh 7sTh QcAc 9h8h 3d5d 4cKd 8s2c 9sJh Jd8c"));
  }

  @Test
  public void test_texas_holdem_5007_3d6d8hKcQs_7dAd_JsQd_7c5c_TsKd() {
    assertEquals(
      "7c5c 7dAd JsQd TsKd",
      Solver.process("texas-holdem 3d6d8hKcQs 7dAd JsQd 7c5c TsKd"));
  }

  @Test
  public void test_texas_holdem_5008_2c4d6h9cKc_5s7s_KsKh_6s4s_Ac2s() {
    assertEquals(
      "5s7s Ac2s 6s4s KsKh",
      Solver.process("texas-holdem 2c4d6h9cKc 5s7s KsKh 6s4s Ac2s"));
  }

  @Test
  public void test_texas_holdem_5009_2s4s9cThTs_2c3c_Qs4c_5s2h_8c8h_4hAc_AhQc_Jh6h() {
    assertEquals(
      "Jh6h AhQc 2c3c=5s2h Qs4c 4hAc 8c8h",
      Solver.process("texas-holdem 2s4s9cThTs 2c3c Qs4c 5s2h 8c8h 4hAc AhQc Jh6h"));
  }

  @Test
  public void test_texas_holdem_5010_8hAdAsJdTs_4h5d_Kc3s_JcTh_7c8c_6c4s() {
    assertEquals(
      "4h5d=6c4s Kc3s 7c8c JcTh",
      Solver.process("texas-holdem 8hAdAsJdTs 4h5d Kc3s JcTh 7c8c 6c4s"));
  }

  @Test
  public void test_texas_holdem_5011_4d7c9cJsTc_6c9d_9sQd() {
    assertEquals(
      "6c9d 9sQd",
      Solver.process("texas-holdem 4d7c9cJsTc 6c9d 9sQd"));
  }

  @Test
  public void test_texas_holdem_5012_4d4s5hAcTs_3cQs_6s8s_5d6c_Ah5c_9c2c_7sAd_9s4h() {
    assertEquals(
      "6s8s 9c2c 3cQs 5d6c 7sAd Ah5c 9s4h",
      Solver.process("texas-holdem 4d4s5hAcTs 3cQs 6s8s 5d6c Ah5c 9c2c 7sAd 9s4h"));
  }

  @Test
  public void test_texas_holdem_5013_2h7s9d9hKc_3hQs_5h5d() {
    assertEquals(
      "3hQs 5h5d",
      Solver.process("texas-holdem 2h7s9d9hKc 3hQs 5h5d"));
  }

  @Test
  public void test_texas_holdem_5014_2d4hAsQcTh_Ah5s_5c5d_9h4d_2cKc_7dKs() {
    assertEquals(
      "7dKs 2cKc 9h4d 5c5d Ah5s",
      Solver.process("texas-holdem 2d4hAsQcTh Ah5s 5c5d 9h4d 2cKc 7dKs"));
  }

  @Test
  public void test_texas_holdem_5015_2c5d5h8sAd_9c2d_9hJs_8c3d() {
    assertEquals(
      "9hJs 9c2d 8c3d",
      Solver.process("texas-holdem 2c5d5h8sAd 9c2d 9hJs 8c3d"));
  }

  @Test
  public void test_texas_holdem_5016_6d6h8sQdTs_Ks2d_9cQs_ThJc_8d7s() {
    assertEquals(
      "Ks2d 8d7s ThJc 9cQs",
      Solver.process("texas-holdem 6d6h8sQdTs Ks2d 9cQs ThJc 8d7s"));
  }

  @Test
  public void test_texas_holdem_5017_2c3h4s8sAh_3dQs_4cQd_8c2d_Jc3c_Td4d_8h4h_QhKc_JhTs_5h3s() {
    assertEquals(
      "JhTs QhKc Jc3c 3dQs Td4d 4cQd 8c2d 8h4h 5h3s",
      Solver.process("texas-holdem 2c3h4s8sAh 3dQs 4cQd 8c2d Jc3c Td4d 8h4h QhKc JhTs 5h3s"));
  }

  @Test
  public void test_texas_holdem_5018_3s4h5s8sJs_AsTc_AcKh_9h8c_TdAh_5c2d_6c6d() {
    assertEquals(
      "TdAh AcKh 5c2d 6c6d 9h8c AsTc",
      Solver.process("texas-holdem 3s4h5s8sJs AsTc AcKh 9h8c TdAh 5c2d 6c6d"));
  }

  @Test
  public void test_texas_holdem_5019_2h4d5c6hKd_7s5s_Jh4h() {
    assertEquals(
      "Jh4h 7s5s",
      Solver.process("texas-holdem 2h4d5c6hKd 7s5s Jh4h"));
  }

  @Test
  public void test_texas_holdem_5020_4c6h8cJsKs_3hJd_6dQh() {
    assertEquals(
      "6dQh 3hJd",
      Solver.process("texas-holdem 4c6h8cJsKs 3hJd 6dQh"));
  }

  @Test
  public void test_texas_holdem_5021_4s6h8sJhTs_2s3h_8cKc_3s9s_AhAc_7h3c_Jd8h_3d7c() {
    assertEquals(
      "2s3h 3d7c=7h3c 8cKc AhAc Jd8h 3s9s",
      Solver.process("texas-holdem 4s6h8sJhTs 2s3h 8cKc 3s9s AhAc 7h3c Jd8h 3d7c"));
  }

  @Test
  public void test_texas_holdem_5022_2s7sAhJcTd_2hAd_Ts9c_Kc8h_3c7h() {
    assertEquals(
      "Kc8h 3c7h Ts9c 2hAd",
      Solver.process("texas-holdem 2s7sAhJcTd 2hAd Ts9c Kc8h 3c7h"));
  }

  @Test
  public void test_texas_holdem_5023_2c9sJsKcKd_ThQh_7dTs_TdKs_4c7h_Qd3c() {
    assertEquals(
      "4c7h 7dTs Qd3c TdKs ThQh",
      Solver.process("texas-holdem 2c9sJsKcKd ThQh 7dTs TdKs 4c7h Qd3c"));
  }

  @Test
  public void test_texas_holdem_5024_2h4c6hAhTd_2s3h_9hTh_3s3c_5s7s_8c2d_6d4d_3d5c_5hQs_8hKc() {
    assertEquals(
      "5s7s 5hQs 8hKc 2s3h 8c2d 3s3c 6d4d 3d5c 9hTh",
      Solver.process("texas-holdem 2h4c6hAhTd 2s3h 9hTh 3s3c 5s7s 8c2d 6d4d 3d5c 5hQs 8hKc"));
  }

  @Test
  public void test_texas_holdem_5025_3s5h8h8sKs_Qh2s_JcQd_7s9h_6c8c_7d6h_8d3h() {
    assertEquals(
      "7d6h 7s9h Qh2s JcQd 6c8c 8d3h",
      Solver.process("texas-holdem 3s5h8h8sKs Qh2s JcQd 7s9h 6c8c 7d6h 8d3h"));
  }

  @Test
  public void test_texas_holdem_5026_5h6cAsQhQs_Tc8c_4dKd_5d2s_3cTh_Ah8h_5s3s_9h2h() {
    assertEquals(
      "9h2h 3cTh Tc8c 4dKd 5d2s=5s3s Ah8h",
      Solver.process("texas-holdem 5h6cAsQhQs Tc8c 4dKd 5d2s 3cTh Ah8h 5s3s 9h2h"));
  }

  @Test
  public void test_texas_holdem_5027_4s6h9sAdAh_Qh3c_9h3s_6cTd_4hKd_Kc2s_JcTh() {
    assertEquals(
      "JcTh Qh3c Kc2s 4hKd 6cTd 9h3s",
      Solver.process("texas-holdem 4s6h9sAdAh Qh3c 9h3s 6cTd 4hKd Kc2s JcTh"));
  }

  @Test
  public void test_texas_holdem_5028_2c3h4h7hQd_8c5c_3d7d_4cTs_Kc9s_ThQs_Jd6c_6h5d_6s7c() {
    assertEquals(
      "8c5c Jd6c Kc9s 4cTs 6s7c ThQs 3d7d 6h5d",
      Solver.process("texas-holdem 2c3h4h7hQd 8c5c 3d7d 4cTs Kc9s ThQs Jd6c 6h5d 6s7c"));
  }

  @Test
  public void test_texas_holdem_5029_2d7h9dQcTs_Qd5c_3d4d_5s3h_7c9h_Qh9s_JcKh() {
    assertEquals(
      "3d4d 5s3h Qd5c 7c9h Qh9s JcKh",
      Solver.process("texas-holdem 2d7h9dQcTs Qd5c 3d4d 5s3h 7c9h Qh9s JcKh"));
  }

  @Test
  public void test_texas_holdem_5030_3h4h6sJdJh_4sTh_Qd9d_8h7h_Tc9s() {
    assertEquals(
      "Tc9s Qd9d 4sTh 8h7h",
      Solver.process("texas-holdem 3h4h6sJdJh 4sTh Qd9d 8h7h Tc9s"));
  }

  @Test
  public void test_texas_holdem_5031_3s5d9cKhQs_6d2d_Ad4d_Kc4h_Jd7d_Js4c_8h2c_TdQd_2hKs() {
    assertEquals(
      "6d2d 8h2c Js4c Jd7d Ad4d TdQd 2hKs=Kc4h",
      Solver.process("texas-holdem 3s5d9cKhQs 6d2d Ad4d Kc4h Jd7d Js4c 8h2c TdQd 2hKs"));
  }

  @Test
  public void test_texas_holdem_5032_2s5s9hJcJd_Th9c_6cAh_Tc5c_As7c_KsQc_6h4h() {
    assertEquals(
      "6h4h KsQc 6cAh As7c Tc5c Th9c",
      Solver.process("texas-holdem 2s5s9hJcJd Th9c 6cAh Tc5c As7c KsQc 6h4h"));
  }

  @Test
  public void test_texas_holdem_5033_2d4h5h8sQh_3h7c_6sAd_5d4c_JsKd_7dQc_AsTh() {
    assertEquals(
      "3h7c JsKd 6sAd AsTh 7dQc 5d4c",
      Solver.process("texas-holdem 2d4h5h8sQh 3h7c 6sAd 5d4c JsKd 7dQc AsTh"));
  }

  @Test
  public void test_texas_holdem_5034_3c7h9sJsKd_Jh7s_TdJc_Qh4d_4c2h_5dAc_3h2s_8s2c() {
    assertEquals(
      "4c2h 8s2c Qh4d 5dAc 3h2s TdJc Jh7s",
      Solver.process("texas-holdem 3c7h9sJsKd Jh7s TdJc Qh4d 4c2h 5dAc 3h2s 8s2c"));
  }

  @Test
  public void test_texas_holdem_5035_2s8cJdJhTh_3c3s_Kh9c_2hAh_Kc6c_As8d_7s8s_2c3d_Qd4c_2dTc() {
    assertEquals(
      "Qd4c Kc6c Kh9c 2c3d 2hAh 3c3s 7s8s As8d 2dTc",
      Solver.process("texas-holdem 2s8cJdJhTh 3c3s Kh9c 2hAh Kc6c As8d 7s8s 2c3d Qd4c 2dTc"));
  }

  @Test
  public void test_texas_holdem_5036_4d8dJsKhQh_2c5h_Kc2h_5s9s_4s7d_9d9c_AsAh() {
    assertEquals(
      "2c5h 5s9s 4s7d 9d9c Kc2h AsAh",
      Solver.process("texas-holdem 4d8dJsKhQh 2c5h Kc2h 5s9s 4s7d 9d9c AsAh"));
  }

  @Test
  public void test_texas_holdem_5037_3c4s5c7hTs_Qd5d_8dAc_7cJc_QcQs_Js8h() {
    assertEquals(
      "Js8h 8dAc Qd5d 7cJc QcQs",
      Solver.process("texas-holdem 3c4s5c7hTs Qd5d 8dAc 7cJc QcQs Js8h"));
  }

  @Test
  public void test_texas_holdem_5038_3c6d8hAcTd_8c2s_6s5s_6hQs_2hJh_9c3h() {
    assertEquals(
      "2hJh 9c3h 6s5s 6hQs 8c2s",
      Solver.process("texas-holdem 3c6d8hAcTd 8c2s 6s5s 6hQs 2hJh 9c3h"));
  }

  @Test
  public void test_texas_holdem_5039_2s3h9cAcKd_6cTs_9d8h_3cQs_Jd7h_7sQd_Th2h_5h4h() {
    assertEquals(
      "6cTs Jd7h 7sQd Th2h 3cQs 9d8h 5h4h",
      Solver.process("texas-holdem 2s3h9cAcKd 6cTs 9d8h 3cQs Jd7h 7sQd Th2h 5h4h"));
  }

  @Test
  public void test_texas_holdem_5040_4h7hAhJcTh_3c6d_8s5s_Js2h_Qh9h_9d7c_Jh9s_KhAs_8c3s() {
    assertEquals(
      "3c6d 8c3s=8s5s 9d7c Js2h Jh9s Qh9h KhAs",
      Solver.process("texas-holdem 4h7hAhJcTh 3c6d 8s5s Js2h Qh9h 9d7c Jh9s KhAs 8c3s"));
  }

  @Test
  public void test_texas_holdem_5041_6s7cAcAdJd_4hTs_5c9c_2c3c_5hTc_AhAs_Kd6c_Td4s() {
    assertEquals(
      "2c3c 5c9c 4hTs=5hTc=Td4s Kd6c AhAs",
      Solver.process("texas-holdem 6s7cAcAdJd 4hTs 5c9c 2c3c 5hTc AhAs Kd6c Td4s"));
  }

  @Test
  public void test_texas_holdem_5042_4c6h9cTcTd_8sAc_TsQc_9d3d_Js3h() {
    assertEquals(
      "Js3h 8sAc 9d3d TsQc",
      Solver.process("texas-holdem 4c6h9cTcTd 8sAc TsQc 9d3d Js3h"));
  }

  @Test
  public void test_texas_holdem_5043_3h5s8dQcQh_JhTs_7h9s_9c5c() {
    assertEquals(
      "7h9s JhTs 9c5c",
      Solver.process("texas-holdem 3h5s8dQcQh JhTs 7h9s 9c5c"));
  }

  @Test
  public void test_texas_holdem_5044_6d6hAdAsQh_2c5c_8c7d_2h5s_TdJc_3h7c_QsKd_4sJs() {
    assertEquals(
      "2c5c=2h5s=3h7c=4sJs=8c7d=TdJc QsKd",
      Solver.process("texas-holdem 6d6hAdAsQh 2c5c 8c7d 2h5s TdJc 3h7c QsKd 4sJs"));
  }

  @Test
  public void test_texas_holdem_5045_4d4sAsThTs_5s9s_8h9c() {
    assertEquals(
      "8h9c 5s9s",
      Solver.process("texas-holdem 4d4sAsThTs 5s9s 8h9c"));
  }

  @Test
  public void test_texas_holdem_5046_2s4c4d5hAs_4sTh_Qs6h_9c5c_6sTc_Ac9s_8cQh_5s7d_7h3c() {
    assertEquals(
      "6sTc Qs6h 8cQh 5s7d=9c5c Ac9s 4sTh 7h3c",
      Solver.process("texas-holdem 2s4c4d5hAs 4sTh Qs6h 9c5c 6sTc Ac9s 8cQh 5s7d 7h3c"));
  }

  @Test
  public void test_texas_holdem_5047_5s8sKhQdTc_Qh3h_6d7c_2c9h_Ac3d_9c4c_8h7d_Qs7h() {
    assertEquals(
      "6d7c 2c9h=9c4c Ac3d 8h7d Qh3h=Qs7h",
      Solver.process("texas-holdem 5s8sKhQdTc Qh3h 6d7c 2c9h Ac3d 9c4c 8h7d Qs7h"));
  }

  @Test
  public void test_texas_holdem_5048_4c4d9sKdQd_5dJc_Td9c_Tc9d() {
    assertEquals(
      "5dJc Tc9d=Td9c",
      Solver.process("texas-holdem 4c4d9sKdQd 5dJc Td9c Tc9d"));
  }

  @Test
  public void test_texas_holdem_5049_2c5h7h9hQs_9s2h_Qh4s_ThJs_Qc3c_4cTd_KsAc_8h2s() {
    assertEquals(
      "4cTd ThJs KsAc 8h2s Qc3c=Qh4s 9s2h",
      Solver.process("texas-holdem 2c5h7h9hQs 9s2h Qh4s ThJs Qc3c 4cTd KsAc 8h2s"));
  }

  @Test
  public void test_texas_holdem_5050_3c6h7c8hAh_9hTd_7d4c_4sJs_7s2s_9c5d_QhJh_9d5c_Jc9s_2hAd() {
    assertEquals(
      "4sJs Jc9s 7d4c=7s2s 2hAd 9c5d=9d5c 9hTd QhJh",
      Solver.process("texas-holdem 3c6h7c8hAh 9hTd 7d4c 4sJs 7s2s 9c5d QhJh 9d5c Jc9s 2hAd"));
  }

  @Test
  public void test_texas_holdem_5051_3c4s6h9sAd_9d3d_Jd8h_Ac8c_7c2d_QcTs_Kh7s_JhQh_9h2c_2sQs() {
    assertEquals(
      "7c2d Jd8h 2sQs QcTs JhQh Kh7s 9h2c Ac8c 9d3d",
      Solver.process("texas-holdem 3c4s6h9sAd 9d3d Jd8h Ac8c 7c2d QcTs Kh7s JhQh 9h2c 2sQs"));
  }

  @Test
  public void test_texas_holdem_5052_6c6d7cJdKd_4d7h_Ks8s_6s4c_3sJs_5d3d() {
    assertEquals(
      "4d7h 3sJs Ks8s 6s4c 5d3d",
      Solver.process("texas-holdem 6c6d7cJdKd 4d7h Ks8s 6s4c 3sJs 5d3d"));
  }

  @Test
  public void test_texas_holdem_5053_2s3s6cJcJd_5dJh_5s6h_8h4c_4sQd_6s4h_8cAh() {
    assertEquals(
      "8h4c 4sQd 8cAh 6s4h 5s6h 5dJh",
      Solver.process("texas-holdem 2s3s6cJcJd 5dJh 5s6h 8h4c 4sQd 6s4h 8cAh"));
  }

  @Test
  public void test_texas_holdem_5054_2s8c8hQsTc_4c6c_7h8d_4hKh_3dJh_Qh5s_Js5c_Jc3h_6sTh() {
    assertEquals(
      "4c6c 3dJh=Jc3h=Js5c 4hKh 6sTh Qh5s 7h8d",
      Solver.process("texas-holdem 2s8c8hQsTc 4c6c 7h8d 4hKh 3dJh Qh5s Js5c Jc3h 6sTh"));
  }

  @Test
  public void test_texas_holdem_5055_2s3h3s7s8d_AsAd_9d2h_8hJc_Jh8c_Tc5d_TdQh_5h9h_Th7d() {
    assertEquals(
      "5h9h Tc5d TdQh 9d2h Th7d 8hJc=Jh8c AsAd",
      Solver.process("texas-holdem 2s3h3s7s8d AsAd 9d2h 8hJc Jh8c Tc5d TdQh 5h9h Th7d"));
  }

  @Test
  public void test_texas_holdem_5056_3d6dAcJsQc_Kd2c_4c8h_7h6c_7c2d_JdTc_3h8c_QsAd_4dJh() {
    assertEquals(
      "7c2d 4c8h Kd2c 3h8c 7h6c 4dJh JdTc QsAd",
      Solver.process("texas-holdem 3d6dAcJsQc Kd2c 4c8h 7h6c 7c2d JdTc 3h8c QsAd 4dJh"));
  }

  @Test
  public void test_texas_holdem_5057_5h6hQcTcTs_9d4c_Jc4s_8s7c_7d2s() {
    assertEquals(
      "7d2s 8s7c 9d4c Jc4s",
      Solver.process("texas-holdem 5h6hQcTcTs 9d4c Jc4s 8s7c 7d2s"));
  }

  @Test
  public void test_texas_holdem_5058_2s3d4sJsTs_Kc6d_QcAc_2dKh_5sTc_AsJd_JhKs_7hQd_9h3h_8d3c() {
    assertEquals(
      "7hQd Kc6d QcAc 2dKh 8d3c 9h3h 5sTc JhKs AsJd",
      Solver.process("texas-holdem 2s3d4sJsTs Kc6d QcAc 2dKh 5sTc AsJd JhKs 7hQd 9h3h 8d3c"));
  }

  @Test
  public void test_texas_holdem_5059_3d5c5sAdKd_4c4h_2s3c_AhKs_4d8s_7s6s_Tc2c_QhAc_7cJs_3s6d() {
    assertEquals(
      "7s6s 4d8s Tc2c 7cJs 2s3c=3s6d 4c4h QhAc AhKs",
      Solver.process("texas-holdem 3d5c5sAdKd 4c4h 2s3c AhKs 4d8s 7s6s Tc2c QhAc 7cJs 3s6d"));
  }

  @Test
  public void test_texas_holdem_5060_5d6h9c9dKs_6s8d_5c8h_Qd4h_3hJs_QhJh() {
    assertEquals(
      "3hJs Qd4h QhJh 5c8h 6s8d",
      Solver.process("texas-holdem 5d6h9c9dKs 6s8d 5c8h Qd4h 3hJs QhJh"));
  }

  @Test
  public void test_texas_holdem_5061_3s5c7h8hQs_8sJh_KhJc_2s7c_4sAs() {
    assertEquals(
      "KhJc 4sAs 2s7c 8sJh",
      Solver.process("texas-holdem 3s5c7h8hQs 8sJh KhJc 2s7c 4sAs"));
  }

  @Test
  public void test_texas_holdem_5062_2c7sKcTcTh_5cJh_9s7h_6c4s_3h3s() {
    assertEquals(
      "6c4s 5cJh 3h3s 9s7h",
      Solver.process("texas-holdem 2c7sKcTcTh 5cJh 9s7h 6c4s 3h3s"));
  }

  @Test
  public void test_texas_holdem_5063_2d5c7dAcTd_Ad5d_TcKc() {
    assertEquals(
      "TcKc Ad5d",
      Solver.process("texas-holdem 2d5c7dAcTd Ad5d TcKc"));
  }

  @Test
  public void test_texas_holdem_5064_4h5sAdAsTc_2hJd_Qs5d_5cJc_Jh6d_8cTs_2c9c_9d8h_8sTd() {
    assertEquals(
      "2c9c 9d8h 2hJd Jh6d 5cJc Qs5d 8cTs=8sTd",
      Solver.process("texas-holdem 4h5sAdAsTc 2hJd Qs5d 5cJc Jh6d 8cTs 2c9c 9d8h 8sTd"));
  }

  @Test
  public void test_texas_holdem_5065_3d3hQcQdQh_6s8s_6c8h_9s4s_Ac8d_2cKd_Jh3s() {
    assertEquals(
      "2cKd=6c8h=6s8s=9s4s=Ac8d=Jh3s",
      Solver.process("texas-holdem 3d3hQcQdQh 6s8s 6c8h 9s4s Ac8d 2cKd Jh3s"));
  }

  @Test
  public void test_texas_holdem_5066_2c3c5d6sQs_As2h_3s4c_JsTs_4dQh_7hJd_Tc5h_8d3d() {
    assertEquals(
      "7hJd JsTs As2h 8d3d Tc5h 3s4c=4dQh",
      Solver.process("texas-holdem 2c3c5d6sQs As2h 3s4c JsTs 4dQh 7hJd Tc5h 8d3d"));
  }

  @Test
  public void test_texas_holdem_5067_3h5d6d8d8s_2s6c_7sTc_2c5s_Ah6h_5hJd() {
    assertEquals(
      "7sTc 2c5s 5hJd 2s6c Ah6h",
      Solver.process("texas-holdem 3h5d6d8d8s 2s6c 7sTc 2c5s Ah6h 5hJd"));
  }

  @Test
  public void test_texas_holdem_5068_2s4s8hAsJs_7sKc_Ks5h_TcJd_7h9h_5dAd_Ts3c_QsJc_8sQd() {
    assertEquals(
      "7h9h TcJd 5dAd 7sKc 8sQd Ts3c QsJc Ks5h",
      Solver.process("texas-holdem 2s4s8hAsJs 7sKc Ks5h TcJd 7h9h 5dAd Ts3c QsJc 8sQd"));
  }

  @Test
  public void test_texas_holdem_5069_3s4sKcTdTs_8sKd_7d9s() {
    assertEquals(
      "7d9s 8sKd",
      Solver.process("texas-holdem 3s4sKcTdTs 8sKd 7d9s"));
  }

  @Test
  public void test_texas_holdem_5070_2h7s9dJsQd_3d6h_AhTh_Jc3s_Jd3h_TdQh_8s9s_6c2c() {
    assertEquals(
      "3d6h AhTh 6c2c 8s9s Jc3s=Jd3h TdQh",
      Solver.process("texas-holdem 2h7s9dJsQd 3d6h AhTh Jc3s Jd3h TdQh 8s9s 6c2c"));
  }

  @Test
  public void test_texas_holdem_5071_3d5d6c7cJh_Qd6s_JsKh_Ah2c_6h8c_2sAd_9h4h_4dJd() {
    assertEquals(
      "2sAd=Ah2c 6h8c Qd6s JsKh 4dJd=9h4h",
      Solver.process("texas-holdem 3d5d6c7cJh Qd6s JsKh Ah2c 6h8c 2sAd 9h4h 4dJd"));
  }

  @Test
  public void test_texas_holdem_5072_AcJhJsQsTh_6c3c_4d5s_8s9d_2d5c_6d2s() {
    assertEquals(
      "2d5c=4d5s=6c3c=6d2s 8s9d",
      Solver.process("texas-holdem AcJhJsQsTh 6c3c 4d5s 8s9d 2d5c 6d2s"));
  }

  @Test
  public void test_texas_holdem_5073_4c8h9cAdKh_7s2h_2c5c_9sQh_JdKs_JcAh_Qd7h_8d2d() {
    assertEquals(
      "2c5c 7s2h Qd7h 8d2d 9sQh JdKs JcAh",
      Solver.process("texas-holdem 4c8h9cAdKh 7s2h 2c5c 9sQh JdKs JcAh Qd7h 8d2d"));
  }

  @Test
  public void test_texas_holdem_5074_3d6d7d9hAs_6c6s_4dAh_7s8h() {
    assertEquals(
      "7s8h 4dAh 6c6s",
      Solver.process("texas-holdem 3d6d7d9hAs 6c6s 4dAh 7s8h"));
  }

  @Test
  public void test_texas_holdem_5075_5c5d8sJhJs_Jc9c_4h6s_QhKc() {
    assertEquals(
      "4h6s QhKc Jc9c",
      Solver.process("texas-holdem 5c5d8sJhJs Jc9c 4h6s QhKc"));
  }

  @Test
  public void test_texas_holdem_5076_AdKsQcQdQh_5hJs_Kh2d_9h9d_Ts8s_8dAh_6d6c_6h7c_4cTc_Kd5c() {
    assertEquals(
      "4cTc=5hJs=6h7c=Ts8s 6d6c 9h9d Kd5c=Kh2d 8dAh",
      Solver.process("texas-holdem AdKsQcQdQh 5hJs Kh2d 9h9d Ts8s 8dAh 6d6c 6h7c 4cTc Kd5c"));
  }

  @Test
  public void test_texas_holdem_5077_2c2h5c5s7h_Kc3c_6d4c_6hAd_6s9h_3d3s_Qc4h_8d7d_7cAc() {
    assertEquals(
      "6d4c 6s9h Qc4h Kc3c 6hAd 3d3s 8d7d 7cAc",
      Solver.process("texas-holdem 2c2h5c5s7h Kc3c 6d4c 6hAd 6s9h 3d3s Qc4h 8d7d 7cAc"));
  }

  @Test
  public void test_texas_holdem_5078_7c8cAdAsKs_Jd9d_Kh8s_6d7d() {
    assertEquals(
      "Jd9d 6d7d Kh8s",
      Solver.process("texas-holdem 7c8cAdAsKs Jd9d Kh8s 6d7d"));
  }

  @Test
  public void test_texas_holdem_5079_2s3c7h8sJh_6cTh_9c2h() {
    assertEquals(
      "6cTh 9c2h",
      Solver.process("texas-holdem 2s3c7h8sJh 6cTh 9c2h"));
  }

  @Test
  public void test_texas_holdem_5080_3h3s4h7sTs_5s5d_Ac2h_3d2d_8d5c_2cAh_8h6c_Ks2s() {
    assertEquals(
      "8d5c=8h6c 2cAh=Ac2h 5s5d 3d2d Ks2s",
      Solver.process("texas-holdem 3h3s4h7sTs 5s5d Ac2h 3d2d 8d5c 2cAh 8h6c Ks2s"));
  }

  @Test
  public void test_texas_holdem_5081_3c6cKdKhTd_6h2c_4s8h_5c5s_Qd9s_4c9d_Qs5h_9c7h() {
    assertEquals(
      "4s8h 4c9d 9c7h Qs5h Qd9s 5c5s 6h2c",
      Solver.process("texas-holdem 3c6cKdKhTd 6h2c 4s8h 5c5s Qd9s 4c9d Qs5h 9c7h"));
  }

  @Test
  public void test_texas_holdem_5082_2c5c6c8dQd_Jh4s_2hAh() {
    assertEquals(
      "Jh4s 2hAh",
      Solver.process("texas-holdem 2c5c6c8dQd Jh4s 2hAh"));
  }

  @Test
  public void test_texas_holdem_5083_4d6s7h9hKc_4hQh_JhQd_Kh5d_JdQs_3cTd_As7d_4s5h_KsJc() {
    assertEquals(
      "3cTd JdQs=JhQd 4s5h 4hQh As7d Kh5d KsJc",
      Solver.process("texas-holdem 4d6s7h9hKc 4hQh JhQd Kh5d JdQs 3cTd As7d 4s5h KsJc"));
  }

  @Test
  public void test_texas_holdem_5084_4s6h8d9cTh_Js3c_Qd4h_8c2d() {
    assertEquals(
      "Js3c Qd4h 8c2d",
      Solver.process("texas-holdem 4s6h8d9cTh Js3c Qd4h 8c2d"));
  }

  @Test
  public void test_texas_holdem_5085_3d5d6s8d8s_Qs4d_5s5c_Qd9d_7h3s_Kh2d_Jh6h() {
    assertEquals(
      "Qs4d Kh2d 7h3s Jh6h Qd9d 5s5c",
      Solver.process("texas-holdem 3d5d6s8d8s Qs4d 5s5c Qd9d 7h3s Kh2d Jh6h"));
  }

  @Test
  public void test_texas_holdem_5086_4d7hKhQdTh_9d4h_8s3h_8c7d_6d5c_4sAc() {
    assertEquals(
      "6d5c 8s3h 9d4h 4sAc 8c7d",
      Solver.process("texas-holdem 4d7hKhQdTh 9d4h 8s3h 8c7d 6d5c 4sAc"));
  }

  @Test
  public void test_texas_holdem_5087_4h6h9dAdJs_TdQd_Jh4s_Kh5s_Th6s_8c5h_7d2c() {
    assertEquals(
      "7d2c 8c5h TdQd Kh5s Th6s Jh4s",
      Solver.process("texas-holdem 4h6h9dAdJs TdQd Jh4s Kh5s Th6s 8c5h 7d2c"));
  }

  @Test
  public void test_texas_holdem_5088_3d5c9cKdTd_3s2d_5sQc_5h4h_8dQd() {
    assertEquals(
      "3s2d 5h4h 5sQc 8dQd",
      Solver.process("texas-holdem 3d5c9cKdTd 3s2d 5sQc 5h4h 8dQd"));
  }

  @Test
  public void test_texas_holdem_5089_3s5c5s9sTc_7d9c_4c3c_7cAh_Td4s_5dKd_Jc7s_8sQh() {
    assertEquals(
      "Jc7s 8sQh 7cAh 4c3c 7d9c Td4s 5dKd",
      Solver.process("texas-holdem 3s5c5s9sTc 7d9c 4c3c 7cAh Td4s 5dKd Jc7s 8sQh"));
  }

  @Test
  public void test_texas_holdem_5090_6cAhJcKsQs_JhKh_Qh3h_Jd7s_4s4h() {
    assertEquals(
      "4s4h Jd7s Qh3h JhKh",
      Solver.process("texas-holdem 6cAhJcKsQs JhKh Qh3h Jd7s 4s4h"));
  }

  @Test
  public void test_texas_holdem_5091_3h7sJsQcQs_4s2s_Jd5s_2dKc() {
    assertEquals(
      "2dKc Jd5s 4s2s",
      Solver.process("texas-holdem 3h7sJsQcQs 4s2s Jd5s 2dKc"));
  }

  @Test
  public void test_texas_holdem_5092_2h3d5d9dJc_Jd8h_4h7d_AsTd_Ts3h() {
    assertEquals(
      "4h7d AsTd Ts3h Jd8h",
      Solver.process("texas-holdem 2h3d5d9dJc Jd8h 4h7d AsTd Ts3h"));
  }

  @Test
  public void test_texas_holdem_5093_4s6h8cJcTd_4d5c_AsAc_9sQh_AdKh_7h6c_7d9h_Th3d_Qd2h() {
    assertEquals(
      "Qd2h AdKh 4d5c 7h6c Th3d AsAc 7d9h 9sQh",
      Solver.process("texas-holdem 4s6h8cJcTd 4d5c AsAc 9sQh AdKh 7h6c 7d9h Th3d Qd2h"));
  }

  @Test
  public void test_texas_holdem_5094_2c4c5c6d8s_5d7d_TdTc_3h2h_TsJs_7c6h_4dAc_9h3d() {
    assertEquals(
      "TsJs 4dAc TdTc 3h2h=9h3d 5d7d=7c6h",
      Solver.process("texas-holdem 2c4c5c6d8s 5d7d TdTc 3h2h TsJs 7c6h 4dAc 9h3d"));
  }

  @Test
  public void test_texas_holdem_5095_4s6h6s7sJs_As2s_9h7h_4hQc() {
    assertEquals(
      "4hQc 9h7h As2s",
      Solver.process("texas-holdem 4s6h6s7sJs As2s 9h7h 4hQc"));
  }

  @Test
  public void test_texas_holdem_5096_4c5s8s9hKh_QhKd_6c2d_AsTh_9d3d_6d2s_Js8d() {
    assertEquals(
      "6c2d=6d2s AsTh Js8d 9d3d QhKd",
      Solver.process("texas-holdem 4c5s8s9hKh QhKd 6c2d AsTh 9d3d 6d2s Js8d"));
  }

  @Test
  public void test_texas_holdem_5097_2s5d7c8dJc_Jh6s_ThTd_4dQd_3c3h_AsTs_Js5h_2h9c_7hTc_KhJd() {
    assertEquals(
      "4dQd AsTs 2h9c 3c3h 7hTc ThTd Jh6s KhJd Js5h",
      Solver.process("texas-holdem 2s5d7c8dJc Jh6s ThTd 4dQd 3c3h AsTs Js5h 2h9c 7hTc KhJd"));
  }

  @Test
  public void test_texas_holdem_5098_5h8sAcAsJh_4d5s_6cKd_JsTh_8hAd_Jd2s_Ks8c_9hTd() {
    assertEquals(
      "9hTd 6cKd 4d5s Ks8c Jd2s JsTh 8hAd",
      Solver.process("texas-holdem 5h8sAcAsJh 4d5s 6cKd JsTh 8hAd Jd2s Ks8c 9hTd"));
  }

  @Test
  public void test_texas_holdem_5099_6c6s7hKcQs_5s6h_JhJd_Th2c_2sKd_Js5d_7s3s_8d5h() {
    assertEquals(
      "8d5h Th2c Js5d 7s3s JhJd 2sKd 5s6h",
      Solver.process("texas-holdem 6c6s7hKcQs 5s6h JhJd Th2c 2sKd Js5d 7s3s 8d5h"));
  }

  @Test
  public void test_texas_holdem_5100_3h4c4h8dTc_2s7s_Qc6s_9d3d_7hKh_TsQs_Jd9s_2cQh_5hAd_6cJs() {
    assertEquals(
      "2s7s 6cJs Jd9s 2cQh=Qc6s 7hKh 5hAd 9d3d TsQs",
      Solver.process("texas-holdem 3h4c4h8dTc 2s7s Qc6s 9d3d 7hKh TsQs Jd9s 2cQh 5hAd 6cJs"));
  }

  @Test
  public void test_texas_holdem_5101_4h5h8s9sTd_2s4c_2cJc_Qc3d_Qs7c_8h7s_Js5c_AsTh_JdKh_Jh3s() {
    assertEquals(
      "2cJc=Jh3s Qc3d Qs7c JdKh 2s4c Js5c 8h7s AsTh",
      Solver.process("texas-holdem 4h5h8s9sTd 2s4c 2cJc Qc3d Qs7c 8h7s Js5c AsTh JdKh Jh3s"));
  }

  @Test
  public void test_texas_holdem_5102_2cAhKdKhTh_5sQh_9c5d_Qc7s_Kc7c_8d3c_Jc7d() {
    assertEquals(
      "8d3c 9c5d Jc7d 5sQh=Qc7s Kc7c",
      Solver.process("texas-holdem 2cAhKdKhTh 5sQh 9c5d Qc7s Kc7c 8d3c Jc7d"));
  }

  @Test
  public void test_texas_holdem_5103_4h5sAhJhQs_Th2c_Kd6s_Jd5d_5c8d_Tc6c_2hJs() {
    assertEquals(
      "Th2c Tc6c Kd6s 5c8d 2hJs Jd5d",
      Solver.process("texas-holdem 4h5sAhJhQs Th2c Kd6s Jd5d 5c8d Tc6c 2hJs"));
  }

  @Test
  public void test_texas_holdem_5104_4c6hAsKcTc_4h9d_3s4s_Ah2h_9sJh_3h3d_7d5h_Ks8c() {
    assertEquals(
      "7d5h 9sJh 3h3d 3s4s=4h9d Ks8c Ah2h",
      Solver.process("texas-holdem 4c6hAsKcTc 4h9d 3s4s Ah2h 9sJh 3h3d 7d5h Ks8c"));
  }

  @Test
  public void test_texas_holdem_5105_4h8sKcQsTd_Jh6s_8dJd_7cKs_Kh5h_QhAd() {
    assertEquals(
      "Jh6s 8dJd QhAd 7cKs=Kh5h",
      Solver.process("texas-holdem 4h8sKcQsTd Jh6s 8dJd 7cKs Kh5h QhAd"));
  }

  @Test
  public void test_texas_holdem_5106_2s4hAsKdTh_7cQc_8cAd_Td5s_9cKc() {
    assertEquals(
      "7cQc Td5s 9cKc 8cAd",
      Solver.process("texas-holdem 2s4hAsKdTh 7cQc 8cAd Td5s 9cKc"));
  }

  @Test
  public void test_texas_holdem_5107_5s6d7c9dAc_Qc3h_QsJs_6cTs_Jc8h_3s8s_KcQd_6hAs() {
    assertEquals(
      "Qc3h QsJs KcQd 6cTs 6hAs 3s8s=Jc8h",
      Solver.process("texas-holdem 5s6d7c9dAc Qc3h QsJs 6cTs Jc8h 3s8s KcQd 6hAs"));
  }

  @Test
  public void test_texas_holdem_5108_2h4c8cAsKh_9s7h_Td3h_4h6h_5hJs_7cQc_KcQs() {
    assertEquals(
      "9s7h Td3h 5hJs 7cQc 4h6h KcQs",
      Solver.process("texas-holdem 2h4c8cAsKh 9s7h Td3h 4h6h 5hJs 7cQc KcQs"));
  }

  @Test
  public void test_texas_holdem_5109_3h3s8hQsTh_As9h_Tc5h_9s6s_KsAc_4sKh_8d9d() {
    assertEquals(
      "9s6s 4sKh As9h KsAc 8d9d Tc5h",
      Solver.process("texas-holdem 3h3s8hQsTh As9h Tc5h 9s6s KsAc 4sKh 8d9d"));
  }

  @Test
  public void test_texas_holdem_5110_2h3h9sQdTs_4c6c_TdJh_Kh7s_Th6s_KsJs_TcKd_Ah5h() {
    assertEquals(
      "4c6c Kh7s Ah5h Th6s TdJh TcKd KsJs",
      Solver.process("texas-holdem 2h3h9sQdTs 4c6c TdJh Kh7s Th6s KsJs TcKd Ah5h"));
  }

  @Test
  public void test_texas_holdem_5111_4h7d9sAsQd_7cTd_JsTh_4cAh_KcQc_5dTs_8h8s_Jc7h_9hQs() {
    assertEquals(
      "5dTs JsTh 7cTd Jc7h 8h8s KcQc 9hQs 4cAh",
      Solver.process("texas-holdem 4h7d9sAsQd 7cTd JsTh 4cAh KcQc 5dTs 8h8s Jc7h 9hQs"));
  }

  @Test
  public void test_texas_holdem_5112_3c3h5h7s8h_2cAd_KhJc() {
    assertEquals(
      "KhJc 2cAd",
      Solver.process("texas-holdem 3c3h5h7s8h 2cAd KhJc"));
  }

  @Test
  public void test_texas_holdem_5113_3h3s6d7dQs_3cJd_9h7h_Kd4c_8s2h_Tc5s_JhAd_3d5d_8h2d() {
    assertEquals(
      "8h2d=8s2h Tc5s Kd4c JhAd 9h7h 3d5d 3cJd",
      Solver.process("texas-holdem 3h3s6d7dQs 3cJd 9h7h Kd4c 8s2h Tc5s JhAd 3d5d 8h2d"));
  }

  @Test
  public void test_texas_holdem_5114_2c5s7sQdQh_Qc8h_Qs7d_4c5c_Td3c_Ks4s_4h9d() {
    assertEquals(
      "4h9d Td3c Ks4s 4c5c Qc8h Qs7d",
      Solver.process("texas-holdem 2c5s7sQdQh Qc8h Qs7d 4c5c Td3c Ks4s 4h9d"));
  }

  @Test
  public void test_texas_holdem_5115_5h6h8hAdTh_8d3d_8c9c_4d4c_5s7h_4sKs_8sKd_Jc5c_9s2h() {
    assertEquals(
      "4sKs 4d4c Jc5c 8d3d 8c9c 8sKd 9s2h 5s7h",
      Solver.process("texas-holdem 5h6h8hAdTh 8d3d 8c9c 4d4c 5s7h 4sKs 8sKd Jc5c 9s2h"));
  }

  @Test
  public void test_texas_holdem_5116_7c7dJsQsTh_2c6s_4sJc_3s7s_9sAh_9cQh_6h8d_KdKs_Td4c_5h3d() {
    assertEquals(
      "2c6s=5h3d=6h8d 9sAh Td4c 4sJc 9cQh KdKs 3s7s",
      Solver.process("texas-holdem 7c7dJsQsTh 2c6s 4sJc 3s7s 9sAh 9cQh 6h8d KdKs Td4c 5h3d"));
  }

  @Test
  public void test_texas_holdem_5117_2d4h6cKdTh_As2s_QsJs_2c4d_7sQd_6s3h_5c8d_8c7d_8h4s_4cTd() {
    assertEquals(
      "5c8d 8c7d 7sQd QsJs As2s 8h4s 6s3h 2c4d 4cTd",
      Solver.process("texas-holdem 2d4h6cKdTh As2s QsJs 2c4d 7sQd 6s3h 5c8d 8c7d 8h4s 4cTd"));
  }

  @Test
  public void test_texas_holdem_5118_2h5s7cJsQc_8c3c_8sQh_8hAs_8d7s_9hKc_3dJh_Ac7h_3hAh_4s7d() {
    assertEquals(
      "8c3c 9hKc 3hAh 8hAs 4s7d 8d7s Ac7h 3dJh 8sQh",
      Solver.process("texas-holdem 2h5s7cJsQc 8c3c 8sQh 8hAs 8d7s 9hKc 3dJh Ac7h 3hAh 4s7d"));
  }

  @Test
  public void test_texas_holdem_5119_AcJcJsKhTs_Tc7c_2s6c() {
    assertEquals(
      "2s6c Tc7c",
      Solver.process("texas-holdem AcJcJsKhTs Tc7c 2s6c"));
  }

  @Test
  public void test_texas_holdem_5120_5s6c7c8s9s_9h3s_2dJc_4sTh_5h8h_Jd7d_5c3c_8d3d() {
    assertEquals(
      "2dJc=5c3c=5h8h=8d3d=9h3s=Jd7d 4sTh",
      Solver.process("texas-holdem 5s6c7c8s9s 9h3s 2dJc 4sTh 5h8h Jd7d 5c3c 8d3d"));
  }

  @Test
  public void test_texas_holdem_5121_5s9sKcQhTs_3h5d_2s3c_JdQs_QdAd_As9d_8cQc_5cAc_2d5h() {
    assertEquals(
      "2s3c 2d5h=3h5d 5cAc As9d 8cQc QdAd JdQs",
      Solver.process("texas-holdem 5s9sKcQhTs 3h5d 2s3c JdQs QdAd As9d 8cQc 5cAc 2d5h"));
  }

  @Test
  public void test_texas_holdem_5122_6c8cKhQhTh_2c5c_8s2s_7h7s_9dAc_QcKc_4d4h_3h3d() {
    assertEquals(
      "2c5c 9dAc 3h3d 4d4h 7h7s 8s2s QcKc",
      Solver.process("texas-holdem 6c8cKhQhTh 2c5c 8s2s 7h7s 9dAc QcKc 4d4h 3h3d"));
  }

  @Test
  public void test_texas_holdem_5123_2h6c6h8c9s_4h9c_As8h_3d5h_8d9d_JcKh_3hTc_Jd3s() {
    assertEquals(
      "3d5h 3hTc Jd3s JcKh As8h 4h9c 8d9d",
      Solver.process("texas-holdem 2h6c6h8c9s 4h9c As8h 3d5h 8d9d JcKh 3hTc Jd3s"));
  }

  @Test
  public void test_texas_holdem_5124_5d5s6dJdKs_TcAh_5hAc() {
    assertEquals(
      "TcAh 5hAc",
      Solver.process("texas-holdem 5d5s6dJdKs TcAh 5hAc"));
  }

  @Test
  public void test_texas_holdem_5125_5c6c9sQhTc_Qs4h_QdAd_7cJc_Kh2d_QcJs_5d3d_8d8s() {
    assertEquals(
      "Kh2d 5d3d 8d8s Qs4h QcJs QdAd 7cJc",
      Solver.process("texas-holdem 5c6c9sQhTc Qs4h QdAd 7cJc Kh2d QcJs 5d3d 8d8s"));
  }

  @Test
  public void test_texas_holdem_5126_4d5d7c7h8s_3c3s_9d4c_9h2h_Jh2d_Ah8d_8hJs() {
    assertEquals(
      "9h2h Jh2d 3c3s 9d4c 8hJs Ah8d",
      Solver.process("texas-holdem 4d5d7c7h8s 3c3s 9d4c 9h2h Jh2d Ah8d 8hJs"));
  }

  @Test
  public void test_texas_holdem_5127_7h8c9d9sJc_Kd8d_4h3c_4cAc_JhTs_9cKc_6hAs_Qd2h() {
    assertEquals(
      "4h3c Qd2h 4cAc=6hAs Kd8d 9cKc JhTs",
      Solver.process("texas-holdem 7h8c9d9sJc Kd8d 4h3c 4cAc JhTs 9cKc 6hAs Qd2h"));
  }

  @Test
  public void test_texas_holdem_5128_5h6c6hAdAh_8s3h_9s5d_Ac8c_4sQh_3d4c_Th9h_7c5s_8hKd() {
    assertEquals(
      "3d4c 7c5s 8s3h 9s5d 4sQh 8hKd Th9h Ac8c",
      Solver.process("texas-holdem 5h6c6hAdAh 8s3h 9s5d Ac8c 4sQh 3d4c Th9h 7c5s 8hKd"));
  }

  @Test
  public void test_texas_holdem_5129_2s4c9c9dJs_4s6h_JhQd_3hTd() {
    assertEquals(
      "3hTd 4s6h JhQd",
      Solver.process("texas-holdem 2s4c9c9dJs 4s6h JhQd 3hTd"));
  }

  @Test
  public void test_texas_holdem_5130_3s4h8cJcKs_TsQd_Jh5h_4d9d_Qh8s_8d6s() {
    assertEquals(
      "TsQd 4d9d 8d6s Qh8s Jh5h",
      Solver.process("texas-holdem 3s4h8cJcKs TsQd Jh5h 4d9d Qh8s 8d6s"));
  }

  @Test
  public void test_texas_holdem_5131_4h6sKcQcTc_6hTs_4s4d_Kh3d_Td9c_As6d() {
    assertEquals(
      "As6d Td9c Kh3d 6hTs 4s4d",
      Solver.process("texas-holdem 4h6sKcQcTc 6hTs 4s4d Kh3d Td9c As6d"));
  }

  @Test
  public void test_texas_holdem_5132_4c6sJcJhQh_KhTh_Qd5s_5c7c_7s6h() {
    assertEquals(
      "5c7c KhTh 7s6h Qd5s",
      Solver.process("texas-holdem 4c6sJcJhQh KhTh Qd5s 5c7c 7s6h"));
  }

  @Test
  public void test_texas_holdem_5133_3h4s6d8hJd_5dKh_Ad3d_Kc9s_5cQs_Qd9d() {
    assertEquals(
      "5cQs Qd9d 5dKh Kc9s Ad3d",
      Solver.process("texas-holdem 3h4s6d8hJd 5dKh Ad3d Kc9s 5cQs Qd9d"));
  }

  @Test
  public void test_texas_holdem_5134_4d6c7h9hQh_2hQc_8sJs() {
    assertEquals(
      "8sJs 2hQc",
      Solver.process("texas-holdem 4d6c7h9hQh 2hQc 8sJs"));
  }

  @Test
  public void test_texas_holdem_5135_3h9cAhJcJd_AsKc_9h5h_Ts8d_6c6d_9s8s_7s3d_7c2s_Jh8h_2h4h() {
    assertEquals(
      "2h4h 7c2s Ts8d 7s3d 6c6d 9h5h=9s8s AsKc Jh8h",
      Solver.process("texas-holdem 3h9cAhJcJd AsKc 9h5h Ts8d 6c6d 9s8s 7s3d 7c2s Jh8h 2h4h"));
  }

  @Test
  public void test_texas_holdem_5136_6sJhKcKsQh_JdTs_3d6d() {
    assertEquals(
      "3d6d JdTs",
      Solver.process("texas-holdem 6sJhKcKsQh JdTs 3d6d"));
  }

  @Test
  public void test_texas_holdem_5137_5c5d6d7hJc_3c6s_Jd5h_6h7c_6c3d_8dTc() {
    assertEquals(
      "8dTc 3c6s=6c3d 6h7c Jd5h",
      Solver.process("texas-holdem 5c5d6d7hJc 3c6s Jd5h 6h7c 6c3d 8dTc"));
  }

  @Test
  public void test_texas_holdem_5138_2s4c7h8cQh_5c6h_3d9s_3sJd_4h3h() {
    assertEquals(
      "3d9s 3sJd 4h3h 5c6h",
      Solver.process("texas-holdem 2s4c7h8cQh 5c6h 3d9s 3sJd 4h3h"));
  }

  @Test
  public void test_texas_holdem_5139_3d6h6s8dKd_4h9h_Kh9c_4dJd_2s2c_2h7h() {
    assertEquals(
      "2h7h 4h9h 2s2c Kh9c 4dJd",
      Solver.process("texas-holdem 3d6h6s8dKd 4h9h Kh9c 4dJd 2s2c 2h7h"));
  }

  @Test
  public void test_texas_holdem_5140_4h5h6h9c9d_Jc7c_QdTd_9s8d_7sJd() {
    assertEquals(
      "7sJd=Jc7c QdTd 9s8d",
      Solver.process("texas-holdem 4h5h6h9c9d Jc7c QdTd 9s8d 7sJd"));
  }

  @Test
  public void test_texas_holdem_5141_2c2s3h4cTc_3d3c_Kh2h_Ah6d_Kd9h_6s6h_2dJh_Qd5c_5s9d() {
    assertEquals(
      "5s9d Qd5c Kd9h Ah6d 6s6h 2dJh Kh2h 3d3c",
      Solver.process("texas-holdem 2c2s3h4cTc 3d3c Kh2h Ah6d Kd9h 6s6h 2dJh Qd5c 5s9d"));
  }

  @Test
  public void test_texas_holdem_5142_4h5c6hKsQs_Qh7c_8c9d() {
    assertEquals(
      "8c9d Qh7c",
      Solver.process("texas-holdem 4h5c6hKsQs Qh7c 8c9d"));
  }

  @Test
  public void test_texas_holdem_5143_2s3hAsKcQh_5hJc_5sQc_QdTs_Ac4d_Qs6c_2c3c_Jh3d() {
    assertEquals(
      "5hJc Jh3d 5sQc Qs6c QdTs Ac4d 2c3c",
      Solver.process("texas-holdem 2s3hAsKcQh 5hJc 5sQc QdTs Ac4d Qs6c 2c3c Jh3d"));
  }

  @Test
  public void test_texas_holdem_5144_3h4h6cQhQs_9dQc_Td8h_Kh8s_Ts2d_2h6h_JcQd() {
    assertEquals(
      "Ts2d Td8h Kh8s 9dQc JcQd 2h6h",
      Solver.process("texas-holdem 3h4h6cQhQs 9dQc Td8h Kh8s Ts2d 2h6h JcQd"));
  }

  @Test
  public void test_texas_holdem_5145_3d4hAsJcTc_5cAc_9h3c_Qs2d_7d7s_2hJd_8c9d_KsAh_6dKd_Js6h() {
    assertEquals(
      "8c9d Qs2d 6dKd 9h3c 7d7s 2hJd Js6h 5cAc KsAh",
      Solver.process("texas-holdem 3d4hAsJcTc 5cAc 9h3c Qs2d 7d7s 2hJd 8c9d KsAh 6dKd Js6h"));
  }

  @Test
  public void test_texas_holdem_5146_6s8sJdKsQh_Qs7s_TdTh_Jc2h_9sJs_3dTs_2dTc_8dAh() {
    assertEquals(
      "2dTc=3dTs 8dAh TdTh Jc2h 9sJs Qs7s",
      Solver.process("texas-holdem 6s8sJdKsQh Qs7s TdTh Jc2h 9sJs 3dTs 2dTc 8dAh"));
  }

  @Test
  public void test_texas_holdem_5147_2h3d4c7cQh_4s9s_3c7d_Qs9h_ThJh_6s5h_6dTs_5cAs() {
    assertEquals(
      "6dTs ThJh 4s9s Qs9h 3c7d 5cAs 6s5h",
      Solver.process("texas-holdem 2h3d4c7cQh 4s9s 3c7d Qs9h ThJh 6s5h 6dTs 5cAs"));
  }

  @Test
  public void test_texas_holdem_5148_2s3c9hAcJh_8cJd_5s4s_7dTd() {
    assertEquals(
      "7dTd 8cJd 5s4s",
      Solver.process("texas-holdem 2s3c9hAcJh 8cJd 5s4s 7dTd"));
  }

  @Test
  public void test_texas_holdem_5149_2c4d8sAdTs_9h6d_QhKd_AhKh_5cAs_KsTc_8c8d_Ac9c_7dKc_Th4h() {
    assertEquals(
      "9h6d 7dKc QhKd KsTc 5cAs Ac9c AhKh Th4h 8c8d",
      Solver.process("texas-holdem 2c4d8sAdTs 9h6d QhKd AhKh 5cAs KsTc 8c8d Ac9c 7dKc Th4h"));
  }

  @Test
  public void test_texas_holdem_5150_4dAhJdKdQc_Td5d_9hJh_3dQh_As2h_6h8h_9s6d() {
    assertEquals(
      "6h8h 9s6d 9hJh 3dQh As2h Td5d",
      Solver.process("texas-holdem 4dAhJdKdQc Td5d 9hJh 3dQh As2h 6h8h 9s6d"));
  }

  @Test
  public void test_texas_holdem_5151_2s4h8hAsTs_6c9c_TcJc_3hAh_9sQc_7cQd_3dJs_Jh7s() {
    assertEquals(
      "6c9c 3dJs Jh7s 7cQd 9sQc TcJc 3hAh",
      Solver.process("texas-holdem 2s4h8hAsTs 6c9c TcJc 3hAh 9sQc 7cQd 3dJs Jh7s"));
  }

  @Test
  public void test_texas_holdem_5152_3h7h8c8dQs_3d7d_4h9h_KcJd_AdKh_5c2c_2sQc() {
    assertEquals(
      "5c2c 4h9h KcJd AdKh 3d7d 2sQc",
      Solver.process("texas-holdem 3h7h8c8dQs 3d7d 4h9h KcJd AdKh 5c2c 2sQc"));
  }

  @Test
  public void test_texas_holdem_5153_2h6h9hAdTc_4cAc_7c3s_5d6s_4h8d_5c6c_Kc7h() {
    assertEquals(
      "7c3s 4h8d Kc7h 5c6c=5d6s 4cAc",
      Solver.process("texas-holdem 2h6h9hAdTc 4cAc 7c3s 5d6s 4h8d 5c6c Kc7h"));
  }

  @Test
  public void test_texas_holdem_5154_4sKsQcTcTs_AsTh_Kd2h_9c6s_Ad3s_3d2c_JcJh_6dKc_7h8s_9s7d() {
    assertEquals(
      "3d2c 7h8s 9c6s=9s7d Ad3s JcJh 6dKc=Kd2h AsTh",
      Solver.process("texas-holdem 4sKsQcTcTs AsTh Kd2h 9c6s Ad3s 3d2c JcJh 6dKc 7h8s 9s7d"));
  }

  @Test
  public void test_texas_holdem_5155_3d4c5s7c9c_9s6d_2dQs_6cKs_4hKd() {
    assertEquals(
      "2dQs 4hKd 6cKs=9s6d",
      Solver.process("texas-holdem 3d4c5s7c9c 9s6d 2dQs 6cKs 4hKd"));
  }

  @Test
  public void test_texas_holdem_5156_2d4c5c7s8s_2h9s_9d7d() {
    assertEquals(
      "2h9s 9d7d",
      Solver.process("texas-holdem 2d4c5c7s8s 2h9s 9d7d"));
  }

  @Test
  public void test_texas_holdem_5157_4h7d8s9sJc_QsJh_5hJs() {
    assertEquals(
      "5hJs QsJh",
      Solver.process("texas-holdem 4h7d8s9sJc QsJh 5hJs"));
  }

  @Test
  public void test_texas_holdem_5158_2s4cQcQhQs_2c7c_Th9d_2d3h_AdTd_KsAs_5s7d_9hJh_9c3s_Ac4s() {
    assertEquals(
      "5s7d 9c3s Th9d 9hJh AdTd KsAs 2c7c=2d3h Ac4s",
      Solver.process("texas-holdem 2s4cQcQhQs 2c7c Th9d 2d3h AdTd KsAs 5s7d 9hJh 9c3s Ac4s"));
  }

  @Test
  public void test_texas_holdem_5159_2c3s4c5d7h_ThJd_TcJh_KdTs_QcQs_QdAs() {
    assertEquals(
      "TcJh=ThJd KdTs QcQs QdAs",
      Solver.process("texas-holdem 2c3s4c5d7h ThJd TcJh KdTs QcQs QdAs"));
  }

  @Test
  public void test_texas_holdem_5160_3h5h5sJsQc_8hJd_Kh2h_9sJc_8d5d() {
    assertEquals(
      "Kh2h 8hJd=9sJc 8d5d",
      Solver.process("texas-holdem 3h5h5sJsQc 8hJd Kh2h 9sJc 8d5d"));
  }

  @Test
  public void test_texas_holdem_5161_7dJcJsKdTh_Ah9h_8s8h_6cKh() {
    assertEquals(
      "Ah9h 8s8h 6cKh",
      Solver.process("texas-holdem 7dJcJsKdTh Ah9h 8s8h 6cKh"));
  }

  @Test
  public void test_texas_holdem_5162_5d7c7sJcTh_3dAc_2d2s() {
    assertEquals(
      "3dAc 2d2s",
      Solver.process("texas-holdem 5d7c7sJcTh 3dAc 2d2s"));
  }

  @Test
  public void test_texas_holdem_5163_3s8c8sAcTh_7c3c_4s2h_AsKh_9dAd_5cTs() {
    assertEquals(
      "4s2h 7c3c 5cTs 9dAd AsKh",
      Solver.process("texas-holdem 3s8c8sAcTh 7c3c 4s2h AsKh 9dAd 5cTs"));
  }

  @Test
  public void test_texas_holdem_5164_2h2s5c5sJh_Jc6h_3h8h_9sJd_7cTc_3cQh_6sAd_3dTd_9cTh() {
    assertEquals(
      "3dTd=3h8h=7cTc=9cTh 3cQh 6sAd Jc6h 9sJd",
      Solver.process("texas-holdem 2h2s5c5sJh Jc6h 3h8h 9sJd 7cTc 3cQh 6sAd 3dTd 9cTh"));
  }

  @Test
  public void test_texas_holdem_5165_4d5h6hAcAd_8cKd_4hTd_7hAs() {
    assertEquals(
      "8cKd 4hTd 7hAs",
      Solver.process("texas-holdem 4d5h6hAcAd 8cKd 4hTd 7hAs"));
  }

  @Test
  public void test_texas_holdem_5166_2c3d4dAhKc_3cQd_2sJh_Ac8c_9c6d_KdTh_6h9h_5h7s() {
    assertEquals(
      "6h9h=9c6d 2sJh 3cQd KdTh Ac8c 5h7s",
      Solver.process("texas-holdem 2c3d4dAhKc 3cQd 2sJh Ac8c 9c6d KdTh 6h9h 5h7s"));
  }

  @Test
  public void test_texas_holdem_5167_3c3s5h6sJh_7cJs_Th5s_Qs6c_AhQd_Jd2h_6dJc_Td5d_8d9d() {
    assertEquals(
      "8d9d AhQd Td5d=Th5s Qs6c Jd2h 7cJs 6dJc",
      Solver.process("texas-holdem 3c3s5h6sJh 7cJs Th5s Qs6c AhQd Jd2h 6dJc Td5d 8d9d"));
  }

  @Test
  public void test_texas_holdem_5168_4c5c6sAdJd_7sTc_As6c_KsQc_Kd4h_Kc9d() {
    assertEquals(
      "7sTc Kc9d KsQc Kd4h As6c",
      Solver.process("texas-holdem 4c5c6sAdJd 7sTc As6c KsQc Kd4h Kc9d"));
  }

  @Test
  public void test_texas_holdem_5169_3d3h6c6sQs_Qc9d_8h8s() {
    assertEquals(
      "8h8s Qc9d",
      Solver.process("texas-holdem 3d3h6c6sQs Qc9d 8h8s"));
  }

  @Test
  public void test_texas_holdem_5170_4s6h7h9cAc_KdJh_8d2c_Qc6s_Tc5s_3s7d_5cJs_QsKs_AdAs_8s7s() {
    assertEquals(
      "8d2c Tc5s 5cJs KdJh QsKs Qc6s 3s7d 8s7s AdAs",
      Solver.process("texas-holdem 4s6h7h9cAc KdJh 8d2c Qc6s Tc5s 3s7d 5cJs QsKs AdAs 8s7s"));
  }

  @Test
  public void test_texas_holdem_5171_2c7s9d9sJs_2sTc_5sKs_6h3c_4d8d() {
    assertEquals(
      "6h3c 4d8d 2sTc 5sKs",
      Solver.process("texas-holdem 2c7s9d9sJs 2sTc 5sKs 6h3c 4d8d"));
  }

  @Test
  public void test_texas_holdem_5172_4d4s5d7cAd_2s2d_8sJs_6h7h() {
    assertEquals(
      "8sJs 2s2d 6h7h",
      Solver.process("texas-holdem 4d4s5d7cAd 2s2d 8sJs 6h7h"));
  }

  @Test
  public void test_texas_holdem_5173_6h8d8hKsTd_2c3s_3cQs_2sJs_QdJd_9cKh_Kc2h_6s8c_2d7h() {
    assertEquals(
      "2c3s 2d7h 2sJs 3cQs QdJd 9cKh=Kc2h 6s8c",
      Solver.process("texas-holdem 6h8d8hKsTd 2c3s 3cQs 2sJs QdJd 9cKh Kc2h 6s8c 2d7h"));
  }

  @Test
  public void test_texas_holdem_5174_3d4h5sQdQs_Qh2d_AdTd_Js6h_7cKc_2sJc_8s6s_QcTh_3h8h_7h4c() {
    assertEquals(
      "8s6s 2sJc Js6h 7cKc AdTd 3h8h 7h4c Qh2d QcTh",
      Solver.process("texas-holdem 3d4h5sQdQs Qh2d AdTd Js6h 7cKc 2sJc 8s6s QcTh 3h8h 7h4c"));
  }

  @Test
  public void test_texas_holdem_5175_2d3c4s6c8s_QsKd_ThQc_Qd2c_TcJd_Qh9c() {
    assertEquals(
      "TcJd Qh9c ThQc QsKd Qd2c",
      Solver.process("texas-holdem 2d3c4s6c8s QsKd ThQc Qd2c TcJd Qh9c"));
  }

  @Test
  public void test_texas_holdem_5176_3h6d7h9sJd_5d7c_Qs6s() {
    assertEquals(
      "Qs6s 5d7c",
      Solver.process("texas-holdem 3h6d7h9sJd 5d7c Qs6s"));
  }

  @Test
  public void test_texas_holdem_5177_2s4s6hJhTd_9cAc_KhJc_6s3s_Ad8c_3c4c_3hKs_Qh3d_Qs6c_7sTs() {
    assertEquals(
      "Qh3d 3hKs Ad8c 9cAc 3c4c 6s3s Qs6c 7sTs KhJc",
      Solver.process("texas-holdem 2s4s6hJhTd 9cAc KhJc 6s3s Ad8c 3c4c 3hKs Qh3d Qs6c 7sTs"));
  }

  @Test
  public void test_texas_holdem_5178_3s5d9cAhQc_Ks6s_Qs5c_8c3h_2h3d_TcKc_Kh4h_2s6c_KdQd_8sQh() {
    assertEquals(
      "2s6c Kh4h Ks6s TcKc 2h3d=8c3h 8sQh KdQd Qs5c",
      Solver.process("texas-holdem 3s5d9cAhQc Ks6s Qs5c 8c3h 2h3d TcKc Kh4h 2s6c KdQd 8sQh"));
  }

  @Test
  public void test_texas_holdem_5179_2s3s8dJdQc_AhAc_2c4h_KhKd() {
    assertEquals(
      "2c4h KhKd AhAc",
      Solver.process("texas-holdem 2s3s8dJdQc AhAc 2c4h KhKd"));
  }

  @Test
  public void test_texas_holdem_5180_2h3s9dKcKs_TdJh_5s8d_9h9s_4s3c_Kd2d_JsTc_3h3d() {
    assertEquals(
      "5s8d JsTc=TdJh 4s3c 3h3d 9h9s Kd2d",
      Solver.process("texas-holdem 2h3s9dKcKs TdJh 5s8d 9h9s 4s3c Kd2d JsTc 3h3d"));
  }

  @Test
  public void test_texas_holdem_5181_2c6d7c7sQh_Jc5s_Jh7h_As8d_6s5d_Js4s_KhJd_9d4h_Kd3h_5h6h() {
    assertEquals(
      "9d4h Jc5s=Js4s Kd3h KhJd As8d 5h6h=6s5d Jh7h",
      Solver.process("texas-holdem 2c6d7c7sQh Jc5s Jh7h As8d 6s5d Js4s KhJd 9d4h Kd3h 5h6h"));
  }

  @Test
  public void test_texas_holdem_5182_5d6c7hKdTh_4c7s_4d4s_4h5s_8hAh_Qs6d() {
    assertEquals(
      "8hAh 4d4s 4h5s Qs6d 4c7s",
      Solver.process("texas-holdem 5d6c7hKdTh 4c7s 4d4s 4h5s 8hAh Qs6d"));
  }

  @Test
  public void test_texas_holdem_5183_3d4d4s6sAh_3hKs_2sTs_TcAd_6d9h_8h2d_9dQd() {
    assertEquals(
      "8h2d 2sTs 9dQd 3hKs 6d9h TcAd",
      Solver.process("texas-holdem 3d4d4s6sAh 3hKs 2sTs TcAd 6d9h 8h2d 9dQd"));
  }

  @Test
  public void test_texas_holdem_5184_5d8hJsThTs_8cAs_9hKc() {
    assertEquals(
      "9hKc 8cAs",
      Solver.process("texas-holdem 5d8hJsThTs 8cAs 9hKc"));
  }

  @Test
  public void test_texas_holdem_5185_3dAsJhJsTh_9cKc_Kd8s_6c9h_Tc6s_Qs2c_Qd7s_Ad3s_7d7h() {
    assertEquals(
      "6c9h Qd7s=Qs2c 9cKc=Kd8s 7d7h Tc6s Ad3s",
      Solver.process("texas-holdem 3dAsJhJsTh 9cKc Kd8s 6c9h Tc6s Qs2c Qd7s Ad3s 7d7h"));
  }

  @Test
  public void test_texas_holdem_5186_4s8c9dJdTc_Qs2s_Jc2h_TsKd_5d4d_Td3h_Kc6d_Ad4h_9s5c() {
    assertEquals(
      "Kc6d 5d4d Ad4h 9s5c Td3h TsKd Jc2h Qs2s",
      Solver.process("texas-holdem 4s8c9dJdTc Qs2s Jc2h TsKd 5d4d Td3h Kc6d Ad4h 9s5c"));
  }

  @Test
  public void test_texas_holdem_5187_4d5d5sKsQc_3d7c_9s8s_9dJd_7d8c_6dTc_Th4c() {
    assertEquals(
      "3d7c 7d8c 9s8s 6dTc 9dJd Th4c",
      Solver.process("texas-holdem 4d5d5sKsQc 3d7c 9s8s 9dJd 7d8c 6dTc Th4c"));
  }

  @Test
  public void test_texas_holdem_5188_2c2s7cJhJs_5c4s_KdTs_9hQs_5dKs_Kc5h_Qh3s_AcQd_8c9s() {
    assertEquals(
      "5c4s 8c9s 9hQs=Qh3s 5dKs=Kc5h=KdTs AcQd",
      Solver.process("texas-holdem 2c2s7cJhJs 5c4s KdTs 9hQs 5dKs Kc5h Qh3s AcQd 8c9s"));
  }

  @Test
  public void test_texas_holdem_5189_2s8dAdKcKs_JcTc_QcQh_3dQs_9c7d_3h6c_4sQd() {
    assertEquals(
      "3h6c 9c7d JcTc 3dQs=4sQd QcQh",
      Solver.process("texas-holdem 2s8dAdKcKs JcTc QcQh 3dQs 9c7d 3h6c 4sQd"));
  }

  @Test
  public void test_texas_holdem_5190_6d6sAcAsTs_5dJh_6c9c() {
    assertEquals(
      "5dJh 6c9c",
      Solver.process("texas-holdem 6d6sAcAsTs 5dJh 6c9c"));
  }

  @Test
  public void test_texas_holdem_5191_4d4h4sKcTs_3c2h_8dJc_8cAd_As2s() {
    assertEquals(
      "3c2h 8dJc 8cAd=As2s",
      Solver.process("texas-holdem 4d4h4sKcTs 3c2h 8dJc 8cAd As2s"));
  }

  @Test
  public void test_texas_holdem_5192_2c3c6h9hAs_3sJs_Ah5d_Jd5h() {
    assertEquals(
      "Jd5h 3sJs Ah5d",
      Solver.process("texas-holdem 2c3c6h9hAs 3sJs Ah5d Jd5h"));
  }

  @Test
  public void test_texas_holdem_5193_2h4d6c8dAc_5sQh_7cJc_8cTs_3dJs_QcTc_9s7h() {
    assertEquals(
      "9s7h 3dJs 7cJc 5sQh QcTc 8cTs",
      Solver.process("texas-holdem 2h4d6c8dAc 5sQh 7cJc 8cTs 3dJs QcTc 9s7h"));
  }

  @Test
  public void test_texas_holdem_5194_2d5c6dKhTs_JhKd_8s3s_9c4c_7cAd_Qh4s_3d5d_6hJs_4dQs() {
    assertEquals(
      "8s3s 9c4c 4dQs=Qh4s 7cAd 3d5d 6hJs JhKd",
      Solver.process("texas-holdem 2d5c6dKhTs JhKd 8s3s 9c4c 7cAd Qh4s 3d5d 6hJs 4dQs"));
  }

  @Test
  public void test_texas_holdem_5195_3d8h8s9sKd_7sKh_9d7c_2sJc_JsAs_3sAc_Ks2h_Ad4d_Ts6c() {
    assertEquals(
      "Ts6c 2sJc Ad4d JsAs 3sAc 9d7c 7sKh=Ks2h",
      Solver.process("texas-holdem 3d8h8s9sKd 7sKh 9d7c 2sJc JsAs 3sAc Ks2h Ad4d Ts6c"));
  }

  @Test
  public void test_texas_holdem_5196_2d3c8sJcKd_9hJs_6d3s_5dQh_5c3d_8dKs_Qd7h_TdTs() {
    assertEquals(
      "5dQh Qd7h 5c3d=6d3s TdTs 9hJs 8dKs",
      Solver.process("texas-holdem 2d3c8sJcKd 9hJs 6d3s 5dQh 5c3d 8dKs Qd7h TdTs"));
  }

  @Test
  public void test_texas_holdem_5197_6h8d9hAcJs_7hKc_5h4c_QsQc() {
    assertEquals(
      "5h4c 7hKc QsQc",
      Solver.process("texas-holdem 6h8d9hAcJs 7hKc 5h4c QsQc"));
  }

  @Test
  public void test_texas_holdem_5198_6d7d9sJsTs_KcAd_Qs5c() {
    assertEquals(
      "Qs5c KcAd",
      Solver.process("texas-holdem 6d7d9sJsTs KcAd Qs5c"));
  }

  @Test
  public void test_texas_holdem_5199_2c3d6c7dQs_2sJh_4hQc() {
    assertEquals(
      "2sJh 4hQc",
      Solver.process("texas-holdem 2c3d6c7dQs 2sJh 4hQc"));
  }

  @Test
  public void test_texas_holdem_5200_3d4d6c9hJd_Ah3s_TsKc_QdQh_3h7d_TdQs() {
    assertEquals(
      "TdQs TsKc 3h7d Ah3s QdQh",
      Solver.process("texas-holdem 3d4d6c9hJd Ah3s TsKc QdQh 3h7d TdQs"));
  }

  @Test
  public void test_texas_holdem_5201_4s6c7sJhJs_4h8h_6s5s_AsKs_Th7h() {
    assertEquals(
      "4h8h Th7h 6s5s AsKs",
      Solver.process("texas-holdem 4s6c7sJhJs 4h8h 6s5s AsKs Th7h"));
  }

  @Test
  public void test_texas_holdem_5202_2c5s8dQcQd_4c5c_5dAc_6hJd_6sAs_Ks5h_Kd2d_7c4h_Tc6d() {
    assertEquals(
      "7c4h Tc6d 6hJd 6sAs Kd2d 4c5c Ks5h 5dAc",
      Solver.process("texas-holdem 2c5s8dQcQd 4c5c 5dAc 6hJd 6sAs Ks5h Kd2d 7c4h Tc6d"));
  }

  @Test
  public void test_texas_holdem_5203_3c5hAdKhTc_Qc2d_QdQh() {
    assertEquals(
      "Qc2d QdQh",
      Solver.process("texas-holdem 3c5hAdKhTc Qc2d QdQh"));
  }

  @Test
  public void test_texas_holdem_5204_7s8d8h9hJc_Qc7d_5cQs_8sAd_Ts6s() {
    assertEquals(
      "5cQs Qc7d 8sAd Ts6s",
      Solver.process("texas-holdem 7s8d8h9hJc Qc7d 5cQs 8sAd Ts6s"));
  }

  @Test
  public void test_texas_holdem_5205_2h6h8d9sQh_8c5s_5dAs_2cJc_Kh4s_Kc3d_Kd2d() {
    assertEquals(
      "Kc3d=Kh4s 5dAs 2cJc Kd2d 8c5s",
      Solver.process("texas-holdem 2h6h8d9sQh 8c5s 5dAs 2cJc Kh4s Kc3d Kd2d"));
  }

  @Test
  public void test_texas_holdem_5206_4s7c9hAsTc_Qs5c_Th5d_6hAh_JcTd_8sQd_2dTs_8c7h_Qh8d_9d6d() {
    assertEquals(
      "Qs5c 8sQd=Qh8d 8c7h 9d6d 2dTs=Th5d JcTd 6hAh",
      Solver.process("texas-holdem 4s7c9hAsTc Qs5c Th5d 6hAh JcTd 8sQd 2dTs 8c7h Qh8d 9d6d"));
  }

  @Test
  public void test_texas_holdem_5207_4c5h8hAdQd_9s3s_2h6c() {
    assertEquals(
      "2h6c 9s3s",
      Solver.process("texas-holdem 4c5h8hAdQd 9s3s 2h6c"));
  }

  @Test
  public void test_texas_holdem_5208_2s5h7sQhTh_Kh3s_7d4d_Ah3h() {
    assertEquals(
      "Kh3s 7d4d Ah3h",
      Solver.process("texas-holdem 2s5h7sQhTh Kh3s 7d4d Ah3h"));
  }

  @Test
  public void test_texas_holdem_5209_4s6h8cAcAd_Kh3c_3d2s() {
    assertEquals(
      "3d2s Kh3c",
      Solver.process("texas-holdem 4s6h8cAcAd Kh3c 3d2s"));
  }

  @Test
  public void test_texas_holdem_5210_3c5dJcJsKd_TdJh_KhAh_4dQh_9c2h_6sQd_8hAc() {
    assertEquals(
      "9c2h 4dQh 6sQd 8hAc KhAh TdJh",
      Solver.process("texas-holdem 3c5dJcJsKd TdJh KhAh 4dQh 9c2h 6sQd 8hAc"));
  }

  @Test
  public void test_texas_holdem_5211_4h6hAsJcKd_7c9d_Qd2c_7h5d_5s4c_JdJh_QhTs() {
    assertEquals(
      "7h5d 7c9d Qd2c 5s4c JdJh QhTs",
      Solver.process("texas-holdem 4h6hAsJcKd 7c9d Qd2c 7h5d 5s4c JdJh QhTs"));
  }

  @Test
  public void test_texas_holdem_5212_4c5h8cJdTd_TsJh_Kc6s_KdKs_3h7c_Tc6h() {
    assertEquals(
      "3h7c Kc6s Tc6h KdKs TsJh",
      Solver.process("texas-holdem 4c5h8cJdTd TsJh Kc6s KdKs 3h7c Tc6h"));
  }

  @Test
  public void test_texas_holdem_5213_9dAcAsJdJh_5c3d_Tc9h_Ah6s_7c5h_JcKh_7h4c_8s7s_5d9s_Qc3c() {
    assertEquals(
      "5c3d=5d9s=7c5h=7h4c=8s7s Tc9h Qc3c JcKh Ah6s",
      Solver.process("texas-holdem 9dAcAsJdJh 5c3d Tc9h Ah6s 7c5h JcKh 7h4c 8s7s 5d9s Qc3c"));
  }

  @Test
  public void test_texas_holdem_5214_3h4h7s8cQh_7h5s_As2h_Jd6s_9h6d_KdQs_Ad8d() {
    assertEquals(
      "9h6d Jd6s As2h 7h5s Ad8d KdQs",
      Solver.process("texas-holdem 3h4h7s8cQh 7h5s As2h Jd6s 9h6d KdQs Ad8d"));
  }

  @Test
  public void test_texas_holdem_5215_4s7dKcKsQs_Jc5d_3c6c_4hTs_Jd9c_8dAs() {
    assertEquals(
      "3c6c Jc5d Jd9c 8dAs 4hTs",
      Solver.process("texas-holdem 4s7dKcKsQs Jc5d 3c6c 4hTs Jd9c 8dAs"));
  }

  @Test
  public void test_texas_holdem_5216_9hJhKdKhKs_8cJd_5h4d_3c3h_7d7s_4h2s_8d7h() {
    assertEquals(
      "4h2s=5h4d=8d7h 3c3h 7d7s 8cJd",
      Solver.process("texas-holdem 9hJhKdKhKs 8cJd 5h4d 3c3h 7d7s 4h2s 8d7h"));
  }

  @Test
  public void test_texas_holdem_5217_3h6c8hAhAs_9h4s_Ac6h_AdTh_7s3c_4c3s_5d2s_QhJd_QdKc_4hJh() {
    assertEquals(
      "5d2s 9h4s QhJd QdKc 4c3s=7s3c AdTh 4hJh Ac6h",
      Solver.process("texas-holdem 3h6c8hAhAs 9h4s Ac6h AdTh 7s3c 4c3s 5d2s QhJd QdKc 4hJh"));
  }

  @Test
  public void test_texas_holdem_5218_2c3s7s9cAs_2sTd_Ad9h_Kd5c_9d6s_7hQd_8h9s_JsKs_6cTc() {
    assertEquals(
      "6cTc Kd5c 2sTd 7hQd 9d6s 8h9s Ad9h JsKs",
      Solver.process("texas-holdem 2c3s7s9cAs 2sTd Ad9h Kd5c 9d6s 7hQd 8h9s JsKs 6cTc"));
  }

  @Test
  public void test_texas_holdem_5219_2h3s8hAcTd_TcKc_Ad7d() {
    assertEquals(
      "TcKc Ad7d",
      Solver.process("texas-holdem 2h3s8hAcTd TcKc Ad7d"));
  }

  @Test
  public void test_texas_holdem_5220_3s7cAcJhJs_Ks2c_Kd5s_AhQh_6h5c_6s6d() {
    assertEquals(
      "6h5c Kd5s=Ks2c 6s6d AhQh",
      Solver.process("texas-holdem 3s7cAcJhJs Ks2c Kd5s AhQh 6h5c 6s6d"));
  }

  @Test
  public void test_texas_holdem_5221_3d6h9cQsTc_Qc7h_5h4h_4sAc_2h2d_Ts5d() {
    assertEquals(
      "5h4h 4sAc 2h2d Ts5d Qc7h",
      Solver.process("texas-holdem 3d6h9cQsTc Qc7h 5h4h 4sAc 2h2d Ts5d"));
  }

  @Test
  public void test_texas_holdem_5222_2d2h8hJhTs_7cAs_8dQs_9s7h_Jc5d_3sKs() {
    assertEquals(
      "3sKs 7cAs 8dQs Jc5d 9s7h",
      Solver.process("texas-holdem 2d2h8hJhTs 7cAs 8dQs 9s7h Jc5d 3sKs"));
  }

  @Test
  public void test_texas_holdem_5223_2s9sAhQcTd_8hQs_2h3d_5c6c_8s4h_4d4s() {
    assertEquals(
      "5c6c 8s4h 2h3d 4d4s 8hQs",
      Solver.process("texas-holdem 2s9sAhQcTd 8hQs 2h3d 5c6c 8s4h 4d4s"));
  }

  @Test
  public void test_texas_holdem_5224_2d2h6cJdQd_TcQs_3hJh_4dKh_5sTs() {
    assertEquals(
      "5sTs 4dKh 3hJh TcQs",
      Solver.process("texas-holdem 2d2h6cJdQd TcQs 3hJh 4dKh 5sTs"));
  }

  @Test
  public void test_texas_holdem_5225_2d3d4h5d6d_4s9c_Jd8s_6cQs_9h4d_QcTd_QhKs() {
    assertEquals(
      "4s9c=6cQs=QhKs QcTd Jd8s 9h4d",
      Solver.process("texas-holdem 2d3d4h5d6d 4s9c Jd8s 6cQs 9h4d QcTd QhKs"));
  }

  @Test
  public void test_texas_holdem_5226_6s9sKcQdTc_8cTs_8s6d_7h3h_7c5d_6h7s_2sQc_Ac4c_KsQh_Ad4d() {
    assertEquals(
      "7c5d=7h3h Ac4c=Ad4d 6h7s=8s6d 8cTs 2sQc KsQh",
      Solver.process("texas-holdem 6s9sKcQdTc 8cTs 8s6d 7h3h 7c5d 6h7s 2sQc Ac4c KsQh Ad4d"));
  }

  @Test
  public void test_texas_holdem_5227_8h9sAcKhTc_Ad8s_8c7c() {
    assertEquals(
      "8c7c Ad8s",
      Solver.process("texas-holdem 8h9sAcKhTc Ad8s 8c7c"));
  }

  @Test
  public void test_texas_holdem_5228_2s4s5sJhJs_Qc7c_6dTd_AcAh_2cJd_4cJc_7d7s_9s2h_Tc6h_KdTs() {
    assertEquals(
      "6dTd=Tc6h Qc7c AcAh 7d7s 9s2h KdTs 2cJd 4cJc",
      Solver.process("texas-holdem 2s4s5sJhJs Qc7c 6dTd AcAh 2cJd 4cJc 7d7s 9s2h Tc6h KdTs"));
  }

  @Test
  public void test_texas_holdem_5229_3d7h9sKhKs_4s5d_7c3h() {
    assertEquals(
      "4s5d 7c3h",
      Solver.process("texas-holdem 3d7h9sKhKs 4s5d 7c3h"));
  }

  @Test
  public void test_texas_holdem_5230_4s7h8sJdJs_Ad7d_9d8h_5s5d() {
    assertEquals(
      "5s5d Ad7d 9d8h",
      Solver.process("texas-holdem 4s7h8sJdJs Ad7d 9d8h 5s5d"));
  }

  @Test
  public void test_texas_holdem_5231_3dJhQsTdTs_3c4c_8d9c_Kc7s_Ks8c_7h5d_As2c_9s8s() {
    assertEquals(
      "7h5d Kc7s=Ks8c As2c 3c4c 8d9c=9s8s",
      Solver.process("texas-holdem 3dJhQsTdTs 3c4c 8d9c Kc7s Ks8c 7h5d As2c 9s8s"));
  }

  @Test
  public void test_texas_holdem_5232_3c3h6sQsTs_2h4h_6c7h_QcJs_KdKh_ThJc_Ad2s_5c9c_8h4c() {
    assertEquals(
      "2h4h 8h4c 5c9c Ad2s 6c7h ThJc QcJs KdKh",
      Solver.process("texas-holdem 3c3h6sQsTs 2h4h 6c7h QcJs KdKh ThJc Ad2s 5c9c 8h4c"));
  }

  @Test
  public void test_texas_holdem_5233_2c6c8hAcQs_Ks2s_9hJc_9s8c_4d3h_5h6d_QdAh_Kd4h_3sTs() {
    assertEquals(
      "4d3h 3sTs 9hJc Kd4h Ks2s 5h6d 9s8c QdAh",
      Solver.process("texas-holdem 2c6c8hAcQs Ks2s 9hJc 9s8c 4d3h 5h6d QdAh Kd4h 3sTs"));
  }

  @Test
  public void test_texas_holdem_5234_3d4h9cQhTh_2sTs_As7d_4c8s_KcAc_6sJh_KdTc_Ah2h() {
    assertEquals(
      "6sJh As7d KcAc 4c8s 2sTs KdTc Ah2h",
      Solver.process("texas-holdem 3d4h9cQhTh 2sTs As7d 4c8s KcAc 6sJh KdTc Ah2h"));
  }

  @Test
  public void test_texas_holdem_5235_5c7d8cAhTh_AcAd_7s5h_2h7h_9c4d_6cTs() {
    assertEquals(
      "9c4d 2h7h 6cTs 7s5h AcAd",
      Solver.process("texas-holdem 5c7d8cAhTh AcAd 7s5h 2h7h 9c4d 6cTs"));
  }

  @Test
  public void test_texas_holdem_5236_3d6d9dTdTs_5d5h_7h7s_Jh3h_Ah4h_Qd4d_9sAs() {
    assertEquals(
      "Ah4h Jh3h 7h7s 9sAs 5d5h Qd4d",
      Solver.process("texas-holdem 3d6d9dTdTs 5d5h 7h7s Jh3h Ah4h Qd4d 9sAs"));
  }

  @Test
  public void test_texas_holdem_5237_6s8cAsKdTd_3h5d_AhQc_Th6c_JsTs_7cKc_3sJd_9h3d() {
    assertEquals(
      "3h5d 9h3d 3sJd JsTs 7cKc AhQc Th6c",
      Solver.process("texas-holdem 6s8cAsKdTd 3h5d AhQc Th6c JsTs 7cKc 3sJd 9h3d"));
  }

  @Test
  public void test_texas_holdem_5238_3s6cAhJsTd_Qs8c_Jc5h_Tc4c_KsAs_7sQh() {
    assertEquals(
      "7sQh Qs8c Tc4c Jc5h KsAs",
      Solver.process("texas-holdem 3s6cAhJsTd Qs8c Jc5h Tc4c KsAs 7sQh"));
  }

  @Test
  public void test_texas_holdem_5239_3d5d5hAsKs_8h7h_Kc8d_7d9h_6h3c_9s5s_9d6c_Qc2s_4d2c() {
    assertEquals(
      "8h7h 7d9h=9d6c Qc2s 6h3c Kc8d 9s5s 4d2c",
      Solver.process("texas-holdem 3d5d5hAsKs 8h7h Kc8d 7d9h 6h3c 9s5s 9d6c Qc2s 4d2c"));
  }

  @Test
  public void test_texas_holdem_5240_2s4cAhJsKd_5s7s_5h8h_3sQd_3c2d_8d7d() {
    assertEquals(
      "5s7s 5h8h 8d7d 3sQd 3c2d",
      Solver.process("texas-holdem 2s4cAhJsKd 5s7s 5h8h 3sQd 3c2d 8d7d"));
  }

  @Test
  public void test_texas_holdem_5241_2c3h7d8hAc_9h5d_Kh5s_Qc6d_7h3d_Qd2h() {
    assertEquals(
      "9h5d Qc6d Kh5s Qd2h 7h3d",
      Solver.process("texas-holdem 2c3h7d8hAc 9h5d Kh5s Qc6d 7h3d Qd2h"));
  }

  @Test
  public void test_texas_holdem_5242_4c6h8sJdQs_Ad9d_Ah6s_9s3s_KhAs_2hJc_Kc4d_7c5h_Jh7d() {
    assertEquals(
      "9s3s Ad9d KhAs Kc4d Ah6s 2hJc Jh7d 7c5h",
      Solver.process("texas-holdem 4c6h8sJdQs Ad9d Ah6s 9s3s KhAs 2hJc Kc4d 7c5h Jh7d"));
  }

  @Test
  public void test_texas_holdem_5243_3h5c5s7h9s_QsTh_9d3d_6h5h_KhTd_4sTs() {
    assertEquals(
      "4sTs QsTh KhTd 9d3d 6h5h",
      Solver.process("texas-holdem 3h5c5s7h9s QsTh 9d3d 6h5h KhTd 4sTs"));
  }

  @Test
  public void test_texas_holdem_5244_9d9hQcTcTd_8hTs_Qs3d_5cKh_3s8c_KsAs_3h7d_4c2s_Jd7c() {
    assertEquals(
      "3h7d=3s8c=4c2s=Jd7c 5cKh KsAs Qs3d 8hTs",
      Solver.process("texas-holdem 9d9hQcTcTd 8hTs Qs3d 5cKh 3s8c KsAs 3h7d 4c2s Jd7c"));
  }

  @Test
  public void test_texas_holdem_5245_4c7d9cAcAs_8cJc_6s3h_8dTd_4d9s() {
    assertEquals(
      "6s3h 8dTd 4d9s 8cJc",
      Solver.process("texas-holdem 4c7d9cAcAs 8cJc 6s3h 8dTd 4d9s"));
  }

  @Test
  public void test_texas_holdem_5246_4d4h9cJsQh_8s2h_AdAs() {
    assertEquals(
      "8s2h AdAs",
      Solver.process("texas-holdem 4d4h9cJsQh 8s2h AdAs"));
  }

  @Test
  public void test_texas_holdem_5247_2s3d5sAsJh_Ts7s_Th5d_5h3h_8s9s() {
    assertEquals(
      "Th5d 5h3h 8s9s Ts7s",
      Solver.process("texas-holdem 2s3d5sAsJh Ts7s Th5d 5h3h 8s9s"));
  }

  @Test
  public void test_texas_holdem_5248_3s8d9cAcAh_3hJs_5dKh_7c3d() {
    assertEquals(
      "5dKh 7c3d 3hJs",
      Solver.process("texas-holdem 3s8d9cAcAh 3hJs 5dKh 7c3d"));
  }

  @Test
  public void test_texas_holdem_5249_6d7s9dJdJh_7d4d_2sKd() {
    assertEquals(
      "2sKd 7d4d",
      Solver.process("texas-holdem 6d7s9dJdJh 7d4d 2sKd"));
  }

}
