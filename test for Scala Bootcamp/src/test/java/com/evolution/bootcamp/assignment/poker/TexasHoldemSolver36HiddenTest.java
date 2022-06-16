
package com.evolution.bootcamp.assignment.poker;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TexasHoldemSolver36HiddenTest {


  @Test
  public void test_texas_holdem_9000_2d5h8cAsKh_Tc5s_5c2h_9d4c_2cQc_4sQs_4hKd_Ah9s() {
    assertEquals(
      "9d4c 4sQs 2cQc Tc5s 4hKd Ah9s 5c2h",
      Solver.process("texas-holdem 2d5h8cAsKh Tc5s 5c2h 9d4c 2cQc 4sQs 4hKd Ah9s"));
  }

  @Test
  public void test_texas_holdem_9001_4h7dAhKdKh_8hQd_Td6h_9d9c_Ks2c_JsJh_5h7h_5cAc_Qh8d_Ts4c() {
    assertEquals(
      "Td6h 8hQd=Qh8d Ts4c 9d9c JsJh 5cAc Ks2c 5h7h",
      Solver.process("texas-holdem 4h7dAhKdKh 8hQd Td6h 9d9c Ks2c JsJh 5h7h 5cAc Qh8d Ts4c"));
  }

  @Test
  public void test_texas_holdem_9002_4c4d8dQcTh_5s7c_4h5h_Jc4s_Ks2d() {
    assertEquals(
      "5s7c Ks2d 4h5h Jc4s",
      Solver.process("texas-holdem 4c4d8dQcTh 5s7c 4h5h Jc4s Ks2d"));
  }

  @Test
  public void test_texas_holdem_9003_2s6dKcKsTc_Th7d_Ah8h_Td9c_6s3d_2d9d_8d9s() {
    assertEquals(
      "8d9s Ah8h 2d9d 6s3d Th7d Td9c",
      Solver.process("texas-holdem 2s6dKcKsTc Th7d Ah8h Td9c 6s3d 2d9d 8d9s"));
  }

  @Test
  public void test_texas_holdem_9004_3s5hKhKsTs_9h2d_5s8d_Kd5d_7h6c_8c7c_As6d_8sQh() {
    assertEquals(
      "7h6c 8c7c 9h2d 8sQh As6d 5s8d Kd5d",
      Solver.process("texas-holdem 3s5hKhKsTs 9h2d 5s8d Kd5d 7h6c 8c7c As6d 8sQh"));
  }

  @Test
  public void test_texas_holdem_9005_3d5c7dAcQc_6d4h_5dQh() {
    assertEquals(
      "5dQh 6d4h",
      Solver.process("texas-holdem 3d5c7dAcQc 6d4h 5dQh"));
  }

  @Test
  public void test_texas_holdem_9006_2d4d9dJhTh_2h7s_Qc3s_Kc6d_JcKd_6h5s_9cAh_3h9h_Kh3c_8h8d() {
    assertEquals(
      "6h5s Qc3s Kh3c Kc6d 2h7s 8h8d 3h9h 9cAh JcKd",
      Solver.process("texas-holdem 2d4d9dJhTh 2h7s Qc3s Kc6d JcKd 6h5s 9cAh 3h9h Kh3c 8h8d"));
  }

  @Test
  public void test_texas_holdem_9007_3d5h7c7dKd_4s5s_QhJd_8cAd_3c4c_Qd3s() {
    assertEquals(
      "QhJd 8cAd 3c4c=Qd3s 4s5s",
      Solver.process("texas-holdem 3d5h7c7dKd 4s5s QhJd 8cAd 3c4c Qd3s"));
  }

  @Test
  public void test_texas_holdem_9008_6s7s8hJsTd_3s8s_9d5h_Qh7h_2s3c_TsKd_9c9h_Qc5c_Ac2d_Ks8d() {
    assertEquals(
      "2s3c Qc5c Ac2d Qh7h Ks8d TsKd 9c9h=9d5h 3s8s",
      Solver.process("texas-holdem 6s7s8hJsTd 3s8s 9d5h Qh7h 2s3c TsKd 9c9h Qc5c Ac2d Ks8d"));
  }

  @Test
  public void test_texas_holdem_9009_3h6c9c9sJc_8d5h_Ad2d_As9h_3s6d() {
    assertEquals(
      "8d5h Ad2d 3s6d As9h",
      Solver.process("texas-holdem 3h6c9c9sJc 8d5h Ad2d As9h 3s6d"));
  }

  @Test
  public void test_texas_holdem_9010_4d5sAdKhTs_2c6c_5hKs_Jd4h_9h6h_KdJc_Kc8c_AcQd_As6s() {
    assertEquals(
      "2c6c 9h6h Jd4h Kc8c KdJc As6s AcQd 5hKs",
      Solver.process("texas-holdem 4d5sAdKhTs 2c6c 5hKs Jd4h 9h6h KdJc Kc8c AcQd As6s"));
  }

  @Test
  public void test_texas_holdem_9011_6c6d7s8sAc_TcKd_Td9d() {
    assertEquals(
      "TcKd Td9d",
      Solver.process("texas-holdem 6c6d7s8sAc TcKd Td9d"));
  }

  @Test
  public void test_texas_holdem_9012_2h4d7cAcJc_7h5c_3s5h_Kd9h_TdJh() {
    assertEquals(
      "Kd9h 7h5c TdJh 3s5h",
      Solver.process("texas-holdem 2h4d7cAcJc 7h5c 3s5h Kd9h TdJh"));
  }

  @Test
  public void test_texas_holdem_9013_8dAcJsKsQc_Ad4s_5h8s_3d7d_7c5s() {
    assertEquals(
      "3d7d=7c5s 5h8s Ad4s",
      Solver.process("texas-holdem 8dAcJsKsQc Ad4s 5h8s 3d7d 7c5s"));
  }

  @Test
  public void test_texas_holdem_9014_2s6c8cKhTs_Kc5s_3sQd_Qh2h_5h8h_7c4h() {
    assertEquals(
      "7c4h 3sQd Qh2h 5h8h Kc5s",
      Solver.process("texas-holdem 2s6c8cKhTs Kc5s 3sQd Qh2h 5h8h 7c4h"));
  }

  @Test
  public void test_texas_holdem_9015_4d6c7c8d9h_7hQc_Qh5d() {
    assertEquals(
      "7hQc Qh5d",
      Solver.process("texas-holdem 4d6c7c8d9h 7hQc Qh5d"));
  }

  @Test
  public void test_texas_holdem_9016_2c6hAdJsTs_8d9d_Jc5s_7hTc_2dQs() {
    assertEquals(
      "8d9d 2dQs 7hTc Jc5s",
      Solver.process("texas-holdem 2c6hAdJsTs 8d9d Jc5s 7hTc 2dQs"));
  }

  @Test
  public void test_texas_holdem_9017_5d8s9d9sJs_9c8d_7cKh_Ts5h() {
    assertEquals(
      "7cKh Ts5h 9c8d",
      Solver.process("texas-holdem 5d8s9d9sJs 9c8d 7cKh Ts5h"));
  }

  @Test
  public void test_texas_holdem_9018_7c8cKcKsTh_Qd9h_3dAc_Jd6h_7d5c() {
    assertEquals(
      "Jd6h Qd9h 3dAc 7d5c",
      Solver.process("texas-holdem 7c8cKcKsTh Qd9h 3dAc Jd6h 7d5c"));
  }

  @Test
  public void test_texas_holdem_9019_6d7s9cAdTh_Ks4d_3dJc_6c5h_Td2d_2c8h_3cKc_4s5c_JhAh() {
    assertEquals(
      "4s5c 3dJc 3cKc=Ks4d 6c5h Td2d JhAh 2c8h",
      Solver.process("texas-holdem 6d7s9cAdTh Ks4d 3dJc 6c5h Td2d 2c8h 3cKc 4s5c JhAh"));
  }

  @Test
  public void test_texas_holdem_9020_5h6s9h9sJs_Qs5d_AdKc_2d7s_Kd3d_4cTd_JcAh_8sJd() {
    assertEquals(
      "2d7s 4cTd Kd3d AdKc Qs5d 8sJd JcAh",
      Solver.process("texas-holdem 5h6s9h9sJs Qs5d AdKc 2d7s Kd3d 4cTd JcAh 8sJd"));
  }

  @Test
  public void test_texas_holdem_9021_4c4d4h6s7c_Qc9c_Th8s_6d6c_9s6h_7s7h_Jh3s_5s2h_JsJc_2d3h() {
    assertEquals(
      "2d3h=5s2h Th8s Jh3s Qc9c 9s6h JsJc 6d6c 7s7h",
      Solver.process("texas-holdem 4c4d4h6s7c Qc9c Th8s 6d6c 9s6h 7s7h Jh3s 5s2h JsJc 2d3h"));
  }

  @Test
  public void test_texas_holdem_9022_2d3d5h6hJd_KdJc_9hAs_TcKh_7d5c_Ad8s_ThQc_Td5s_4d7h() {
    assertEquals(
      "ThQc TcKh Ad8s 9hAs 7d5c Td5s KdJc 4d7h",
      Solver.process("texas-holdem 2d3d5h6hJd KdJc 9hAs TcKh 7d5c Ad8s ThQc Td5s 4d7h"));
  }

  @Test
  public void test_texas_holdem_9023_3c4s7s9hTc_9c6h_2cAc() {
    assertEquals(
      "2cAc 9c6h",
      Solver.process("texas-holdem 3c4s7s9hTc 9c6h 2cAc"));
  }

  @Test
  public void test_texas_holdem_9024_AhJcJhQdTh_7d9s_8d8s_3c2s_4dAc_Kh3h_As8c_2hQc_9d6d() {
    assertEquals(
      "3c2s=7d9s=9d6d 8d8s 2hQc 4dAc=As8c Kh3h",
      Solver.process("texas-holdem AhJcJhQdTh 7d9s 8d8s 3c2s 4dAc Kh3h As8c 2hQc 9d6d"));
  }

  @Test
  public void test_texas_holdem_9025_2h8d9dJsKc_3c6d_Ts8c_3d7d_7h9s_5cQc_Ah7c_4c9c() {
    assertEquals(
      "3c6d 3d7d 5cQc Ah7c Ts8c 4c9c=7h9s",
      Solver.process("texas-holdem 2h8d9dJsKc 3c6d Ts8c 3d7d 7h9s 5cQc Ah7c 4c9c"));
  }

  @Test
  public void test_texas_holdem_9026_5c6c6sAsTh_Jh4h_Jc3s_JdTs_2h7d_Kc2s_Kd9d() {
    assertEquals(
      "2h7d Jc3s=Jh4h Kc2s=Kd9d JdTs",
      Solver.process("texas-holdem 5c6c6sAsTh Jh4h Jc3s JdTs 2h7d Kc2s Kd9d"));
  }

  @Test
  public void test_texas_holdem_9027_2d6d7s8cTc_9dTh_5hAc_8h3s_4h5s_4cKs_2c8s_6h5d() {
    assertEquals(
      "4cKs 5hAc 6h5d 8h3s 2c8s 4h5s 9dTh",
      Solver.process("texas-holdem 2d6d7s8cTc 9dTh 5hAc 8h3s 4h5s 4cKs 2c8s 6h5d"));
  }

  @Test
  public void test_texas_holdem_9028_6d8h9sQdQs_5cQh_6c2d_8s8d_Kd3c_TsJd_7h7c_3hKh() {
    assertEquals(
      "3hKh=Kd3c 6c2d 7h7c 5cQh TsJd 8s8d",
      Solver.process("texas-holdem 6d8h9sQdQs 5cQh 6c2d 8s8d Kd3c TsJd 7h7c 3hKh"));
  }

  @Test
  public void test_texas_holdem_9029_3d6d7d8hJc_7c3s_2s7h_Ad5h_4h2h_JdAs_KcQd() {
    assertEquals(
      "4h2h KcQd Ad5h 2s7h JdAs 7c3s",
      Solver.process("texas-holdem 3d6d7d8hJc 7c3s 2s7h Ad5h 4h2h JdAs KcQd"));
  }

  @Test
  public void test_texas_holdem_9030_4d7c8h9sKh_Td8c_Ad2h_8s2d_6c5d_Qh7h() {
    assertEquals(
      "Ad2h Qh7h 8s2d Td8c 6c5d",
      Solver.process("texas-holdem 4d7c8h9sKh Td8c Ad2h 8s2d 6c5d Qh7h"));
  }

  @Test
  public void test_texas_holdem_9031_3c8d9dAhAs_2h7s_8cKd_JdQs_Ad5d_6c8h_Qc2s_Kc3s() {
    assertEquals(
      "2h7s Qc2s JdQs Kc3s 6c8h 8cKd Ad5d",
      Solver.process("texas-holdem 3c8d9dAhAs 2h7s 8cKd JdQs Ad5d 6c8h Qc2s Kc3s"));
  }

  @Test
  public void test_texas_holdem_9032_4c4h6c9hAs_2sKc_Jh5d() {
    assertEquals(
      "Jh5d 2sKc",
      Solver.process("texas-holdem 4c4h6c9hAs 2sKc Jh5d"));
  }

  @Test
  public void test_texas_holdem_9033_3c6d9c9dJh_TsQh_8dTc_4sQs_Ac2c_2hJd_8s3d_7h8h_TdQc_KhJc() {
    assertEquals(
      "7h8h 8dTc 4sQs TdQc=TsQh Ac2c 8s3d 2hJd KhJc",
      Solver.process("texas-holdem 3c6d9c9dJh TsQh 8dTc 4sQs Ac2c 2hJd 8s3d 7h8h TdQc KhJc"));
  }

  @Test
  public void test_texas_holdem_9034_6c7sAsKhTs_4c4s_5s6d_Kd2d_AdKc_6s7h() {
    assertEquals(
      "4c4s 5s6d Kd2d 6s7h AdKc",
      Solver.process("texas-holdem 6c7sAsKhTs 4c4s 5s6d Kd2d AdKc 6s7h"));
  }

  @Test
  public void test_texas_holdem_9035_5d6dJsKdKs_9s8h_QhJd() {
    assertEquals(
      "9s8h QhJd",
      Solver.process("texas-holdem 5d6dJsKdKs 9s8h QhJd"));
  }

  @Test
  public void test_texas_holdem_9036_3h4dAsJdQs_TsKd_2hTc_7dKh_6h6c_9h4h_2dQh_Js6s_Ad5d_8s4c() {
    assertEquals(
      "2hTc 7dKh 8s4c=9h4h 6h6c Js6s 2dQh Ad5d TsKd",
      Solver.process("texas-holdem 3h4dAsJdQs TsKd 2hTc 7dKh 6h6c 9h4h 2dQh Js6s Ad5d 8s4c"));
  }

  @Test
  public void test_texas_holdem_9037_4h7d7sAdQd_2c6d_7c3h_8h7h_9cQh() {
    assertEquals(
      "2c6d 9cQh 7c3h=8h7h",
      Solver.process("texas-holdem 4h7d7sAdQd 2c6d 7c3h 8h7h 9cQh"));
  }

  @Test
  public void test_texas_holdem_9038_8cAcJcJsKd_2d8h_7s8s_4s6d_Th2h_9h5d_4hKs() {
    assertEquals(
      "4s6d 9h5d Th2h 2d8h=7s8s 4hKs",
      Solver.process("texas-holdem 8cAcJcJsKd 2d8h 7s8s 4s6d Th2h 9h5d 4hKs"));
  }

  @Test
  public void test_texas_holdem_9039_2c4h8s9cQh_2hAs_Td6h_JcJd_2s6d() {
    assertEquals(
      "Td6h 2s6d 2hAs JcJd",
      Solver.process("texas-holdem 2c4h8s9cQh 2hAs Td6h JcJd 2s6d"));
  }

  @Test
  public void test_texas_holdem_9040_2s3s5c7cAc_3d7h_Jd4d_AdAh_6c9s_8sAs_QhTd_Jh8d_QdKd() {
    assertEquals(
      "6c9s Jh8d QhTd QdKd 8sAs 3d7h AdAh Jd4d",
      Solver.process("texas-holdem 2s3s5c7cAc 3d7h Jd4d AdAh 6c9s 8sAs QhTd Jh8d QdKd"));
  }

  @Test
  public void test_texas_holdem_9041_3c5d7hAcKs_Qs9d_2cQh_8s5h_9s7s_2s2d_Ts4s_Kc3d_As3s_ThAd() {
    assertEquals(
      "Ts4s 2cQh Qs9d 2s2d 8s5h 9s7s ThAd Kc3d As3s",
      Solver.process("texas-holdem 3c5d7hAcKs Qs9d 2cQh 8s5h 9s7s 2s2d Ts4s Kc3d As3s ThAd"));
  }

  @Test
  public void test_texas_holdem_9042_2d4c7d8c8h_Jc8d_AcKc_3cKs() {
    assertEquals(
      "3cKs AcKc Jc8d",
      Solver.process("texas-holdem 2d4c7d8c8h Jc8d AcKc 3cKs"));
  }

  @Test
  public void test_texas_holdem_9043_2h6c9hKhTh_5sAs_5h2c_5d8c_5c8h_8s7h() {
    assertEquals(
      "5d8c 5sAs 5h2c 8s7h 5c8h",
      Solver.process("texas-holdem 2h6c9hKhTh 5sAs 5h2c 5d8c 5c8h 8s7h"));
  }

  @Test
  public void test_texas_holdem_9044_2s4d4s6sQs_6cTs_7s5h_8s3d_TcTd_JdJs_Ac9c_ThKs_4h3h_9h4c() {
    assertEquals(
      "Ac9c TcTd 4h3h 9h4c 7s5h 8s3d 6cTs JdJs ThKs",
      Solver.process("texas-holdem 2s4d4s6sQs 6cTs 7s5h 8s3d TcTd JdJs Ac9c ThKs 4h3h 9h4c"));
  }

  @Test
  public void test_texas_holdem_9045_2c4c5dAcJc_KhQd_4hAh_5c6c_3d6s_QsJh_TcTh_JdJs_2s9s() {
    assertEquals(
      "KhQd 2s9s QsJh 4hAh JdJs 3d6s 5c6c TcTh",
      Solver.process("texas-holdem 2c4c5dAcJc KhQd 4hAh 5c6c 3d6s QsJh TcTh JdJs 2s9s"));
  }

  @Test
  public void test_texas_holdem_9046_3c6d7d8d9c_3hQs_AhJc() {
    assertEquals(
      "AhJc 3hQs",
      Solver.process("texas-holdem 3c6d7d8d9c 3hQs AhJc"));
  }

  @Test
  public void test_texas_holdem_9047_2h4d7h7sJd_JhQd_9s5d_As3c_6dKc_Qc3s_4c8s() {
    assertEquals(
      "9s5d Qc3s 6dKc As3c 4c8s JhQd",
      Solver.process("texas-holdem 2h4d7h7sJd JhQd 9s5d As3c 6dKc Qc3s 4c8s"));
  }

  @Test
  public void test_texas_holdem_9048_4d5hJdKhTc_9c4h_4c5c() {
    assertEquals(
      "9c4h 4c5c",
      Solver.process("texas-holdem 4d5hJdKhTc 9c4h 4c5c"));
  }

  @Test
  public void test_texas_holdem_9049_9cAdAhQhTc_2h5c_Kh7s_Ks7c() {
    assertEquals(
      "2h5c Kh7s=Ks7c",
      Solver.process("texas-holdem 9cAdAhQhTc 2h5c Kh7s Ks7c"));
  }

  @Test
  public void test_texas_holdem_9050_2d2s4d5c5h_3dQc_7hTc_ThAh_2c2h_AdJc() {
    assertEquals(
      "7hTc 3dQc AdJc=ThAh 2c2h",
      Solver.process("texas-holdem 2d2s4d5c5h 3dQc 7hTc ThAh 2c2h AdJc"));
  }

  @Test
  public void test_texas_holdem_9051_2c8d9cKdTs_As7d_TcJd_Td2s_3c6s_JsKs_Qd5s_Kc9h_QcJc() {
    assertEquals(
      "3c6s Qd5s As7d TcJd JsKs Td2s Kc9h QcJc",
      Solver.process("texas-holdem 2c8d9cKdTs As7d TcJd Td2s 3c6s JsKs Qd5s Kc9h QcJc"));
  }

  @Test
  public void test_texas_holdem_9052_6h8dAcJdQd_QhKs_4c8s_Kd5d_3h4s_Td6s_5h7s() {
    assertEquals(
      "3h4s 5h7s Td6s 4c8s QhKs Kd5d",
      Solver.process("texas-holdem 6h8dAcJdQd QhKs 4c8s Kd5d 3h4s Td6s 5h7s"));
  }

  @Test
  public void test_texas_holdem_9053_4h9h9sQhTs_AhAc_QdJs_8s8h_Ad9c_4d6d_Kh5s_5cTh() {
    assertEquals(
      "Kh5s 4d6d 8s8h 5cTh QdJs AhAc Ad9c",
      Solver.process("texas-holdem 4h9h9sQhTs AhAc QdJs 8s8h Ad9c 4d6d Kh5s 5cTh"));
  }

  @Test
  public void test_texas_holdem_9054_4d6s9dAdQc_2s4s_3hJd_5s3s_Ac8d() {
    assertEquals(
      "5s3s 3hJd 2s4s Ac8d",
      Solver.process("texas-holdem 4d6s9dAdQc 2s4s 3hJd 5s3s Ac8d"));
  }

  @Test
  public void test_texas_holdem_9055_3c5h7c9hTs_2cQs_3sJd_Jc4d_Ks9c_6dKc_4s6s_8hAs() {
    assertEquals(
      "Jc4d 2cQs 6dKc 8hAs 3sJd Ks9c 4s6s",
      Solver.process("texas-holdem 3c5h7c9hTs 2cQs 3sJd Jc4d Ks9c 6dKc 4s6s 8hAs"));
  }

  @Test
  public void test_texas_holdem_9056_4d8c9hKsQc_9s7d_JdQh() {
    assertEquals(
      "9s7d JdQh",
      Solver.process("texas-holdem 4d8c9hKsQc 9s7d JdQh"));
  }

  @Test
  public void test_texas_holdem_9057_3c4h5c9cAs_8hKd_KsAh() {
    assertEquals(
      "8hKd KsAh",
      Solver.process("texas-holdem 3c4h5c9cAs 8hKd KsAh"));
  }

  @Test
  public void test_texas_holdem_9058_6sAcJhKhQd_9s4c_As8d_QhQc() {
    assertEquals(
      "9s4c As8d QhQc",
      Solver.process("texas-holdem 6sAcJhKhQd 9s4c As8d QhQc"));
  }

  @Test
  public void test_texas_holdem_9059_4h6c7d9sQc_9cKh_9d8s_6s7s_4c3s_5hQs() {
    assertEquals(
      "4c3s 9d8s 9cKh 5hQs 6s7s",
      Solver.process("texas-holdem 4h6c7d9sQc 9cKh 9d8s 6s7s 4c3s 5hQs"));
  }

  @Test
  public void test_texas_holdem_9060_3d5h6d8cTd_Ah7h_7dKh_7c9c() {
    assertEquals(
      "7dKh Ah7h 7c9c",
      Solver.process("texas-holdem 3d5h6d8cTd Ah7h 7dKh 7c9c"));
  }

  @Test
  public void test_texas_holdem_9061_5d8dAcAsKd_9s6s_2s2d() {
    assertEquals(
      "9s6s 2s2d",
      Solver.process("texas-holdem 5d8dAcAsKd 9s6s 2s2d"));
  }

  @Test
  public void test_texas_holdem_9062_2s7c9sAsKc_AcTc_6c9d_8c4d_2c5h_6s3d_4h2h_4c5c_4sAd() {
    assertEquals(
      "4c5c 6s3d 8c4d 2c5h=4h2h 6c9d 4sAd AcTc",
      Solver.process("texas-holdem 2s7c9sAsKc AcTc 6c9d 8c4d 2c5h 6s3d 4h2h 4c5c 4sAd"));
  }

  @Test
  public void test_texas_holdem_9063_2h7cAsJhKs_2s4s_3c9d_Ah6s() {
    assertEquals(
      "3c9d 2s4s Ah6s",
      Solver.process("texas-holdem 2h7cAsJhKs 2s4s 3c9d Ah6s"));
  }

  @Test
  public void test_texas_holdem_9064_3d5c5sAhJc_Js7c_KsKh_Tc8d_8s9d_Qs7s_2h9s_AdJd_9hJh() {
    assertEquals(
      "2h9s=8s9d Tc8d Qs7s 9hJh=Js7c KsKh AdJd",
      Solver.process("texas-holdem 3d5c5sAhJc Js7c KsKh Tc8d 8s9d Qs7s 2h9s AdJd 9hJh"));
  }

  @Test
  public void test_texas_holdem_9065_3c5sQcTcTd_4dAs_Ks6s_3sJs() {
    assertEquals(
      "Ks6s 4dAs 3sJs",
      Solver.process("texas-holdem 3c5sQcTcTd 4dAs Ks6s 3sJs"));
  }

  @Test
  public void test_texas_holdem_9066_8dAhJhJsKh_JdJc_ThKd_7h6d() {
    assertEquals(
      "7h6d ThKd JdJc",
      Solver.process("texas-holdem 8dAhJhJsKh JdJc ThKd 7h6d"));
  }

  @Test
  public void test_texas_holdem_9067_3s4h8h9hJd_5c2c_KsJs_6h5h_Kh7s_Qs7d() {
    assertEquals(
      "5c2c Qs7d Kh7s KsJs 6h5h",
      Solver.process("texas-holdem 3s4h8h9hJd 5c2c KsJs 6h5h Kh7s Qs7d"));
  }

  @Test
  public void test_texas_holdem_9068_2h2s8h9dTd_8dAc_4d9h() {
    assertEquals(
      "8dAc 4d9h",
      Solver.process("texas-holdem 2h2s8h9dTd 8dAc 4d9h"));
  }

  @Test
  public void test_texas_holdem_9069_3c4d6h7cAc_3sJh_4c7h_9hJd_QcKd_AsKs() {
    assertEquals(
      "9hJd QcKd 3sJh AsKs 4c7h",
      Solver.process("texas-holdem 3c4d6h7cAc 3sJh 4c7h 9hJd QcKd AsKs"));
  }

  @Test
  public void test_texas_holdem_9070_5c8cAhJdTh_Ts4d_7s2h_9cKs_2d7c_8d9s_Qc7d() {
    assertEquals(
      "2d7c=7s2h Qc7d 9cKs 8d9s Ts4d",
      Solver.process("texas-holdem 5c8cAhJdTh Ts4d 7s2h 9cKs 2d7c 8d9s Qc7d"));
  }

  @Test
  public void test_texas_holdem_9071_9hJhQhTdTh_AcKs_5c9s() {
    assertEquals(
      "5c9s AcKs",
      Solver.process("texas-holdem 9hJhQhTdTh AcKs 5c9s"));
  }

  @Test
  public void test_texas_holdem_9072_2c3d7hAdKd_7s5d_Kc4h_8cKs_5hJs() {
    assertEquals(
      "5hJs 7s5d Kc4h 8cKs",
      Solver.process("texas-holdem 2c3d7hAdKd 7s5d Kc4h 8cKs 5hJs"));
  }

  @Test
  public void test_texas_holdem_9073_5c8dJdQhTs_As7c_JcAc() {
    assertEquals(
      "As7c JcAc",
      Solver.process("texas-holdem 5c8dJdQhTs As7c JcAc"));
  }

  @Test
  public void test_texas_holdem_9074_5d6d9cKcTs_5c2h_7c4c() {
    assertEquals(
      "7c4c 5c2h",
      Solver.process("texas-holdem 5d6d9cKcTs 5c2h 7c4c"));
  }

  @Test
  public void test_texas_holdem_9075_2h4s6c8cJd_Qs9h_7s6s_3s4c_4h4d() {
    assertEquals(
      "Qs9h 3s4c 7s6s 4h4d",
      Solver.process("texas-holdem 2h4s6c8cJd Qs9h 7s6s 3s4c 4h4d"));
  }

  @Test
  public void test_texas_holdem_9076_5h6s9cAcJs_3c4s_3d5s_5d6c_AhTs_9dAd_8sQd_5cJd_7s7d_Qh3s() {
    assertEquals(
      "3c4s Qh3s 8sQd 3d5s 7s7d AhTs 5d6c 5cJd 9dAd",
      Solver.process("texas-holdem 5h6s9cAcJs 3c4s 3d5s 5d6c AhTs 9dAd 8sQd 5cJd 7s7d Qh3s"));
  }

  @Test
  public void test_texas_holdem_9077_4h4s8c9sTc_5c9d_9h6s_5sTd_Qd3c_Ts2s_4dJh() {
    assertEquals(
      "Qd3c 5c9d=9h6s 5sTd=Ts2s 4dJh",
      Solver.process("texas-holdem 4h4s8c9sTc 5c9d 9h6s 5sTd Qd3c Ts2s 4dJh"));
  }

  @Test
  public void test_texas_holdem_9078_2d5c6dAhTc_Jc9h_6sQc_Td3d_5sTs_3cKd_9cKh_Ad4c() {
    assertEquals(
      "Jc9h 3cKd 9cKh 6sQc Td3d Ad4c 5sTs",
      Solver.process("texas-holdem 2d5c6dAhTc Jc9h 6sQc Td3d 5sTs 3cKd 9cKh Ad4c"));
  }

  @Test
  public void test_texas_holdem_9079_4h5hAsJcQc_Kh6c_9s7d_2s5d_QdJh_9c9d_3h7h() {
    assertEquals(
      "3h7h 9s7d Kh6c 2s5d 9c9d QdJh",
      Solver.process("texas-holdem 4h5hAsJcQc Kh6c 9s7d 2s5d QdJh 9c9d 3h7h"));
  }

  @Test
  public void test_texas_holdem_9080_4h6cAcAsJd_6d7s_Kc2s_JhTd_7d3c_Qh6s_3h3d() {
    assertEquals(
      "7d3c Kc2s 3h3d 6d7s Qh6s JhTd",
      Solver.process("texas-holdem 4h6cAcAsJd 6d7s Kc2s JhTd 7d3c Qh6s 3h3d"));
  }

  @Test
  public void test_texas_holdem_9081_2s4d4sKsTc_9c6d_Js7d_Ah3c_Qc8c() {
    assertEquals(
      "9c6d Js7d Qc8c Ah3c",
      Solver.process("texas-holdem 2s4d4sKsTc 9c6d Js7d Ah3c Qc8c"));
  }

  @Test
  public void test_texas_holdem_9082_2s4c5d7cQd_8h9h_9cTh_KsAc_3s6c_Qc8s_3cKc_2d3d_Jh6d() {
    assertEquals(
      "8h9h 9cTh Jh6d 3cKc KsAc 2d3d Qc8s 3s6c",
      Solver.process("texas-holdem 2s4c5d7cQd 8h9h 9cTh KsAc 3s6c Qc8s 3cKc 2d3d Jh6d"));
  }

  @Test
  public void test_texas_holdem_9083_2s4h6d6sAd_8d9s_Ks7d() {
    assertEquals(
      "8d9s Ks7d",
      Solver.process("texas-holdem 2s4h6d6sAd 8d9s Ks7d"));
  }

  @Test
  public void test_texas_holdem_9084_2s4cQdQsTd_AcQh_JdKc_8s7c_9h4d() {
    assertEquals(
      "8s7c JdKc 9h4d AcQh",
      Solver.process("texas-holdem 2s4cQdQsTd AcQh JdKc 8s7c 9h4d"));
  }

  @Test
  public void test_texas_holdem_9085_8d9hJsQcTs_Qh4s_AdKd_5s5h_Td3s_8sAc_5cKh() {
    assertEquals(
      "5s5h=8sAc=Qh4s=Td3s 5cKh AdKd",
      Solver.process("texas-holdem 8d9hJsQcTs Qh4s AdKd 5s5h Td3s 8sAc 5cKh"));
  }

  @Test
  public void test_texas_holdem_9086_3s5h7h8hJs_Td7s_4hKs_7dAd_QcTh_9c2c() {
    assertEquals(
      "9c2c QcTh 4hKs Td7s 7dAd",
      Solver.process("texas-holdem 3s5h7h8hJs Td7s 4hKs 7dAd QcTh 9c2c"));
  }

  @Test
  public void test_texas_holdem_9087_2s5d9dKsTc_JsTd_Ad8d_6sQs_JcTs_KdQh_Ah7c_Jh8c_6c8h() {
    assertEquals(
      "6c8h Jh8c 6sQs Ah7c Ad8d JcTs=JsTd KdQh",
      Solver.process("texas-holdem 2s5d9dKsTc JsTd Ad8d 6sQs JcTs KdQh Ah7c Jh8c 6c8h"));
  }

  @Test
  public void test_texas_holdem_9088_2d3c6hAdAs_3sJc_4dKc() {
    assertEquals(
      "4dKc 3sJc",
      Solver.process("texas-holdem 2d3c6hAdAs 3sJc 4dKc"));
  }

  @Test
  public void test_texas_holdem_9089_4d6s7c8dAd_JsQc_8s2c_2dJc() {
    assertEquals(
      "2dJc JsQc 8s2c",
      Solver.process("texas-holdem 4d6s7c8dAd JsQc 8s2c 2dJc"));
  }

  @Test
  public void test_texas_holdem_9090_3c4c6d7hAh_Kd9d_7cQs_Ad3s_TcJh_2c9h_9cQd_2d8h_5c2s() {
    assertEquals(
      "2d8h 2c9h TcJh 9cQd Kd9d 7cQs Ad3s 5c2s",
      Solver.process("texas-holdem 3c4c6d7hAh Kd9d 7cQs Ad3s TcJh 2c9h 9cQd 2d8h 5c2s"));
  }

  @Test
  public void test_texas_holdem_9091_3h6dJcQhQs_Jd8s_JhQd() {
    assertEquals(
      "Jd8s JhQd",
      Solver.process("texas-holdem 3h6dJcQhQs Jd8s JhQd"));
  }

  @Test
  public void test_texas_holdem_9092_4d5c8s9cAd_8dJd_AsQc_AhKd_5hQd() {
    assertEquals(
      "5hQd 8dJd AsQc AhKd",
      Solver.process("texas-holdem 4d5c8s9cAd 8dJd AsQc AhKd 5hQd"));
  }

  @Test
  public void test_texas_holdem_9093_3c3h9sAdQd_7h3d_7c8h_2cKs() {
    assertEquals(
      "7c8h 2cKs 7h3d",
      Solver.process("texas-holdem 3c3h9sAdQd 7h3d 7c8h 2cKs"));
  }

  @Test
  public void test_texas_holdem_9094_6d8hJsQcTs_2d2s_7c9d_Kh9c_9s5c_As3s_4c9h_ThQh_5sQd_6s3h() {
    assertEquals(
      "As3s 2d2s 6s3h 5sQd ThQh 4c9h=7c9d=9s5c Kh9c",
      Solver.process("texas-holdem 6d8hJsQcTs 2d2s 7c9d Kh9c 9s5c As3s 4c9h ThQh 5sQd 6s3h"));
  }

  @Test
  public void test_texas_holdem_9095_2s4d6d7c7h_Td6s_9cKs_9d3s_Kc2c() {
    assertEquals(
      "9d3s 9cKs Kc2c Td6s",
      Solver.process("texas-holdem 2s4d6d7c7h Td6s 9cKs 9d3s Kc2c"));
  }

  @Test
  public void test_texas_holdem_9096_2c2h7c9hKh_Ac3s_8c8d_9s4h_4dQh_4s7s() {
    assertEquals(
      "4dQh Ac3s 4s7s 8c8d 9s4h",
      Solver.process("texas-holdem 2c2h7c9hKh Ac3s 8c8d 9s4h 4dQh 4s7s"));
  }

  @Test
  public void test_texas_holdem_9097_4c7hKcQhTs_ThTd_AdAs_7d7c_9c3d_4sAc_5c5d_Kd2s_4h8c() {
    assertEquals(
      "9c3d 4h8c 4sAc 5c5d Kd2s AdAs 7d7c ThTd",
      Solver.process("texas-holdem 4c7hKcQhTs ThTd AdAs 7d7c 9c3d 4sAc 5c5d Kd2s 4h8c"));
  }

  @Test
  public void test_texas_holdem_9098_3c3d5s6d7h_5d5h_2c7c_2d3h() {
    assertEquals(
      "2c7c 2d3h 5d5h",
      Solver.process("texas-holdem 3c3d5s6d7h 5d5h 2c7c 2d3h"));
  }

  @Test
  public void test_texas_holdem_9099_2c6c7d8sTs_QsKh_Jh4s_2d3h_5hTd_Ad8d_QhQd() {
    assertEquals(
      "Jh4s QsKh 2d3h Ad8d 5hTd QhQd",
      Solver.process("texas-holdem 2c6c7d8sTs QsKh Jh4s 2d3h 5hTd Ad8d QhQd"));
  }

  @Test
  public void test_texas_holdem_9100_5h7c9cAsQs_6h3d_7s5s() {
    assertEquals(
      "6h3d 7s5s",
      Solver.process("texas-holdem 5h7c9cAsQs 6h3d 7s5s"));
  }

  @Test
  public void test_texas_holdem_9101_2c4d8hAsTd_9cKs_Jh5h_Ts7s_3h3c_7cKd_3s4c_JdKc_Th8c() {
    assertEquals(
      "Jh5h 7cKd 9cKs JdKc 3h3c 3s4c Ts7s Th8c",
      Solver.process("texas-holdem 2c4d8hAsTd 9cKs Jh5h Ts7s 3h3c 7cKd 3s4c JdKc Th8c"));
  }

  @Test
  public void test_texas_holdem_9102_9cAhKdQhTd_4hTs_QsKs_Jc2h_4dJd_9h5d_QdAs_Jh5h() {
    assertEquals(
      "9h5d 4hTs QsKs QdAs 4dJd=Jc2h=Jh5h",
      Solver.process("texas-holdem 9cAhKdQhTd 4hTs QsKs Jc2h 4dJd 9h5d QdAs Jh5h"));
  }

  @Test
  public void test_texas_holdem_9103_4h4s5h8cQh_8sAd_5sTh_KdAc_Qd4c_6d5c() {
    assertEquals(
      "KdAc 5sTh=6d5c 8sAd Qd4c",
      Solver.process("texas-holdem 4h4s5h8cQh 8sAd 5sTh KdAc Qd4c 6d5c"));
  }

  @Test
  public void test_texas_holdem_9104_2s3d4s8c9s_8sTd_Kh8h_JsTh_KdAs_6dJh() {
    assertEquals(
      "6dJh JsTh KdAs 8sTd Kh8h",
      Solver.process("texas-holdem 2s3d4s8c9s 8sTd Kh8h JsTh KdAs 6dJh"));
  }

  @Test
  public void test_texas_holdem_9105_2d2h5dQcQs_9sQh_8s7s_Th5c_7c3h_Js8c_6s6d_4cAs() {
    assertEquals(
      "7c3h 8s7s Js8c 4cAs Th5c 6s6d 9sQh",
      Solver.process("texas-holdem 2d2h5dQcQs 9sQh 8s7s Th5c 7c3h Js8c 6s6d 4cAs"));
  }

  @Test
  public void test_texas_holdem_9106_3d5s7hKdKs_ThAh_2c7c_TdJs_2d9d() {
    assertEquals(
      "2d9d TdJs ThAh 2c7c",
      Solver.process("texas-holdem 3d5s7hKdKs ThAh 2c7c TdJs 2d9d"));
  }

  @Test
  public void test_texas_holdem_9107_8c9h9sQhTd_5h8d_3c2c() {
    assertEquals(
      "3c2c 5h8d",
      Solver.process("texas-holdem 8c9h9sQhTd 5h8d 3c2c"));
  }

  @Test
  public void test_texas_holdem_9108_3h4d7h8h9c_8d4s_9dQh_6d2h_As9s() {
    assertEquals(
      "6d2h 9dQh As9s 8d4s",
      Solver.process("texas-holdem 3h4d7h8h9c 8d4s 9dQh 6d2h As9s"));
  }

  @Test
  public void test_texas_holdem_9109_2h3c4c4hQd_Kd2s_9h8c_AdJh_Qh6c_As7h_5cJs_2c3d() {
    assertEquals(
      "9h8c 5cJs As7h AdJh Kd2s 2c3d Qh6c",
      Solver.process("texas-holdem 2h3c4c4hQd Kd2s 9h8c AdJh Qh6c As7h 5cJs 2c3d"));
  }

  @Test
  public void test_texas_holdem_9110_4s5dAsQdQs_4cAh_8h2h_7d5c_Qc4h_KcJd_2s6d_2cAc() {
    assertEquals(
      "2s6d 8h2h KcJd 7d5c 2cAc=4cAh Qc4h",
      Solver.process("texas-holdem 4s5dAsQdQs 4cAh 8h2h 7d5c Qc4h KcJd 2s6d 2cAc"));
  }

  @Test
  public void test_texas_holdem_9111_3h7h9dAhQd_Ks7s_Qs8s() {
    assertEquals(
      "Ks7s Qs8s",
      Solver.process("texas-holdem 3h7h9dAhQd Ks7s Qs8s"));
  }

  @Test
  public void test_texas_holdem_9112_3h7d7h8d9d_4c3s_7sTc_9s6d_8c2d_Ts4s_9c2s() {
    assertEquals(
      "Ts4s 4c3s 8c2d 9c2s=9s6d 7sTc",
      Solver.process("texas-holdem 3h7d7h8d9d 4c3s 7sTc 9s6d 8c2d Ts4s 9c2s"));
  }

  @Test
  public void test_texas_holdem_9113_4h7cJsKhQs_Ac6c_4c9s_5s8c() {
    assertEquals(
      "5s8c Ac6c 4c9s",
      Solver.process("texas-holdem 4h7cJsKhQs Ac6c 4c9s 5s8c"));
  }

  @Test
  public void test_texas_holdem_9114_2s6sAdAsKd_7c6c_6dQs_4hKs() {
    assertEquals(
      "6dQs=7c6c 4hKs",
      Solver.process("texas-holdem 2s6sAdAsKd 7c6c 6dQs 4hKs"));
  }

  @Test
  public void test_texas_holdem_9115_4d6s7c8sTd_5d9h_AhAc_Js5c_Ts9c_JcJh_2d4s_Qs3d_Kd3s() {
    assertEquals(
      "Qs3d Kd3s 2d4s JcJh AhAc Js5c 5d9h=Ts9c",
      Solver.process("texas-holdem 4d6s7c8sTd 5d9h AhAc Js5c Ts9c JcJh 2d4s Qs3d Kd3s"));
  }

  @Test
  public void test_texas_holdem_9116_4cAcJhKdQc_6s8s_Th4h_Qh7c_8h9s() {
    assertEquals(
      "6s8s 8h9s Qh7c Th4h",
      Solver.process("texas-holdem 4cAcJhKdQc 6s8s Th4h Qh7c 8h9s"));
  }

  @Test
  public void test_texas_holdem_9117_3h4h7cJdQc_TcJc_TsKc() {
    assertEquals(
      "TsKc TcJc",
      Solver.process("texas-holdem 3h4h7cJdQc TcJc TsKc"));
  }

  @Test
  public void test_texas_holdem_9118_3d4h6cTcTd_2s8s_8c7h_4dTh_Ac5h_7cKc_2hQc() {
    assertEquals(
      "2s8s 8c7h 2hQc 7cKc Ac5h 4dTh",
      Solver.process("texas-holdem 3d4h6cTcTd 2s8s 8c7h 4dTh Ac5h 7cKc 2hQc"));
  }

  @Test
  public void test_texas_holdem_9119_7d8dJsQcTh_3h5s_Ah2c_6dAd() {
    assertEquals(
      "3h5s 6dAd=Ah2c",
      Solver.process("texas-holdem 7d8dJsQcTh 3h5s Ah2c 6dAd"));
  }

  @Test
  public void test_texas_holdem_9120_9cAsJhQdTc_4d6h_Ad2c_2dJc() {
    assertEquals(
      "4d6h 2dJc Ad2c",
      Solver.process("texas-holdem 9cAsJhQdTc 4d6h Ad2c 2dJc"));
  }

  @Test
  public void test_texas_holdem_9121_4s8c8dAcJc_2s7d_3d6d_Jh9s() {
    assertEquals(
      "3d6d 2s7d Jh9s",
      Solver.process("texas-holdem 4s8c8dAcJc 2s7d 3d6d Jh9s"));
  }

  @Test
  public void test_texas_holdem_9122_4d5d5h6sQs_3s4c_7d9c_9sQh() {
    assertEquals(
      "7d9c 3s4c 9sQh",
      Solver.process("texas-holdem 4d5d5h6sQs 3s4c 7d9c 9sQh"));
  }

  @Test
  public void test_texas_holdem_9123_2hJdJsQhTs_8c2d_KsKd_7d9h() {
    assertEquals(
      "7d9h 8c2d KsKd",
      Solver.process("texas-holdem 2hJdJsQhTs 8c2d KsKd 7d9h"));
  }

  @Test
  public void test_texas_holdem_9124_7d7h9dJcQh_2c9h_Jh3h() {
    assertEquals(
      "2c9h Jh3h",
      Solver.process("texas-holdem 7d7h9dJcQh 2c9h Jh3h"));
  }

  @Test
  public void test_texas_holdem_9125_2s3s5hJsKc_Th7h_8c5c_QdAd_7d9c() {
    assertEquals(
      "7d9c Th7h QdAd 8c5c",
      Solver.process("texas-holdem 2s3s5hJsKc Th7h 8c5c QdAd 7d9c"));
  }

  @Test
  public void test_texas_holdem_9126_6c7c9d9sAh_3h7d_3sQs_2c7h_QdAd_Kh8c() {
    assertEquals(
      "3sQs Kh8c 2c7h=3h7d QdAd",
      Solver.process("texas-holdem 6c7c9d9sAh 3h7d 3sQs 2c7h QdAd Kh8c"));
  }

  @Test
  public void test_texas_holdem_9127_6s8c9cJhTs_7cKh_5c9d_9s8d() {
    assertEquals(
      "5c9d 9s8d 7cKh",
      Solver.process("texas-holdem 6s8c9cJhTs 7cKh 5c9d 9s8d"));
  }

  @Test
  public void test_texas_holdem_9128_4s6hAcAsKs_9dTd_7c3s() {
    assertEquals(
      "7c3s 9dTd",
      Solver.process("texas-holdem 4s6hAcAsKs 9dTd 7c3s"));
  }

  @Test
  public void test_texas_holdem_9129_2d2s3s4s6h_5cQd_As8s_JsKc_7s3d_6c5s_7d9d_Qs7c_Ac2h() {
    assertEquals(
      "7d9d Qs7c JsKc 7s3d Ac2h 5cQd=6c5s As8s",
      Solver.process("texas-holdem 2d2s3s4s6h 5cQd As8s JsKc 7s3d 6c5s 7d9d Qs7c Ac2h"));
  }

  @Test
  public void test_texas_holdem_9130_5s6s9dAcQh_Ts2d_8sAs_Kh3d_9s3h_3s7c_2cKc_4hQd_5c9c_9hJs() {
    assertEquals(
      "3s7c Ts2d 2cKc=Kh3d 9s3h 9hJs 4hQd 8sAs 5c9c",
      Solver.process("texas-holdem 5s6s9dAcQh Ts2d 8sAs Kh3d 9s3h 3s7c 2cKc 4hQd 5c9c 9hJs"));
  }

  @Test
  public void test_texas_holdem_9131_4c5h7hJhTc_KhAs_2s6c_8c5d_9h5c_3h6h() {
    assertEquals(
      "2s6c KhAs 8c5d 9h5c 3h6h",
      Solver.process("texas-holdem 4c5h7hJhTc KhAs 2s6c 8c5d 9h5c 3h6h"));
  }

  @Test
  public void test_texas_holdem_9132_4c4d5d8hTd_Kd2s_5sTc_8s8d_9d2d_TsQh_3c8c_AdJc_QsJh() {
    assertEquals(
      "QsJh Kd2s AdJc 3c8c TsQh 5sTc 9d2d 8s8d",
      Solver.process("texas-holdem 4c4d5d8hTd Kd2s 5sTc 8s8d 9d2d TsQh 3c8c AdJc QsJh"));
  }

  @Test
  public void test_texas_holdem_9133_4h5d5h8c9h_5sTh_Tc6d_9cKd_AsQs() {
    assertEquals(
      "Tc6d AsQs 9cKd 5sTh",
      Solver.process("texas-holdem 4h5d5h8c9h 5sTh Tc6d 9cKd AsQs"));
  }

  @Test
  public void test_texas_holdem_9134_2h3d4d5sTc_7sTs_9c2s_Ad5d_9h6c_5c3s_3cJc_8d4c() {
    assertEquals(
      "9c2s 3cJc 8d4c 7sTs 5c3s Ad5d 9h6c",
      Solver.process("texas-holdem 2h3d4d5sTc 7sTs 9c2s Ad5d 9h6c 5c3s 3cJc 8d4c"));
  }

  @Test
  public void test_texas_holdem_9135_4d7h9sJsKc_KdQs_Ah8c_5hQh_9cTd_Qc8s() {
    assertEquals(
      "5hQh Qc8s Ah8c 9cTd KdQs",
      Solver.process("texas-holdem 4d7h9sJsKc KdQs Ah8c 5hQh 9cTd Qc8s"));
  }

  @Test
  public void test_texas_holdem_9136_3s5d5sJdJs_Qs2s_4hTh_As4c() {
    assertEquals(
      "4hTh As4c Qs2s",
      Solver.process("texas-holdem 3s5d5sJdJs Qs2s 4hTh As4c"));
  }

  @Test
  public void test_texas_holdem_9137_3s6c7hJdKc_5sAs_9d5h_Qd8d_ThTc_4s2h_7cQc_5c4h_2s4d_8h9c() {
    assertEquals(
      "2s4d=4s2h 9d5h 8h9c Qd8d 5sAs 7cQc ThTc 5c4h",
      Solver.process("texas-holdem 3s6c7hJdKc 5sAs 9d5h Qd8d ThTc 4s2h 7cQc 5c4h 2s4d 8h9c"));
  }

  @Test
  public void test_texas_holdem_9138_8c9c9hAcQd_3hJd_6d8h_7sKc() {
    assertEquals(
      "3hJd 7sKc 6d8h",
      Solver.process("texas-holdem 8c9c9hAcQd 3hJd 6d8h 7sKc"));
  }

  @Test
  public void test_texas_holdem_9139_3s4cKdQdTh_JsJc_5d2h_6d5c_3c9h_6c5h_9d2c_Qc8s_Jd8h_2dJh() {
    assertEquals(
      "5d2h 6c5h=6d5c 9d2c 2dJh Jd8h 3c9h JsJc Qc8s",
      Solver.process("texas-holdem 3s4cKdQdTh JsJc 5d2h 6d5c 3c9h 6c5h 9d2c Qc8s Jd8h 2dJh"));
  }

  @Test
  public void test_texas_holdem_9140_2h2s4d7dJs_AcTc_AsJc_Ad8c_6h9d_4sJh() {
    assertEquals(
      "6h9d Ad8c AcTc AsJc 4sJh",
      Solver.process("texas-holdem 2h2s4d7dJs AcTc AsJc Ad8c 6h9d 4sJh"));
  }

  @Test
  public void test_texas_holdem_9141_3d6h9sKhTc_2h7h_2d3h_QcAd_5cTh_6s9d_Ah4h() {
    assertEquals(
      "2h7h Ah4h QcAd 2d3h 5cTh 6s9d",
      Solver.process("texas-holdem 3d6h9sKhTc 2h7h 2d3h QcAd 5cTh 6s9d Ah4h"));
  }

  @Test
  public void test_texas_holdem_9142_5hAhJcKcTs_TdQh_Qs6d_Kd3h_8h8s_2d7c_5cTc() {
    assertEquals(
      "2d7c 8h8s Kd3h 5cTc Qs6d=TdQh",
      Solver.process("texas-holdem 5hAhJcKcTs TdQh Qs6d Kd3h 8h8s 2d7c 5cTc"));
  }

  @Test
  public void test_texas_holdem_9143_4d6sJsQhTc_KcAc_6d8s_9c3s_5sKh_ThQd_7hQs() {
    assertEquals(
      "9c3s 5sKh 6d8s 7hQs ThQd KcAc",
      Solver.process("texas-holdem 4d6sJsQhTc KcAc 6d8s 9c3s 5sKh ThQd 7hQs"));
  }

  @Test
  public void test_texas_holdem_9144_5s6cAcJcQc_Ah8h_5h6h_4sTd_8d9h() {
    assertEquals(
      "8d9h 4sTd Ah8h 5h6h",
      Solver.process("texas-holdem 5s6cAcJcQc Ah8h 5h6h 4sTd 8d9h"));
  }

  @Test
  public void test_texas_holdem_9145_2s9sKcTdTh_5hJh_Qh6h() {
    assertEquals(
      "5hJh Qh6h",
      Solver.process("texas-holdem 2s9sKcTdTh 5hJh Qh6h"));
  }

  @Test
  public void test_texas_holdem_9146_5d9cAcQdTc_QsQc_Jc2d_QhKc_8dAs_3h9d_7d5s_AdJh() {
    assertEquals(
      "Jc2d 7d5s 3h9d QhKc 8dAs AdJh QsQc",
      Solver.process("texas-holdem 5d9cAcQdTc QsQc Jc2d QhKc 8dAs 3h9d 7d5s AdJh"));
  }

  @Test
  public void test_texas_holdem_9147_2c4cAcJdJs_6s3s_5sKs_Kd7s_9h2h_4dKc() {
    assertEquals(
      "6s3s 5sKs Kd7s 9h2h 4dKc",
      Solver.process("texas-holdem 2c4cAcJdJs 6s3s 5sKs Kd7s 9h2h 4dKc"));
  }

  @Test
  public void test_texas_holdem_9148_3s7dQdTdTs_5c4s_9h2h_As4h_6c5s_2dJc_8hKs() {
    assertEquals(
      "5c4s 6c5s 9h2h 2dJc 8hKs As4h",
      Solver.process("texas-holdem 3s7dQdTdTs 5c4s 9h2h As4h 6c5s 2dJc 8hKs"));
  }

  @Test
  public void test_texas_holdem_9149_2c6d7s9sAh_Kd9c_Qc8s_Ts3s_3dJh_2dAd() {
    assertEquals(
      "Ts3s 3dJh Qc8s Kd9c 2dAd",
      Solver.process("texas-holdem 2c6d7s9sAh Kd9c Qc8s Ts3s 3dJh 2dAd"));
  }

  @Test
  public void test_texas_holdem_9150_9hAdJcJsKc_8c7h_9dAc_Ah8h_4h6s_TsTh_Kd7c() {
    assertEquals(
      "4h6s=8c7h TsTh Kd7c 9dAc=Ah8h",
      Solver.process("texas-holdem 9hAdJcJsKc 8c7h 9dAc Ah8h 4h6s TsTh Kd7c"));
  }

  @Test
  public void test_texas_holdem_9151_4h7c8d9cQc_JcKd_Ts6s_5c5h_AdJd_3s6c() {
    assertEquals(
      "3s6c JcKd AdJd 5c5h Ts6s",
      Solver.process("texas-holdem 4h7c8d9cQc JcKd Ts6s 5c5h AdJd 3s6c"));
  }

  @Test
  public void test_texas_holdem_9152_4h6hAdJdJh_KhKs_Qc7s_9h7c() {
    assertEquals(
      "9h7c Qc7s KhKs",
      Solver.process("texas-holdem 4h6hAdJdJh KhKs Qc7s 9h7c"));
  }

  @Test
  public void test_texas_holdem_9153_2c2h6c9dQc_Kc2d_6s2s_6h8h_Tc3d_8d7d_8cKd() {
    assertEquals(
      "8d7d Tc3d 8cKd 6h8h Kc2d 6s2s",
      Solver.process("texas-holdem 2c2h6c9dQc Kc2d 6s2s 6h8h Tc3d 8d7d 8cKd"));
  }

  @Test
  public void test_texas_holdem_9154_6d6s7c9hTc_5sTd_Ah9s() {
    assertEquals(
      "Ah9s 5sTd",
      Solver.process("texas-holdem 6d6s7c9hTc 5sTd Ah9s"));
  }

  @Test
  public void test_texas_holdem_9155_2c3h9cKdTc_Th3c_6h8d_8sKh_4hJd_Ac5c_3d4d_4s5d_7hQh_6d2h() {
    assertEquals(
      "4s5d 6h8d 4hJd 7hQh 6d2h 3d4d 8sKh Th3c Ac5c",
      Solver.process("texas-holdem 2c3h9cKdTc Th3c 6h8d 8sKh 4hJd Ac5c 3d4d 4s5d 7hQh 6d2h"));
  }

  @Test
  public void test_texas_holdem_9156_2d2h3hKhTs_KsQd_Tc5c_Qc4h_6dJs_3cTh_6h4c() {
    assertEquals(
      "6h4c 6dJs Qc4h Tc5c 3cTh KsQd",
      Solver.process("texas-holdem 2d2h3hKhTs KsQd Tc5c Qc4h 6dJs 3cTh 6h4c"));
  }

  @Test
  public void test_texas_holdem_9157_7c7h9d9sQc_2cAh_Qh8d_6dTd_TcQs_5c5s_9h5h_9cTs_KsJd_KdTh() {
    assertEquals(
      "5c5s=6dTd KdTh=KsJd 2cAh Qh8d TcQs 9cTs=9h5h",
      Solver.process("texas-holdem 7c7h9d9sQc 2cAh Qh8d 6dTd TcQs 5c5s 9h5h 9cTs KsJd KdTh"));
  }

  @Test
  public void test_texas_holdem_9158_7c8hAcAhJh_7s3d_2sKd_5c4d_6cTs_2d8c() {
    assertEquals(
      "5c4d 6cTs 2sKd 7s3d 2d8c",
      Solver.process("texas-holdem 7c8hAcAhJh 7s3d 2sKd 5c4d 6cTs 2d8c"));
  }

  @Test
  public void test_texas_holdem_9159_2h4c4s7dKs_Th3d_2cJh_Kh3h_KdTc() {
    assertEquals(
      "Th3d 2cJh Kh3h KdTc",
      Solver.process("texas-holdem 2h4c4s7dKs Th3d 2cJh Kh3h KdTc"));
  }

  @Test
  public void test_texas_holdem_9160_7c9cJsQdTh_9h3s_5sKs_2dTs() {
    assertEquals(
      "9h3s 2dTs 5sKs",
      Solver.process("texas-holdem 7c9cJsQdTh 9h3s 5sKs 2dTs"));
  }

  @Test
  public void test_texas_holdem_9161_2h7s9hAcJh_2c9d_8cTh_3cTd_KsKd_8h4s_5s6c_7dJc() {
    assertEquals(
      "5s6c 8h4s 3cTd KsKd 2c9d 7dJc 8cTh",
      Solver.process("texas-holdem 2h7s9hAcJh 2c9d 8cTh 3cTd KsKd 8h4s 5s6c 7dJc"));
  }

  @Test
  public void test_texas_holdem_9162_2d3h5hQcQh_3cAh_QdJs_Td4h_4sJd_7sAd_6h2s_4c3d_3s5d() {
    assertEquals(
      "Td4h 4sJd 7sAd 6h2s 4c3d 3cAh 3s5d QdJs",
      Solver.process("texas-holdem 2d3h5hQcQh 3cAh QdJs Td4h 4sJd 7sAd 6h2s 4c3d 3s5d"));
  }

  @Test
  public void test_texas_holdem_9163_2d8sJdKdQc_Td5s_Qd3s_9s4h_8hKh() {
    assertEquals(
      "9s4h Td5s Qd3s 8hKh",
      Solver.process("texas-holdem 2d8sJdKdQc Td5s Qd3s 9s4h 8hKh"));
  }

  @Test
  public void test_texas_holdem_9164_AdAsJsThTs_KhQc_5s9d_2c5h_Ah4h_3sJh_7h6h_2h9s_5c4s() {
    assertEquals(
      "2c5h=2h9s=5c4s=5s9d=7h6h 3sJh KhQc Ah4h",
      Solver.process("texas-holdem AdAsJsThTs KhQc 5s9d 2c5h Ah4h 3sJh 7h6h 2h9s 5c4s"));
  }

  @Test
  public void test_texas_holdem_9165_6s7c9d9hTs_7h5h_AcKd_QdKh_Ad6d_8c4s_4c3c_5dTh() {
    assertEquals(
      "4c3c QdKh AcKd Ad6d 7h5h 5dTh 8c4s",
      Solver.process("texas-holdem 6s7c9d9hTs 7h5h AcKd QdKh Ad6d 8c4s 4c3c 5dTh"));
  }

  @Test
  public void test_texas_holdem_9166_4s6d9cAhQd_8cJc_4d3h_2sKc_9s2c_Td5d() {
    assertEquals(
      "Td5d 8cJc 2sKc 4d3h 9s2c",
      Solver.process("texas-holdem 4s6d9cAhQd 8cJc 4d3h 2sKc 9s2c Td5d"));
  }

  @Test
  public void test_texas_holdem_9167_2s4h7h8s9c_8hAd_AsTc_7sJh() {
    assertEquals(
      "AsTc 7sJh 8hAd",
      Solver.process("texas-holdem 2s4h7h8s9c 8hAd AsTc 7sJh"));
  }

  @Test
  public void test_texas_holdem_9168_6h9dJcKcTh_QdAd_Tc3d() {
    assertEquals(
      "Tc3d QdAd",
      Solver.process("texas-holdem 6h9dJcKcTh QdAd Tc3d"));
  }

  @Test
  public void test_texas_holdem_9169_4d5s8c8dTh_Qd2c_3d8h_Qs5c_6dJd() {
    assertEquals(
      "6dJd Qd2c Qs5c 3d8h",
      Solver.process("texas-holdem 4d5s8c8dTh Qd2c 3d8h Qs5c 6dJd"));
  }

  @Test
  public void test_texas_holdem_9170_2d4s8hKhQc_9s4d_AhAs_6sTd_9h7s_5sAd_3d4c_7d2h_5h7h_JcKd() {
    assertEquals(
      "5h7h 9h7s 6sTd 5sAd 7d2h 3d4c 9s4d JcKd AhAs",
      Solver.process("texas-holdem 2d4s8hKhQc 9s4d AhAs 6sTd 9h7s 5sAd 3d4c 7d2h 5h7h JcKd"));
  }

  @Test
  public void test_texas_holdem_9171_3d5h6d8cTc_5c3s_9cQs_3c7s_JsQc_6c4h() {
    assertEquals(
      "9cQs JsQc 3c7s 6c4h 5c3s",
      Solver.process("texas-holdem 3d5h6d8cTc 5c3s 9cQs 3c7s JsQc 6c4h"));
  }

  @Test
  public void test_texas_holdem_9172_8c8s9cKdQh_4h3c_5h7c_Jd2c() {
    assertEquals(
      "4h3c=5h7c Jd2c",
      Solver.process("texas-holdem 8c8s9cKdQh 4h3c 5h7c Jd2c"));
  }

  @Test
  public void test_texas_holdem_9173_4c6s9dAcTc_5dKh_JcTh_9cAs_Qc8c_6d3d_2d7h_4sJd() {
    assertEquals(
      "2d7h 5dKh 4sJd 6d3d JcTh 9cAs Qc8c",
      Solver.process("texas-holdem 4c6s9dAcTc 5dKh JcTh 9cAs Qc8c 6d3d 2d7h 4sJd"));
  }

  @Test
  public void test_texas_holdem_9174_5c5s6s7cAh_7d6c_5dJh() {
    assertEquals(
      "7d6c 5dJh",
      Solver.process("texas-holdem 5c5s6s7cAh 7d6c 5dJh"));
  }

  @Test
  public void test_texas_holdem_9175_4h8h8sAdJs_6cKh_6dKd_Jd5s_Qd7d_QsAh_ThTs_9d2d_4s2h_JcTc() {
    assertEquals(
      "9d2d Qd7d 6cKh=6dKd 4s2h ThTs JcTc=Jd5s QsAh",
      Solver.process("texas-holdem 4h8h8sAdJs 6cKh 6dKd Jd5s Qd7d QsAh ThTs 9d2d 4s2h JcTc"));
  }

  @Test
  public void test_texas_holdem_9176_5h8sJcQhQs_Td3s_9hAh_8d6h_Th3d_As5c_4c2s() {
    assertEquals(
      "4c2s Td3s=Th3d 9hAh As5c 8d6h",
      Solver.process("texas-holdem 5h8sJcQhQs Td3s 9hAh 8d6h Th3d As5c 4c2s"));
  }

  @Test
  public void test_texas_holdem_9177_5c6c6d7sTd_2sAh_8h3s_Jd9s_7dKh_6sAc_3h4h_3dKc() {
    assertEquals(
      "8h3s Jd9s 3dKc 2sAh 7dKh 6sAc 3h4h",
      Solver.process("texas-holdem 5c6c6d7sTd 2sAh 8h3s Jd9s 7dKh 6sAc 3h4h 3dKc"));
  }

  @Test
  public void test_texas_holdem_9178_AcAdJdKcQd_Ah8c_2s2d_8sQh_8h5s() {
    assertEquals(
      "8h5s 2s2d 8sQh Ah8c",
      Solver.process("texas-holdem AcAdJdKcQd Ah8c 2s2d 8sQh 8h5s"));
  }

  @Test
  public void test_texas_holdem_9179_3s4d5d5s9h_Td6h_5h8s_Jd5c_Kh9d_9c6c_Jh7d_8hAh() {
    assertEquals(
      "Td6h Jh7d 8hAh 9c6c Kh9d 5h8s Jd5c",
      Solver.process("texas-holdem 3s4d5d5s9h Td6h 5h8s Jd5c Kh9d 9c6c Jh7d 8hAh"));
  }

  @Test
  public void test_texas_holdem_9180_2c3c6c8c8s_Jh4d_AcQs_4s7d() {
    assertEquals(
      "4s7d Jh4d AcQs",
      Solver.process("texas-holdem 2c3c6c8c8s Jh4d AcQs 4s7d"));
  }

  @Test
  public void test_texas_holdem_9181_3s6c6s9c9h_Qh7h_4c7d_6hAh_Qc2h_8hAc() {
    assertEquals(
      "4c7d Qc2h=Qh7h 8hAc 6hAh",
      Solver.process("texas-holdem 3s6c6s9c9h Qh7h 4c7d 6hAh Qc2h 8hAc"));
  }

  @Test
  public void test_texas_holdem_9182_2c3d5c8dJh_QsKs_3c5h_6c6h_QcQd() {
    assertEquals(
      "QsKs 6c6h QcQd 3c5h",
      Solver.process("texas-holdem 2c3d5c8dJh QsKs 3c5h 6c6h QcQd"));
  }

  @Test
  public void test_texas_holdem_9183_8c8dAdQcTs_3sTd_ThJc_Jh7h_4c4h() {
    assertEquals(
      "Jh7h 4c4h 3sTd=ThJc",
      Solver.process("texas-holdem 8c8dAdQcTs 3sTd ThJc Jh7h 4c4h"));
  }

  @Test
  public void test_texas_holdem_9184_5d6d9sAdAh_8d2h_Ks2d_4dKh_JsTs_6s7d_5sQh_7h3s_QcTc() {
    assertEquals(
      "7h3s 8d2h JsTs QcTc 4dKh=Ks2d 5sQh 6s7d",
      Solver.process("texas-holdem 5d6d9sAdAh 8d2h Ks2d 4dKh JsTs 6s7d 5sQh 7h3s QcTc"));
  }

  @Test
  public void test_texas_holdem_9185_6c7sKcKdTs_4dQs_Td4s_6h5h_4c2c_Ac3c_Qh7h_Ad9c_JsAs_Kh5d() {
    assertEquals(
      "4c2c 4dQs Ac3c Ad9c JsAs 6h5h Qh7h Td4s Kh5d",
      Solver.process("texas-holdem 6c7sKcKdTs 4dQs Td4s 6h5h 4c2c Ac3c Qh7h Ad9c JsAs Kh5d"));
  }

  @Test
  public void test_texas_holdem_9186_3c4d4h6sQs_8hJs_3s4s_5h9d() {
    assertEquals(
      "5h9d 8hJs 3s4s",
      Solver.process("texas-holdem 3c4d4h6sQs 8hJs 3s4s 5h9d"));
  }

  @Test
  public void test_texas_holdem_9187_8dAhJdJhKs_3dJc_2c5h_Ac4s_Kd9h_6sJs_8sAd() {
    assertEquals(
      "2c5h Kd9h 8sAd=Ac4s 3dJc=6sJs",
      Solver.process("texas-holdem 8dAhJdJhKs 3dJc 2c5h Ac4s Kd9h 6sJs 8sAd"));
  }

  @Test
  public void test_texas_holdem_9188_3s9cJcJdQc_As5d_8sKc_TdKh_4c4s_6h7c_9h7h() {
    assertEquals(
      "6h7c 8sKc As5d 4c4s 9h7h TdKh",
      Solver.process("texas-holdem 3s9cJcJdQc As5d 8sKc TdKh 4c4s 6h7c 9h7h"));
  }

  @Test
  public void test_texas_holdem_9189_2h6c6dAcJc_KhJh_7hTc_8h8s_4dKs_Kc9c_7c8d() {
    assertEquals(
      "7c8d 7hTc 4dKs 8h8s KhJh Kc9c",
      Solver.process("texas-holdem 2h6c6dAcJc KhJh 7hTc 8h8s 4dKs Kc9c 7c8d"));
  }

  @Test
  public void test_texas_holdem_9190_2c4h6dQhTd_Tc8d_Kh7s_7cKd_Ts5d() {
    assertEquals(
      "7cKd=Kh7s Ts5d Tc8d",
      Solver.process("texas-holdem 2c4h6dQhTd Tc8d Kh7s 7cKd Ts5d"));
  }

  @Test
  public void test_texas_holdem_9191_6d9d9sJcQd_Qh3d_Ac4c_JdQs_Js7s() {
    assertEquals(
      "Ac4c Js7s Qh3d JdQs",
      Solver.process("texas-holdem 6d9d9sJcQd Qh3d Ac4c JdQs Js7s"));
  }

  @Test
  public void test_texas_holdem_9192_2s8dAhJcKs_KdJh_7s4c_5dAs_2d2c_Ts7h_6dKc_4sTd_5s9c_4h9s() {
    assertEquals(
      "7s4c 4h9s=5s9c 4sTd=Ts7h 6dKc 5dAs KdJh 2d2c",
      Solver.process("texas-holdem 2s8dAhJcKs KdJh 7s4c 5dAs 2d2c Ts7h 6dKc 4sTd 5s9c 4h9s"));
  }

  @Test
  public void test_texas_holdem_9193_3s5c7d9dAh_KdKh_4cQd_Ts2d_2cJc_6c5s_9cQc_3hKs_6h6d_Tc8s() {
    assertEquals(
      "Ts2d Tc8s 2cJc 4cQd 3hKs 6c5s 6h6d 9cQc KdKh",
      Solver.process("texas-holdem 3s5c7d9dAh KdKh 4cQd Ts2d 2cJc 6c5s 9cQc 3hKs 6h6d Tc8s"));
  }

  @Test
  public void test_texas_holdem_9194_5hAhQdQsTd_4d6c_8d3h_AcJh_9c8h_3s5d_6h6d_4cTs_9sKc_Ad6s() {
    assertEquals(
      "4d6c 8d3h 9c8h 9sKc 3s5d 6h6d 4cTs Ad6s AcJh",
      Solver.process("texas-holdem 5hAhQdQsTd 4d6c 8d3h AcJh 9c8h 3s5d 6h6d 4cTs 9sKc Ad6s"));
  }

  @Test
  public void test_texas_holdem_9195_6d7hJcJdQc_2sAs_8hJh_Ts7s_Qs6s_3sTh_Ad6c_9sKd() {
    assertEquals(
      "3sTh 9sKd 2sAs Ad6c Ts7s Qs6s 8hJh",
      Solver.process("texas-holdem 6d7hJcJdQc 2sAs 8hJh Ts7s Qs6s 3sTh Ad6c 9sKd"));
  }

  @Test
  public void test_texas_holdem_9196_2c2d4dKdQc_5sKh_2hTs_3s7d_AsJd_4s6c_3dKs() {
    assertEquals(
      "3s7d AsJd 4s6c 3dKs=5sKh 2hTs",
      Solver.process("texas-holdem 2c2d4dKdQc 5sKh 2hTs 3s7d AsJd 4s6c 3dKs"));
  }

  @Test
  public void test_texas_holdem_9197_AdJsKcQdTs_2c6c_9c8h_7c7s_9h9s_6h2s_Qc8s_Td5s() {
    assertEquals(
      "2c6c=6h2s=7c7s=9c8h=9h9s=Qc8s=Td5s",
      Solver.process("texas-holdem AdJsKcQdTs 2c6c 9c8h 7c7s 9h9s 6h2s Qc8s Td5s"));
  }

  @Test
  public void test_texas_holdem_9198_8sJdJhKdQd_7d6s_2dAh_2sQs_6c7c_As8d_7s4h_2c3d_8cKc_2hTd() {
    assertEquals(
      "2c3d=6c7c=7d6s=7s4h 2hTd 2dAh As8d 2sQs 8cKc",
      Solver.process("texas-holdem 8sJdJhKdQd 7d6s 2dAh 2sQs 6c7c As8d 7s4h 2c3d 8cKc 2hTd"));
  }

  @Test
  public void test_texas_holdem_9199_5h6dJdTcTd_Jc4c_2sTh() {
    assertEquals(
      "Jc4c 2sTh",
      Solver.process("texas-holdem 5h6dJdTcTd Jc4c 2sTh"));
  }

  @Test
  public void test_texas_holdem_9200_2c9dAdQhTc_5d3d_3sTd_3c6s_6c9s_3h8s_7dQd_Kd2h() {
    assertEquals(
      "5d3d 3c6s 3h8s Kd2h 6c9s 3sTd 7dQd",
      Solver.process("texas-holdem 2c9dAdQhTc 5d3d 3sTd 3c6s 6c9s 3h8s 7dQd Kd2h"));
  }

  @Test
  public void test_texas_holdem_9201_3d5c7s9sAd_5h8s_Th8d_Kh8c_3h2s_4d2d_9hJs() {
    assertEquals(
      "Th8d Kh8c 3h2s 5h8s 9hJs 4d2d",
      Solver.process("texas-holdem 3d5c7s9sAd 5h8s Th8d Kh8c 3h2s 4d2d 9hJs"));
  }

  @Test
  public void test_texas_holdem_9202_6c7dJhJsTc_9c6d_8cTh_6h9h() {
    assertEquals(
      "6h9h=9c6d 8cTh",
      Solver.process("texas-holdem 6c7dJhJsTc 9c6d 8cTh 6h9h"));
  }

  @Test
  public void test_texas_holdem_9203_4s6h7hAhKs_Jh5s_3s4c_JsTc() {
    assertEquals(
      "Jh5s JsTc 3s4c",
      Solver.process("texas-holdem 4s6h7hAhKs Jh5s 3s4c JsTc"));
  }

  @Test
  public void test_texas_holdem_9204_5d6d7cJsKh_AdJh_5sQc_8d7s_3c4c_7hJd_TcKc_3s2s_3h8c() {
    assertEquals(
      "3s2s 3h8c 5sQc 8d7s AdJh TcKc 7hJd 3c4c",
      Solver.process("texas-holdem 5d6d7cJsKh AdJh 5sQc 8d7s 3c4c 7hJd TcKc 3s2s 3h8c"));
  }

  @Test
  public void test_texas_holdem_9205_5s8h9cAcQd_6cTh_Ks3d_Kd2d_6d4d() {
    assertEquals(
      "6d4d 6cTh Kd2d=Ks3d",
      Solver.process("texas-holdem 5s8h9cAcQd 6cTh Ks3d Kd2d 6d4d"));
  }

  @Test
  public void test_texas_holdem_9206_6d9cKcKhTs_5sJh_9d5d_Kd3h_8dAc_4c4d() {
    assertEquals(
      "5sJh 8dAc 4c4d 9d5d Kd3h",
      Solver.process("texas-holdem 6d9cKcKhTs 5sJh 9d5d Kd3h 8dAc 4c4d"));
  }

  @Test
  public void test_texas_holdem_9207_6h7hAsQdQs_9c4h_3hTs_Jh5d_2c6s_3dKh_6c9s_Jd7d_2hAd() {
    assertEquals(
      "9c4h 3hTs Jh5d 3dKh 2c6s=6c9s Jd7d 2hAd",
      Solver.process("texas-holdem 6h7hAsQdQs 9c4h 3hTs Jh5d 2c6s 3dKh 6c9s Jd7d 2hAd"));
  }

  @Test
  public void test_texas_holdem_9208_2h3hAdJhTh_Jc5c_9s5h_Qh9d_Kh4d() {
    assertEquals(
      "Jc5c 9s5h Qh9d Kh4d",
      Solver.process("texas-holdem 2h3hAdJhTh Jc5c 9s5h Qh9d Kh4d"));
  }

  @Test
  public void test_texas_holdem_9209_AdJhKcQsTc_2h3h_4cTd_9cAc_Ts3d_5sJd_2sAs_7cKh_QcKs_8c4h() {
    assertEquals(
      "2h3h=2sAs=4cTd=5sJd=7cKh=8c4h=9cAc=QcKs=Ts3d",
      Solver.process("texas-holdem AdJhKcQsTc 2h3h 4cTd 9cAc Ts3d 5sJd 2sAs 7cKh QcKs 8c4h"));
  }

  @Test
  public void test_texas_holdem_9210_7h9c9sAdAs_4d7d_5dKh_4hAh_3d6s_8h3h_2c2d_6cJh() {
    assertEquals(
      "2c2d=3d6s=4d7d 8h3h 6cJh 5dKh 4hAh",
      Solver.process("texas-holdem 7h9c9sAdAs 4d7d 5dKh 4hAh 3d6s 8h3h 2c2d 6cJh"));
  }

  @Test
  public void test_texas_holdem_9211_2d2s8dTcTh_JhKc_2hKd_Qd3s_6c7c_3d9h_Ac5h() {
    assertEquals(
      "6c7c 3d9h Qd3s JhKc Ac5h 2hKd",
      Solver.process("texas-holdem 2d2s8dTcTh JhKc 2hKd Qd3s 6c7c 3d9h Ac5h"));
  }

  @Test
  public void test_texas_holdem_9212_2c4h6dAhQc_TsTd_5dKc_Ac4d_JhJs_2h7s_9h3h_5s3c() {
    assertEquals(
      "9h3h 5dKc 2h7s TsTd JhJs Ac4d 5s3c",
      Solver.process("texas-holdem 2c4h6dAhQc TsTd 5dKc Ac4d JhJs 2h7s 9h3h 5s3c"));
  }

  @Test
  public void test_texas_holdem_9213_2c4s5h9hKc_9sAh_JcKd_Ks7d_2s2d_8d6d_6s3h() {
    assertEquals(
      "8d6d 9sAh Ks7d JcKd 2s2d 6s3h",
      Solver.process("texas-holdem 2c4s5h9hKc 9sAh JcKd Ks7d 2s2d 8d6d 6s3h"));
  }

  @Test
  public void test_texas_holdem_9214_2h5s7c9hJs_KcJd_3d2s_6h4c_Ts7h_4hQd_6sAd() {
    assertEquals(
      "6h4c 4hQd 6sAd 3d2s Ts7h KcJd",
      Solver.process("texas-holdem 2h5s7c9hJs KcJd 3d2s 6h4c Ts7h 4hQd 6sAd"));
  }

  @Test
  public void test_texas_holdem_9215_2d4sJcJdJs_Kc3d_5s8h_4cJh_AdAc_6dAs_9s8s() {
    assertEquals(
      "5s8h 9s8s Kc3d 6dAs AdAc 4cJh",
      Solver.process("texas-holdem 2d4sJcJdJs Kc3d 5s8h 4cJh AdAc 6dAs 9s8s"));
  }

  @Test
  public void test_texas_holdem_9216_2h8dKcKhQh_Ts5s_Kd3d_3sAh_6hAd_3c8c_Td6c_4h7s_2s8h_Ac2c() {
    assertEquals(
      "4h7s Td6c=Ts5s 3sAh=6hAd Ac2c 2s8h=3c8c Kd3d",
      Solver.process("texas-holdem 2h8dKcKhQh Ts5s Kd3d 3sAh 6hAd 3c8c Td6c 4h7s 2s8h Ac2c"));
  }

  @Test
  public void test_texas_holdem_9217_4s5d8c8s9h_2hKc_5sQd_3dTc_7d6s_4h7c_Qc6c_2d2s_6h2c() {
    assertEquals(
      "6h2c 3dTc Qc6c 2hKc 2d2s 4h7c 5sQd 7d6s",
      Solver.process("texas-holdem 4s5d8c8s9h 2hKc 5sQd 3dTc 7d6s 4h7c Qc6c 2d2s 6h2c"));
  }

  @Test
  public void test_texas_holdem_9218_2d3d7cQhTd_Ad4d_5cAs_3s2h_6c9d_5d7h_6hTs() {
    assertEquals(
      "6c9d 5cAs 5d7h 6hTs 3s2h Ad4d",
      Solver.process("texas-holdem 2d3d7cQhTd Ad4d 5cAs 3s2h 6c9d 5d7h 6hTs"));
  }

  @Test
  public void test_texas_holdem_9219_5h7h9cJdTd_5c6s_8c6c() {
    assertEquals(
      "5c6s 8c6c",
      Solver.process("texas-holdem 5h7h9cJdTd 5c6s 8c6c"));
  }

  @Test
  public void test_texas_holdem_9220_2s6c7cJdTh_2c7d_Ac6h_Kh9c_8d5d_8hKs_6sJc_5s3c() {
    assertEquals(
      "5s3c 8d5d 8hKs Kh9c Ac6h 2c7d 6sJc",
      Solver.process("texas-holdem 2s6c7cJdTh 2c7d Ac6h Kh9c 8d5d 8hKs 6sJc 5s3c"));
  }

  @Test
  public void test_texas_holdem_9221_3c5s8d8hAh_7sKd_AcJc_6c2d_Tc9c_Ts6d_ThAd() {
    assertEquals(
      "6c2d Ts6d Tc9c 7sKd ThAd AcJc",
      Solver.process("texas-holdem 3c5s8d8hAh 7sKd AcJc 6c2d Tc9c Ts6d ThAd"));
  }

  @Test
  public void test_texas_holdem_9222_2h4c7sKdTd_9d4h_9cQc_6hAh_7hJs_7cKc_9h5s_6d3d_QsJd() {
    assertEquals(
      "6d3d 9h5s 9cQc QsJd 6hAh 9d4h 7hJs 7cKc",
      Solver.process("texas-holdem 2h4c7sKdTd 9d4h 9cQc 6hAh 7hJs 7cKc 9h5s 6d3d QsJd"));
  }

  @Test
  public void test_texas_holdem_9223_4c7c8sJhJs_As9d_6s9h_Ks2s_Qc3c_AcTc_5d6h() {
    assertEquals(
      "6s9h Qc3c Ks2s As9d AcTc 5d6h",
      Solver.process("texas-holdem 4c7c8sJhJs As9d 6s9h Ks2s Qc3c AcTc 5d6h"));
  }

  @Test
  public void test_texas_holdem_9224_2hAcJsQhTc_4s6s_8c6d() {
    assertEquals(
      "4s6s 8c6d",
      Solver.process("texas-holdem 2hAcJsQhTc 4s6s 8c6d"));
  }

  @Test
  public void test_texas_holdem_9225_5c6h6s8sTc_7dKs_Qc9s_6dQd_8dKc_7h3h_8c3s_QsQh_Js2s_KdAd() {
    assertEquals(
      "7h3h Js2s Qc9s 7dKs KdAd 8c3s 8dKc QsQh 6dQd",
      Solver.process("texas-holdem 5c6h6s8sTc 7dKs Qc9s 6dQd 8dKc 7h3h 8c3s QsQh Js2s KdAd"));
  }

  @Test
  public void test_texas_holdem_9226_7d8c8dKsQs_Ac2d_JcAd_9c3c_KdJs_6h4s_7h6d_KcTh_Ts5h() {
    assertEquals(
      "6h4s 9c3c Ts5h Ac2d=JcAd 7h6d KcTh=KdJs",
      Solver.process("texas-holdem 7d8c8dKsQs Ac2d JcAd 9c3c KdJs 6h4s 7h6d KcTh Ts5h"));
  }

  @Test
  public void test_texas_holdem_9227_3c4d5sAsKd_4s5c_JhTh_Ac9d_Qs9h_Qh3d_Ad4h_8cKs_3s7h() {
    assertEquals(
      "JhTh Qs9h 3s7h Qh3d 8cKs Ac9d 4s5c Ad4h",
      Solver.process("texas-holdem 3c4d5sAsKd 4s5c JhTh Ac9d Qs9h Qh3d Ad4h 8cKs 3s7h"));
  }

  @Test
  public void test_texas_holdem_9228_6s8c9sQdQs_Ah3c_KcAd_6hTs_Qc4h_4s2d_8sAs_4dJd_Tc5h() {
    assertEquals(
      "4s2d Tc5h 4dJd Ah3c KcAd 6hTs Qc4h 8sAs",
      Solver.process("texas-holdem 6s8c9sQdQs Ah3c KcAd 6hTs Qc4h 4s2d 8sAs 4dJd Tc5h"));
  }

  @Test
  public void test_texas_holdem_9229_6d6s7h8cJs_ThJc_7c2c_9h2d_AcAs_5c5h_2sKh_Ad3s_Ks8h() {
    assertEquals(
      "9h2d 2sKh Ad3s 5c5h 7c2c Ks8h ThJc AcAs",
      Solver.process("texas-holdem 6d6s7h8cJs ThJc 7c2c 9h2d AcAs 5c5h 2sKh Ad3s Ks8h"));
  }

  @Test
  public void test_texas_holdem_9230_5c5sAhAsTc_KhQs_QcQh() {
    assertEquals(
      "KhQs QcQh",
      Solver.process("texas-holdem 5c5sAhAsTc KhQs QcQh"));
  }

  @Test
  public void test_texas_holdem_9231_2c7hAcJcTs_7c9d_3c6s_4dJh_3dAd_3hKs_8cTd_6h5s_6c2d_4s5d() {
    assertEquals(
      "4s5d 3c6s=6h5s 3hKs 6c2d 7c9d 8cTd 4dJh 3dAd",
      Solver.process("texas-holdem 2c7hAcJcTs 7c9d 3c6s 4dJh 3dAd 3hKs 8cTd 6h5s 6c2d 4s5d"));
  }

  @Test
  public void test_texas_holdem_9232_3h5h5s6h8d_9hAd_2c9d_Js6d_3sQh_JdTc_Kh2d_6cAh() {
    assertEquals(
      "2c9d JdTc Kh2d 9hAd 3sQh Js6d 6cAh",
      Solver.process("texas-holdem 3h5h5s6h8d 9hAd 2c9d Js6d 3sQh JdTc Kh2d 6cAh"));
  }

  @Test
  public void test_texas_holdem_9233_4h5d7c8cQh_9dAd_Qd8s_Kc5s_3c3h_6d6c() {
    assertEquals(
      "9dAd 3c3h Kc5s Qd8s 6d6c",
      Solver.process("texas-holdem 4h5d7c8cQh 9dAd Qd8s Kc5s 3c3h 6d6c"));
  }

  @Test
  public void test_texas_holdem_9234_6h8d9c9sKc_5dJs_3cTc_8s2s_2d7s_6c3s() {
    assertEquals(
      "2d7s 3cTc 5dJs 6c3s 8s2s",
      Solver.process("texas-holdem 6h8d9c9sKc 5dJs 3cTc 8s2s 2d7s 6c3s"));
  }

  @Test
  public void test_texas_holdem_9235_4c5s9sJhQd_7c5c_6s6d_3sTh_9d5d_7sJd_As4h_2dJs_Ks9h_QhAd() {
    assertEquals(
      "3sTh As4h 7c5c 6s6d Ks9h 2dJs 7sJd QhAd 9d5d",
      Solver.process("texas-holdem 4c5s9sJhQd 7c5c 6s6d 3sTh 9d5d 7sJd As4h 2dJs Ks9h QhAd"));
  }

  @Test
  public void test_texas_holdem_9236_4h6c7s9hJs_2cTh_3s8h_4s9s_5h5s_8s6s() {
    assertEquals(
      "3s8h 2cTh 5h5s 8s6s 4s9s",
      Solver.process("texas-holdem 4h6c7s9hJs 2cTh 3s8h 4s9s 5h5s 8s6s"));
  }

  @Test
  public void test_texas_holdem_9237_2d3d9sAsKd_8hJd_7d4h_4d7h_7sAd_5cTc_5h9h_7cQs() {
    assertEquals(
      "4d7h=7d4h 5cTc 8hJd 7cQs 5h9h 7sAd",
      Solver.process("texas-holdem 2d3d9sAsKd 8hJd 7d4h 4d7h 7sAd 5cTc 5h9h 7cQs"));
  }

  @Test
  public void test_texas_holdem_9238_3c5c7d8dQc_Ts8h_Jc8s_8cAc_Ah4c_Kh4h_7c4s_3d9h_KcTh_7h5h() {
    assertEquals(
      "Kh4h KcTh Ah4c 3d9h 7c4s Ts8h Jc8s 7h5h 8cAc",
      Solver.process("texas-holdem 3c5c7d8dQc Ts8h Jc8s 8cAc Ah4c Kh4h 7c4s 3d9h KcTh 7h5h"));
  }

  @Test
  public void test_texas_holdem_9239_3c6c7c9dTh_Kc5d_Tc6s_2cQc_KdAs_3sJc_4h9h_Ts4d() {
    assertEquals(
      "Kc5d KdAs 3sJc 4h9h Ts4d Tc6s 2cQc",
      Solver.process("texas-holdem 3c6c7c9dTh Kc5d Tc6s 2cQc KdAs 3sJc 4h9h Ts4d"));
  }

  @Test
  public void test_texas_holdem_9240_4d6s7d8d9c_3d6h_2sJs_9hAd_2c5h_QdKc_3c7h_3hKh_5c5s_9dTc() {
    assertEquals(
      "2sJs 3hKh QdKc 3d6h 3c7h 9hAd 2c5h=5c5s 9dTc",
      Solver.process("texas-holdem 4d6s7d8d9c 3d6h 2sJs 9hAd 2c5h QdKc 3c7h 3hKh 5c5s 9dTc"));
  }

  @Test
  public void test_texas_holdem_9241_6s8cKsQcTh_Ts6d_7d9c_4cKc_TcAh() {
    assertEquals(
      "TcAh 4cKc Ts6d 7d9c",
      Solver.process("texas-holdem 6s8cKsQcTh Ts6d 7d9c 4cKc TcAh"));
  }

  @Test
  public void test_texas_holdem_9242_3c6dKhKsTh_6c7s_JhJs_3s6s_7d8c_2cJd_5sAh_As8h_Qc2d() {
    assertEquals(
      "7d8c 2cJd Qc2d 5sAh As8h 3s6s=6c7s JhJs",
      Solver.process("texas-holdem 3c6dKhKsTh 6c7s JhJs 3s6s 7d8c 2cJd 5sAh As8h Qc2d"));
  }

  @Test
  public void test_texas_holdem_9243_2s5c8d9cAd_9h6h_Qs3c_Jh9d_Jd4h() {
    assertEquals(
      "Jd4h Qs3c 9h6h Jh9d",
      Solver.process("texas-holdem 2s5c8d9cAd 9h6h Qs3c Jh9d Jd4h"));
  }

  @Test
  public void test_texas_holdem_9244_5d9c9dAsQh_Js3h_5sKd_9sJh() {
    assertEquals(
      "Js3h 5sKd 9sJh",
      Solver.process("texas-holdem 5d9c9dAsQh Js3h 5sKd 9sJh"));
  }

  @Test
  public void test_texas_holdem_9245_3h5h8h9cQc_3d4c_6sTd_Ah8c_9s6h_Ks7h() {
    assertEquals(
      "6sTd Ks7h 3d4c Ah8c 9s6h",
      Solver.process("texas-holdem 3h5h8h9cQc 3d4c 6sTd Ah8c 9s6h Ks7h"));
  }

  @Test
  public void test_texas_holdem_9246_3hAsQcQdTd_Qh5h_KhTh_Jc5s_9d8d() {
    assertEquals(
      "9d8d Jc5s KhTh Qh5h",
      Solver.process("texas-holdem 3hAsQcQdTd Qh5h KhTh Jc5s 9d8d"));
  }

  @Test
  public void test_texas_holdem_9247_2c3d9hAsJc_4c8s_QsKs_9cQd_Kc4d() {
    assertEquals(
      "4c8s Kc4d QsKs 9cQd",
      Solver.process("texas-holdem 2c3d9hAsJc 4c8s QsKs 9cQd Kc4d"));
  }

  @Test
  public void test_texas_holdem_9248_3h4h4sJdKs_5dTc_Ah3d() {
    assertEquals(
      "5dTc Ah3d",
      Solver.process("texas-holdem 3h4h4sJdKs 5dTc Ah3d"));
  }

  @Test
  public void test_texas_holdem_9249_4h5hAsKdQs_Ts7c_Kc7s_4cQd_Jc9d() {
    assertEquals(
      "Ts7c Jc9d Kc7s 4cQd",
      Solver.process("texas-holdem 4h5hAsKdQs Ts7c Kc7s 4cQd Jc9d"));
  }

}
